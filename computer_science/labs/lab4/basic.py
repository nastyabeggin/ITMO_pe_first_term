""" программа осущетсвляет парсинг YAML и конвертацию в JSON
    без использования сторонних библиотек и регулярных выражений"""


def from_yaml_to_list(file_name):
    with open(file_name, "r") as file:
        first_data = file.read().split('\n')
        result = ''
        result += '{ \n'
        main_map = {}
        main_key = ''  # день недели
        key_now = -1
        for i in first_data:  # парсинг данных
            st = i.lstrip().rstrip()
            if st.count(':') == 1:
                key, value = st.split(':')
                if '-' not in key and len(value) == 0:
                    main_map[key] = []
                    main_key = key
                elif '-' in key:
                    temp = key.lstrip("- ")
                    main_map[main_key].append({temp: {}})
                    key_now += 1  # номер пары
                    key_now_name = temp  # название пары
                else:
                    value = value.lstrip().rstrip()
                    if "'" in value:
                        value = value.lstrip("'").rstrip("'")
                    main_map[main_key][key_now][key_now_name][key] = value  # обращение к конкретной паре
            elif st.count(':') == 2:  # исключительный случай для времени, так как есть два двоеточия
                key, time_1, time_2 = st.split(':')
                value = time_1 + ':' + time_2
                value = value.lstrip().rstrip()
                if "'" in value:
                    value = value.lstrip("'").rstrip("'")
                main_map[main_key][key_now][key_now_name][key] = value

    return [main_map, main_key]


def from_list_to_json(main_map, main_key, output_filename):
    level = 2  # количество пробелов
    with open(output_filename, "w") as file2:
        number = 0
        file2.write("{\n")
        file2.write(level * ' ' + '"' + main_key + '": [\n')
        level += 2
        file2.write(level * ' ' + "{\n")
        level += 2
        for i in main_map[main_key]:
            for key1 in i.keys():
                file2.write(level * ' ' + '"' + key1 + '": {\n')
                temp_map = main_map[main_key][number][key1]
                number += 1
                level += 2
                for key2 in temp_map.keys():
                    file2.write(level * ' ' + '"' + key2 + '": ')
                    if key2 != 'преподаватель':
                        file2.write('"' + temp_map[key2] + '", \n')
                    else:
                        file2.write('"' + temp_map[key2] + '"\n')
                level -= 2
                file2.write(level * ' ' + "}\n")
                level -= 2
                if key1 != 'математика(лекции)':
                    file2.write(level * ' ' + "},\n")
                    file2.write(level * ' ' + "{\n")
                else:
                    file2.write(level * ' ' + "}\n")
                    level -= 2
                    file2.write(level * ' ' + "]\n")
                    level -= 2
                    file2.write(level * ' ' + "}\n")

                level += 2
