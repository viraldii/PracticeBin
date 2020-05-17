#Dictionary

#Can be used when list of items dont need to be ordered.
user = {
        'age' : [1,2,3],
        'username' : "John",
        'greet' : 'hello'
    }
#Dictionary keys are inmutable

#get method dictionaries
print(user.get('age'))
#if get has no value computer returns new
print(user.get('password'))

user2 = dict(name ='Johna')
print(user2)







