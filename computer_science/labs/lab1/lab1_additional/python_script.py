#!/usr/bin/python
#import sys
#a =sys.argv[::]
a = '11051375 lab0/kabuto3 11051397 lab0/kabuto3_31 \
   4446507 lab0/test \
   4446507 lab0/test_link \
  11051391 lab0/venomoth3 \
  11051392 lab0/wigglytuff8 \
lab0: \
  11051399 Copy_39 \
  11051375 kabuto3 \
  11051397 kabuto3_31 \
  11051376 numel3 \
  11051382 scolipede5 \
  11051387 sharpedo0 \
   4446507 test \
   4446507 test_link \
  11051391 venomoth3 \
  11051392 wigglytuff8 \
lab0/Copy_39: \
  11051384 bayleef \
  11051383 shuppet \
  11051386 snubbull \
  11051385 vileplume \
lab0/numel3: \
  11051377 cottonee \
  11051380 forretress \
  11051381 granbull \
  11051379 lanturn \
  11051400 lanturnwigglytuff \
  11051378 trubbish \
lab0/scolipede5: \
  11051384 bayleef \
  11051383 shuppet \
  11051386 snubbull \
  11051385 vileplume \
lab0/sharpedo0: \
  11051389 garchomp \
  11051398 garchompkabuto \
  11051388 natu \
  11051481 newlink 11051390 voltorb'

a = a.split()
d={}
for i in range(len(a)-1):
    if a[i].isdigit():
        temp = a[i+1].split("/")[-1]
        if a[i] in d:
            if temp not in d[a[i]]:
                d[a[i]].append(temp)
        else:
            d[a[i]] = [temp]
            
for i in d:
    if len(d[i]) >= 2:
        print("There are {} hard links to file with number {}. File names are ".format(len(d[i]), i), end = '')
        print(*d[i], sep=', ')
