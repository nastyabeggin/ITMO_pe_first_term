import re


def find_numbers(message):
    pattern = r'\d+'
    answer = message[::]
    while (re.search(pattern, message) != None):
        first = int(re.search(pattern, message).group(0))
        second = 3 * (first ** 2) + 5
        message = message.replace(str(first), '')
        answer = answer.replace(str(first), str(second))
    return answer


print(find_numbers("20 + 22 = 42")) #1205 + 1457 = 5297
print(find_numbers("shjdckljsadnclksdmc")) #shjdckljsadnclksdmc
print(find_numbers("1234567890")) #4572473625057156305
print(find_numbers("1 + 2 + 3 = 6")) #8 + 17 + 32 = 113
print(find_numbers("shjdckljsadnclksdmc 0 0 0 0 1525 ")) #shjdckljsadnclksdmc 5 5 5 5 6976880
