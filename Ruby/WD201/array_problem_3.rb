todos = [["Send invoice", "money"],["Clean room", "organize"],["Pay rent", "money"],["Arrange books", "organize"],["Pay taxes", "money"],["Buy groceries", "food"]]
category1 = []
todos.each do
    |x|
    category1.push(x[1])
    end
category = category1.uniq
final_list = []
category.each do 
    |x|
    category_names_temp = x
    category_values_temp = []
    puts x+":"
    todos.each do 
        |y|
        if x == y[1]
            puts "     "+y[0]
            category_values_temp.push(y[0])
        end
    end
    pre_final_list = [category_names_temp,category_values_temp]
    final_list.push(pre_final_list)
end
puts "\n Array Format : \n "
puts "\n #{final_list} \n \n"
final_list.each {|x| p x}