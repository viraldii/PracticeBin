# using this list,
basket = ["Banana", "Apples", "Oranges", "Blueberries"];

# 1. Remove the Banana from the list
basket.remove('Banana')
# 2. Remove "Blueberries" from the list.
basket.remove('Blueberries')
# 3. Put "Kiwi" at the end of the list.
basket.append('Kiwi')
print(basket)
# 4. Add "Apples" at the beginning of the list
basket.insert(0, "Apples")
# 5. Count how many apples in the basket
count = basket.count('Apples')
print(count)
#Sort list
basket.sort()
print(basket)
print('********')
print(basket)