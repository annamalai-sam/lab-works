todos = [["Send invoice", "money"],["Clean room", "organize"],["Pay rent", "money"],["Arrange books", "organize"],["Pay taxes", "money"],["Buy groceries", "food"]]
category1 = []
final_hash = {}
todos.each do
    |x|
    category1.push(x[1])
    end
category = category1.uniq
# puts category
final_list = {}
category.each do 
    |x|
    category_names_temp = x.to_sym
    category_values_temp = []
    todos.each do 
        |y|
        if x == y[1]
            category_values_temp.push(y[0])
        end
    end
    # pre_final_list = [category_names_temp,category_values_temp]
    final_list[category_names_temp]= category_values_temp
end
puts final_list
# puts "\n #{final_list} \n \n"
# final_list.each do 
#     |x|
#     # p x
#     p x.first
#     p x.last
# end
