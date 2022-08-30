students1 = ["Annamalai","Aswath","Musaraf"]
students2 = Array["Annamalai","Chithu","Kasi","Ismile","Santa","Rishi"]
students3 = Array.[]("Annamalai","Aswath","Haiden")
students4 = Array.new
students5 = Array.new(19)
students6 = Array.new(30, "Good Students")
students7 = Array(0..9)

# puts students5.length
# puts students5.size
# puts students7.first
# puts students7.last
# puts students3.take(2)
# puts students7.drop(2)
# puts students7[2]
# students2.pop
# students2.shift 
# students2.push("Vimal")
# students2.unshift("Annamalai")
# students3.delete("Abisha")

students3.delete_at(2)
students7.reverse
students7.include?("Good Students")
students7.join("0")
students7.uniq
students7.concat(3,4,5,6)


# puts "#{students1}"
# puts "#{students2}"
puts "#{students3}"
# puts "#{students4}"
# puts "#{students5}"
# puts "#{students6}"
# puts "#{students7}"