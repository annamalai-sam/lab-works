def get_command_line_argument
    if ARGV.empty?
        puts "Usage: ruby lookup.rb <domain>"
        exit
    end
    ARGV.first
end
domain = get_command_line_argument
file = File.open("A:\\annamalai.shanmugam__lab\\Ruby\\WD201\\zone.txt")
dns_raw = File.readlines(file)

def parse_dns(dns_raw)
    raw_dns_single_line_list = dns_raw.filter do |line|
    first_char = line[0, 1]
    (first_char == "#" || line.length < 3) ? false : true
    end
    puts raw_dns_single_line_list
end

def resolve(dns_records, lookup_chain, domain)
end
puts dns_raw
puts "\n\n\n"
dns_records = parse_dns(dns_raw)
lookup_chain = [domain]
lookup_chain = resolve(dns_records, lookup_chain, domain)
# puts lookup_chain.join(" => ")