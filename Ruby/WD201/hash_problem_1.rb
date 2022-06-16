books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
authors_symbols = []
authors.each do |single|
    each = single.split(" ")
    each_symbols = each.first.downcase.to_sym
    # puts each_symbols
    authors_symbols.push(each_symbols)
end
final_hash = {}
authors_symbols.each_with_index do |key_item, key_index| 
    # puts key_item
    # puts key_index
    books.each_with_index do |value_item, value_index|
    # puts value_item
    # puts value_index
    if key_index==value_index
        final_hash[key_item] = value_item
    end
    end
end
puts final_hash