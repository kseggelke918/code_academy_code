# You can think of a module as a toolbox that contains a set methods and constants. 
# There are lots and lots of Ruby tools you might want to use, but it would clutter 
# the interpreter to keep them around all the time. For that reason, we keep a 
# bunch of them in modules and only pull in those module toolboxes when we need 
# the constants and methods inside!

# You can think of modules as being very much like classes, only modules can’t 
# create instances and can’t have subclasses. They’re just used to store things!

# It doesn’t make sense to include variables in modules, since variables 
# (by definition) change (or vary). Constants, however, are supposed to always stay 
# the same, so including helpful constants in modules is a great idea.

# Ruby doesn’t make you keep the same value for a constant once it’s initialized, 
# but it will warn you if you try to change it. Ruby constants are written in 
# ALL_CAPS and are separated with underscores if there’s more than one word.

# An example of a Ruby constant is PI, which lives in the Math module and is 
# approximately equal to 3.141592653589793. 

module Circle

    PI = 3.141592653589793
    
    def Circle.area(radius)
      PI * radius**2
    end
    
    def Circle.circumference(radius)
      2 * PI * radius
    end
  end

puts Math::PI
puts Circle::PI
# these would give 2 different pies depending on which module they're coming from

# Some modules (like Math) are already present in the interpreter but others need to be 
# explicitely required

require 'module'
 # ex:

 require 'date' 
 puts Date.today

 # Can do more than just require a module, can also include it.  Any clss that 'includes'
 # a certain module an use that module's methods.  A benefit to this is that you wouldn't
 # need to prepend the constants and methods with the module name (like Circle::PI) and 
 # can simply put PI

 class Angle
    include Math
    attr_accessor :radians
    
    def initialize(radians)
      @radians = radians
    end
    
    def cosine
      cos(@radians)
    end
  end
  
  acute = Angle.new(1)
  acute.cosine

  # When a module is used to mix additional behavior and info into a class, 
  # it's call a 'mixin'.  ixins allow us to customize a class w/o having to rewrite code

# Where 'include' mixes in a module's methods at the instance level, 'extend' mixes in a 
# modules methods at the class level.  This means the class itself can use the methods 