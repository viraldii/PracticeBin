
isMagician = False
isExpert = True

#check if magician AND expert: "You are a master magician"
if isMagician and isExpert:
    print('You are a master magician')

#check if magician but not expert: "at least you're getting there"
elif isMagician and not isExpert:
    print('At least you are getting there')
#if you're not a magician: "You need magic powers
else:
    print('You need magic powers')