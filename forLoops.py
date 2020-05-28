user = {
    'name': 'Golem',
    'age': 4000,
    'canSwim': False
}

print(user)
#iterable items include: List, Dictionaries, Tuples,
#Sets, Strings
#Print Key and value within the Object
for item in user.items():
    print(item)

#Prints all the values in the Object
for item in user.values():
    #tuple unpacking
    kay, value = item
    print(item)

#Prints all the keys in the Object
for item in user.keys():
    print(item)

for i in (1,2,3,4,5,6):
    for x in['a','b','c']:
        print(4,x)

