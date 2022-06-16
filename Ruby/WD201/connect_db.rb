require 'active_record'

def connect_db!
    ActiveRecord::Base.establish_connection(
    host: 'db.fwsa.in', 
    adapter: 'mysql2',
    database: 'rails_annamalai', 
    username: 'annamalai', 
    password: 'annamalai@2022'
    )
end
