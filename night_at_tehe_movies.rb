movies = {
    test: 3
  }
  
  puts "If you'd like to add a movie, type 'add'"
  puts "If you'd like to delete a movie, type 'delete'"
  puts "If you'd like to update a movie, type 'update'"
  puts "If you'd like to display all movies, type 'display'"
  
  choice = gets.chomp.downcase
  
  case choice
    when 'add'
      puts "Please enter a movie title: "
      title = gets.chomp.to_sym
      puts "Please enter a rating: "
      rating = gets.chomp.to_i
      if movies[title].nil?
        movies[title] = rating
        puts "Your movie was added!"
      else  
        puts "That movie already exists in the hash"
      end  
    when 'delete'
      puts "Please enter a title to be deleted: "
      title = gets.chomp.to_sym
      if movies[title].nil?
        puts "That movie doesn't exist"
      else 
        movies.delete(title)
        puts "The movie has been deleted"
      end 
    when 'update'
      puts "Please enter the title to be updated: "
      title = gets.chomp.to_sym
      if movies[title].nil?
        "That movie isn't on the list!"
      else 
        puts "Enter a new rating: "
        rating = gets.chomp.to_i
        movies[title] = rating
      end 
    when 'display'
      movies.each {|k, v| puts "#{k}: #{v}"} 
    else 
      puts "Error!"
  end 