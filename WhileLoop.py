
#While loops always need a counter variable initialized before starting the loop
i = 0
#While loops are really flexible, need to remember to include end for loops
while 50 > i:
    print(i)
    i += 1
else:
    print('Done with all proccesses.')

#Without the break, the loop will never stop
while True:
    response = input('Say something: ')
    if(response == 'bye'):
        print('Goodbye!')
        break
