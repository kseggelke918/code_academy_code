# Blocks are not objects, and this is one of the very few exceptions to the 
# “everything is an object” rule in Ruby.
# Because of this, blocks can’t be saved to variables and don’t have all the 
# powers and abilities of a real object. For that, we’ll need… procs!
# You can think of a proc as a “saved” block: just like you can give a bit 
# of code a name and turn it into a method, you can name a block and turn 
# it into a proc.

multiples_of_3 = Proc.new do |n|
    n % 3 == 0
  end
  
  print (1..100).to_a.select(&multiples_of_3)

# Procs are easy to define! You just call Proc.new and pass in the block you 
# want to save. Here’s how we’d create a proc called cube that cubes a number 
# (raises it to the third power):

cube = Proc.new { |x| x ** 3 }

# We can then pass the proc to a method that would otherwise take a block:

[1, 2, 3].collect!(&cube)
# ==> [1, 8, 27]
[4, 5, 6].map!(&cube)
# ==> [64, 125, 216]

# The & is used to convert the cube proc into a block 
# (since .collect! and .map! normally take a block).

floats = [1.2, 3.45, 0.91, 7.727, 11.42, 482.911]
# Write your code below this line!
round_down = Proc.new { |x| x.floor }
# .floor takes a float and rounds down to the nearest integer


# Write your code above this line!
ints = floats.collect(&round_down)
print ints

# Here at the amusement park, you have to be four feet tall
# or taller to ride the roller coaster. Let's use .select on
# each group to get only the ones four feet tall or taller.

group_1 = [4.1, 5.5, 3.2, 3.3, 6.1, 3.9, 4.7]
group_2 = [7.0, 3.8, 6.2, 6.1, 4.4, 4.9, 3.0]
group_3 = [5.5, 5.1, 3.9, 4.3, 4.9, 3.2, 3.2]

# Complete this as a new Proc
over_4_feet = Proc.new { |height| height >= 4 }

# Change these three so that they use your new over_4_feet Proc
can_ride_1 = group_1.select(&over_4_feet)
can_ride_2 = group_2.select(&over_4_feet)
can_ride_3 = group_3.select(&over_4_feet)

puts can_ride_1
puts can_ride_2
puts can_ride_3

# You can pass a Ruby method name around with a symbol.
# You can also convert symbols to procs using that handy little &.

strings = ["1", "2", "3"]
nums = strings.map(&:to_i)
# ==> [1, 2, 3]