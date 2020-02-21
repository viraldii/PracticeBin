# In this program we will obtain the users
# username and password and print

userN = input("Username: ")

passW = input("Password: ")

passS = '*' * len(passW)

# Print user name
print(f"{userN}, your password {passS}, "
      f"is {len(passW)} letters long.")
