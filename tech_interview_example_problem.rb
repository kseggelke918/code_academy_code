# Input:
# flight_length: duration of the flight in minutes
# movies: array of movie times in minutes
# Output
# boolean, true if there exists TWO different movies that add up EXACTLY to the flight_length
# Examples:
# flight_length 160
# movies [80, 110, 40] => false
# [80, 110, 80] => true
# [20, 30, 110, 40, 50] => true

# Big O notation
# let n be the length of the movie_array
# O(1) - constant 
# O(n) - linear
# O(n^2) - quadratic
# O(2^n) - exponential
def movie_time(flight_length, movie_array)
	movie_hash = {}
	movie_array.each do |m|
		target = flight_length - m

		# looking for the target
		if movie_hash[target]
			return true 
		end 
		movie_hash[m] = "anything"
	end  
	return false

end 

movie_time(160, [80, 20, 60, 100])