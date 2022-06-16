def generate_salutation(emails)
  if emails.length == 1
    "Hello #{emails[0]}!"
  elsif emails.length == 2
    "Hello #{emails[0]} and #{emails[1]}!"
  elsif emails.length > 2
    "Hello #{emails[0..-2].join(', ')}, and #{emails.last}!"
  end
end
recipients = [
  ["Srinath"],
  ["Jadeja", "Kambli"],
  ["Sachin", "Sidhu", "Kumble"],
  ["Sachin", "Sidhu", "Kumble","Jadeja", "Kambli",]
]

recipients.each do |emails|
  puts generate_salutation(emails)
end