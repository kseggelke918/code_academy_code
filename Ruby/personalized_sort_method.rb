def alphabetize(arr, rev=false)
    arr.sort!
    if rev == true
      return arr.reverse!
    else 
      return arr
    end 
  end 
  
  numbers = [3, 64, 7, 2, 787]
  puts alphabetize(numbers)