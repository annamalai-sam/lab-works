print "Enter your age : "
num = gets.chomp.to_i
puts num
ter = (num < 18) ? "You are Not eligible for Driving" : "You are Eligible for Driving"
puts ter
if num < 18
    puts "You are Not eligible for Driving"
elsif num == 18
    puts "You have to enroll for Driving..."
else 
    puts "You are Eligible for Driving"
end
unless (num < 18)
    puts "You are Eligible for Driving"
else
    puts "You are Not eligible for Driving"
end