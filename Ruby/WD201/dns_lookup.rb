def get_command_line_argument

    if ARGV.empty?
    puts "Usage: ruby lookup.rb <domain>"
    exit
    end
    ARGV.first
end

domain = get_command_line_argument

file = File.open("A:\annamalai.shanmugam__lab\Ruby\WD201")
dns_raw = File.readlines("zone")




dns_records = parse_dns(dns_raw)
lookup_chain = [domain]
lookup_chain = resolve(dns_records, lookup_chain, domain)
puts lookup_chain.join(" => ")