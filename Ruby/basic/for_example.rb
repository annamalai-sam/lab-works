my_array = ["Annamalai","Aswath","Haiden","Rishi","Santa"]
# my_array = []
if my_array.empty?
    puts "my_array is null"
else
    for i in 0..my_array.length-1 do
        puts "Name: #{my_array[i]}"
    end
end