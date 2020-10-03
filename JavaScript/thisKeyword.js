const robot = {
    model: '1E78V2', 
    energyLevel: 100,
    provideInfo() {
      return `I am ${this.model} and my current energy level is ${this.energyLevel}`
    }
  };
  
  console.log(robot.provideInfo())

  //THIS AND ARROW FUNCTIONS

  const goat = {
    dietType: 'herbivore',
    makeSound() {
      console.log('baaa');
    },
    diet: () => {
      console.log(this.dietType);
    }
  };
  
  goat.diet(); // Prints undefined

  /* 
  Arrow functions inherently bind, or tie, an already defined this 
  value to the function itself that is NOT the calling object. In the 
  code snippet above, the value of this is the global object, or an 
  object that exists in the global scope, which doesn’t have a dietType 
  property and therefore returns undefined.
  */