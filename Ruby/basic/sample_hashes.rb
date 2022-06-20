color = {   
    "Rose" => "red",   
    "Lily" => "purple",   
    "Marigold" => "yellow",   
    "Jasmine" => "white"   
}
color["lotus"] = "pink"
puts "lotus is #{color["lotus"]} in color" 

library = {}
library["austen"] = ["Pride and Prejudice", "Sense and Sensibility"]
library["asimov"] = ["Robots of Dawn", "I, Robot"]

authors = library.keys
books = authors.map{|x| library[x]}
p authors
p books


=begin
elsif emails.length > 2
    "Hello #{emails[0..-2].join(', ')}, and #{emails.last}!"
=end