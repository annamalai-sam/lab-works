books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
if books.length == authors.length
    for i in 0..authors.length
        p "#{authors[i]} Wrote #{books[i]}"
    end
end