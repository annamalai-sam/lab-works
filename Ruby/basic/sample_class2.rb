class Sample_class2   
    def my_methods(aswath)
        @@aswath = aswath
        return @@aswath
    end
end
aswath_kaja = Sample_class2.new()
puts aswath_kaja.my_methods("Aswath")