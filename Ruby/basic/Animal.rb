class Animal
    attr_accessor "name",:age
end
obj = Animal.new
obj.name = "annamalai"
puts obj.name
obj.age = "nineteen"
puts obj.age
# puts Animal.class_variable_get(:@@name)