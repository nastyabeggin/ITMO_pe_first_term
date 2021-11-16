""" программа осущетсвляет парсинг YAML и конвертацию в JSON
    с использованием регулярных выражений"""

import re


def from_yaml_to_json_with_regulars(filename, output_filename):
    with open(filename, 'r', encoding="UTF-8") as yaml_in, open(output_filename, "w", encoding="UTF-8") as json_out:
        flag_last = False
        a = yaml_in.readlines()
        json_out.write("{\n")
        for line in a:
            temp = re.findall(r"^\w+:", line)
            if len(temp) > 0:
                result = re.sub(r"^\w+:", " " * 2 + '"' + temp[0].rstrip(":") + '": [', line)
                json_out.write(result)
            temp = re.findall(r"\s+-", line)
            if len(temp) > 0:
                if "лекции" in line:
                    flag_last = True
                json_out.write("    {\n")
                temp = line.lstrip("  - ").rstrip(":\n")
                json_out.write(6 * " " + '"' + temp + '": {\n')
            temp = re.findall(r"^\s+.+: .+", line)
            if len(temp) > 0:
                temp_2 = temp[0].lstrip().split(":")
                temp_2[1] = temp_2[1].lstrip(" '").rstrip("'")
                if len(temp_2) == 3:
                    json_out.write(
                        ' ' * 8 + '"' + temp_2[0] + '": "' + temp_2[1] + ":" + temp_2[2].rstrip("'") + '",\n')
                elif "преподаватель" not in temp_2[0]:
                    json_out.write(' ' * 8 + '"' + temp_2[0] + '": "' + temp_2[1] + '",\n')
                else:
                    json_out.write(' ' * 8 + '"' + temp_2[0] + '": "' + temp_2[1] + '"\n')
                    if not flag_last:
                        json_out.write(6 * ' ' + '}\n' + "    },\n")
                    else:
                        json_out.write(6 * ' ' + '}\n' + "    }\n" + "  ]\n" + "}")
