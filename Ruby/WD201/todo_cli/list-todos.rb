require './connect_db.rb'
require './todo.rb'
require "./add-todo.rb"
require "./complete-todo.rb"
connect_db!
puts "This is Simple Todo CLI program: \n Enter Task to Continue... \n Press [n] to create a new task, [f] to mark a task as completed and [l] to list all Tasks"
command = gets.strip.downcase

if command == "n"
    create_new_todo
elsif  command == "f"
    start_mark_as_complete
# elsif  command == "p"
#     output_todo = Todo.to_displayable_list
#     puts output_todo
elsif  command == "l"
    output = Todo.to_displayable_list
    puts output
end

# create_new_todo if command == "c"
# start_mark_as_complete if command == "m"
# if command == "p"
#     output_todo = Todo.to_displayable_list
#     puts output_todo
# elsif command == "l"
#     output = Todo.to_displayable_list
#     puts output
# end    