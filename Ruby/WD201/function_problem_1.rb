def salute(name,word)
    name_array = name.split(" ")
    msg = "#{word.capitalize()} Mr. #{name_array.last}"
end
puts salute("Nelson Rolihlahla Mandela", "hello")
puts salute("Sir Alan Turing", "welcome")