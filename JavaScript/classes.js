// creating instances: 

class Surgeon {
    constructor(name, department) {
      this.name = name;
      this.department = department;
    }
  }
  
  const surgeonCurry = new Surgeon('Curry', 'Cardiovascular')
  
  const surgeonDurant = new Surgeon('Durant', 'Orthopedics')
  // new keyword calls the constructor function
  // which instatiates a new Surgeon object