def hamming(message):
    bits = list(message)
    bits = [int(i) for i in bits]
    s1 = bits[0] ^ bits[2] ^ bits [4] ^ bits[6]#control sum check
    s2 = bits[1] ^ bits[2] ^ bits [5] ^ bits[6]
    s3 = bits[3] ^ bits[4] ^ bits [5] ^ bits[6]
    ans = ""
    if [s1, s2, s3] != [0, 0, 0]:
        res = '' 
        mistake = int(str(s3) + str(s2) + str(s1), 2) - 1 #mistake position 
        for i in range(len(bits)):
            if i != mistake:
                res += str(bits[i])
            else:
                res += str((bits[i] + 1) % 2) #reverse operation
        for i in range(len(res)):
            if i not in [0, 1, 3]:
                ans += res[i]
        return "There was a mistake in {} bit".format(mistake + 1) + "\nCorrect information bits are {}".format(ans)
        return res 
    else:
        for i in range(len(message)):
            if i not in [0, 1, 3]:
                ans += res[i]
        return "The message is correct. Information bits are {}".format(ans)


print(hamming("1010010"))
