require "./connect_db.rb"
require "./todo.rb"

def create_new_todo
    puts "Todo text: "
    todo_text = gets.strip
    return nil if todo_text.empty?
    puts "How many days from now is it due? (in Integer Value)"
    due_in_days = gets.strip.to_i
    puts "Enter Todo Id:"
    todo_hash = {
        todo_text: todo_text,
        due_in_days: due_in_days
    }
    connect_db!
    if todo_hash
        new_todo = Todo.add_task(todo_hash)
        # puts new_todo
        # puts "New todo created with id #{todo_hash[:todo_id]}"
        puts "New todo created with id #{new_todo.id}"
        Todo.to_displayable_list
    end
end