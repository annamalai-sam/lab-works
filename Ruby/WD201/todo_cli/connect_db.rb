require 'active_record'

def connect_db!
    ActiveRecord::Base.establish_connection(
    host: 'localhost', 
    adapter: 'mysql2',
    database: 'Todo_List', 
    user: 'root', 
    password: 'AnnaMalai@19'
    )
end