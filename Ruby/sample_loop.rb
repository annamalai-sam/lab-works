print "Enter a number : "
num =  gets.chomp.to_i
puts num
while num < 10 do
    puts num
    num+=1
end
loop do 
    puts num
    num+=1
    if num > 16
        break
    end
    puts "Do While loop ended"
end
for num  in 10..20 do 
puts num
end
    puts "num #{num}"
num.times do 
    puts num
    num+=1
end