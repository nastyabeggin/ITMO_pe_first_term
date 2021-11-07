import re


def time_pattern(message): #HH:MM or HH:MM:SS
    pattern1 = r"(([0-1]{1}[0-9]{1})|([2]{1}[0-3]{1})):[0-5][0-9]:[0-5][0-9]"
    pattern2 = r"(([0-1]{1}[0-9]{1})|([2]{1}[0-3]{1})):[0-5][0-9]"
    res = (re.sub(pattern1, "(TBD)", message, count=0))
    res = (re.sub(pattern2, "(TBD)", res, count=0))
    return res


print(time_pattern("12:20:20")) #time is correct. (TBD)
print(time_pattern("35:20:20")) #time is incorrect. hours should be less than 24. 35:20:20
print(time_pattern("23:20:20")) #time is correct. (TBD)
print(time_pattern("23:20 13:10 16:00:00 35:00 12:78:00 13:79")) #(TBD) (TBD) (TBD) 35:00 12:78:00 13:79
print(time_pattern("Hello it's 12:20 o'clock. Specifically 12:20:09")) #Hello it's (TBD) o'clock. Specifically (TBD)







