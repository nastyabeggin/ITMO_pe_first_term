import re

def smile(message):
    mySmile = r'(\s|\b)8-{\\($|\s)'
    return (len(re.findall(mySmile, message)))


def print_mySmile(smile):
    for i in smile:
        print(i)


#print(smile('message 8-{\\ ')) #answer 1
#print(smile('message 8-{<\ ^&))) 8&*&(&(*&^(* ')) #answer 0
#print(smile('dkfmdlkmfdlkmfldk 8-{\\kjijsdiojads lkajdlkaj 8-{\\ iakijsdkjnaskjnxaskjdh 8-{\\')) #answer 3
#print(smile('8-{\\8-{\\8-{\\8-{\\8-{\\ 8-{\\')) #answer 6
print(smile(input()))
print_mySmile(['∞', ' |', '⏟', '⁻'])
