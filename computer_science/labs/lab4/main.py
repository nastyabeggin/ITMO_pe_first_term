from basic import from_list_to_json, from_yaml_to_list
from using_libs import from_yaml_to_json
from using_regulars import from_yaml_to_json_with_regulars


filename = "file.yaml"
temp_data = from_yaml_to_list(filename)
from_list_to_json(*temp_data, "src/basic.json")

from_yaml_to_json("file.yaml", "src/using_lib.json")
with open("src/using_lib.json", "r", encoding="UTF-8") as file:
    a = file.read()
    print(a)

from_yaml_to_json_with_regulars("file.yaml", "src/regulars.json")
with open("src/regulars.json", "r", encoding="UTF-8") as file:
    a = file.read()
    print(a)
