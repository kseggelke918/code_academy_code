# 1. favorite_book is set to nil, which is Ruby for “nothing.” 
# When you try to puts it to the screen, you get exactly that: nothing!
# 2. Now our variable is conditionally set to “Cat’s Cradle.” 
# Since the value of the variable was nothing before, Ruby goes ahead and sets it, 
# so you see “Cat’s Cradle” printed out.
# 3. We try conditional assignment again, this time with “Why’s (Poignant) Guide to Ruby.” 
# But wait! Our variable already has a value, “Cat’s Cradle,” so it stays set to that 
# value and that’s what we see printed out.
# 4. Finally, we use regular old assignment to tell Ruby to reset favorite_book to 
# “Why’s (Poignant) Guide to Ruby,” which it gladly does.

favorite_book = nil
puts favorite_book

favorite_book ||= "Cat's Cradle"
puts favorite_book

favorite_book ||= "Why's (Poignant) Guide to Ruby"
puts favorite_book

favorite_book = "Why's (Poignant) Guide to Ruby"
puts favorite_book