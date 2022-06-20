print "Enter your age : "
age =  gets.chomp.to_i
case age
when 0 .. 2
    puts "You are baby"
when 3 .. 6
    puts "You are little child"
when 7 .. 12
    puts "You are child"
when 13 .. 18
    puts "You are youth"
else
    puts "You are adult"
end