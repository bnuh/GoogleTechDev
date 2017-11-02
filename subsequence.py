#The Challenge
#Given a string S and a set of words D, find the longest word in D that is a subsequence of S.
#Word W is a subsequence of S if some number of characters, possibly zero, can be deleted from S to form W, without reordering the remaining characters.
#Note: D can appear in any format (list, hash table, prefix tree, etc.

def is_sub (s,d):
    for word in sorted(d, key=len, reverse=True):
        ind = -1
        flag = False
        for i in range(len(word)):
            if word[i] not in s or i <= ind:
                flag = True
            if flag:
                break
            elif (i + 1) == len(word):
                return word
        
s = "abppplee"
d = ["able", "ale", "apple", "bale", "kangaroo"]

print(is_sub(s,d))