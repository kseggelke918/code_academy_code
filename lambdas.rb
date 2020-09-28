# Like procs, lambdas are objects. The similarities don’t stop there: 
# with the exception of a bit of syntax and a few behavioral quirks, 
# lambdas are identical to procs.

lambda { puts "Hello!" } 

# is just about the same as 

Proc.new { puts "Hello!" }

# syntax: 

lambda { |param| block }

#-----------------------------------------------------

strings = ["leonardo", "donatello", "raphael", "michaelangelo"]
# Write your code below this line!

symbolize = lambda {|x| x.to_sym}

# Write your code above this line!
symbols = strings.collect(&symbolize)
print symbols

my_array = ["raindrops", :kettles, "whiskers", :mittens, :packages]

# Add your code below!
symbol_filter = lambda {|x| x.is_a? Symbol}

symbols = my_array.select(&symbol_filter)
puts symbols