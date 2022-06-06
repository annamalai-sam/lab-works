class Sample_class

    attr_reader aswath

    def initialize
        @aswath = "aswath"
    end

    def set_no_of_color num 
        no_of_color = num
    end
    
    def aswath_kaja
        # object = Sample_class.new
        # puts object.@aswath

        puts self.aswath

    end    
    def get_no_of_color
        no_of_color 
    end

    def my_methods
        puts @@no_of_color
    end 

end   


# instance 1
obj = Sample_class.new
obj.aswath_kaja
# puts obj.set_no_of_color "Param 1"
# puts obj.get_no_of_color
# puts obj.my_methods