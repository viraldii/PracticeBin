

#By enumerating with two variables
for i,char in enumerate('enumerate'):
    print(1,char)

for i,c in enumerate(list(range(100))):
    print(i,c)
    if c == 50:
        #F is to make the print be able to format the i to a value.
        print(f'Index of 50 is: {i}')