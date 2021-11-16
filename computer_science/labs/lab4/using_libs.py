""" программа осущетсвляет конвертацию YAML в JSON
    с использованием специальных библиотек"""
import yaml
import json


def from_yaml_to_json(filename, output_filename):
    with open(filename, 'r', encoding="UTF-8") as yaml_in, open(output_filename, "w", encoding="UTF-8") as json_out:
        yaml_object = yaml.safe_load(yaml_in)  # представление в форме словаря
        json.dump(yaml_object, json_out, ensure_ascii=False, sort_keys=True, indent=2)
