// CREATING INSTANCES: 

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


// METHODS & GETTERS:

class Dog {
    constructor(name) {
      this._name = name;
      this._behavior = 0;
      // _ indicates these properties shouldn't be accessed directly
    }
  
    //getter - needs the get keyword
    get name() {
      return this._name;
    }
  
    //getter
    get behavior() {
      return this._behavior;
    }
  
    //method
    incrementBehavior() {
      this._behavior++;
    }
  }

  // EXAMPLE OF GETTER AND METHOD:

  class Surgeon {
    constructor(name, department) {
      this._name = name;
      this._department = department;
      this._remainingVacationDays = 20;
    }
  
    get name() {
      return this._name
    }
  
    get department() {
      return this._department
    }
  
    get remainingVacationDays() {
      return this._remainingVacationDays
    }
  
    takeVacationDays(daysOff) {
      this._remainingVacationDays = this._remainingVacationDays - daysOff
      return this._remainingVactionDays
    }
  }
  
  const surgeonCurry = new Surgeon('Curry', 'Cardiovascular');
  const surgeonDurant = new Surgeon('Durant', 'Orthopedics');