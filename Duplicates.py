
#Exercise: Check for duplicates in list:

duplicateList = ['a', 'b', 'c',
                 'b', 'd', 'm',
                 'n', 'n']

duplicate = []

for v in duplicateList:
    #check how many of a value is in an list
    if duplicateList.count(v) > 1:
        if v not in duplicate:
            duplicate.append(v)

print(duplicate)

