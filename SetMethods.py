

mySet = {1,2,3,4,5}
yourSet={4,5,6,7,8}

#Detect diffirence in sets
print(mySet.difference(yourSet))

#Discard remove an element from the set if it exist in it.
print(mySet.discard(1))
#Print
print("Set without number three: ")
print(mySet)

#Union method combines both sets together.
print("Placing together both sets without repetition: ")
print(mySet.union(yourSet))

#