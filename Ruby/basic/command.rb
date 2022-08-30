def get_command_line_argument
    if ARGV.empty?
        puts "Usage: ruby lookup.rb <domain>"
        exit
    end
    ARGV.first
end
puts "Function Call"
puts get_command_line_argument