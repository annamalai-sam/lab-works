require "active_record"
require "./insert_data.rb"
require "date"
class Todo < ActiveRecord::Base
    def due_today?
        due_date == Date.today
    end
    def to_displayable_string
        display_status = completed ? "[X]" : "[]"
        display_date = due_today? ? nil : due_date
        "Id : #{id} => #{display_status} #{todo_text} #{display_date}"
    end
    def self.to_displayable_list
        all.map do|todo| 
            "#{todo.to_displayable_string}"
        end
    end
    def self.add_task(new_hash)
        todo_text = new_hash[:todo_text]
        due_in_days = new_hash[:due_in_days]
        due_date = Date.today + due_in_days
        insert_into_table(todo_text, due_date)
    end
    def self.mark_as_completed(todo_id)
        mac = Todo.find(todo_id)
        mac.completed = true
        mac.save
    end
end