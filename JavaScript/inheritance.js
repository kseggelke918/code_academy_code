class HospitalEmployee {
    constructor(name) {
      this._name = name;
      this._remainingVacationDays = 20;
    }
    
    get name() {
      return this._name;
    }
    
    get remainingVacationDays() {
      return this._remainingVacationDays;
    }
    
    takeVacationDays(daysOff) {
      this._remainingVacationDays -= daysOff;
    }
  }

  // using **extends** keyword gives access to all of the methods in the parent
  class Nurse extends HospitalEmployee {
    constructor(name, certifications){
        // super keyword calls the constructor of the parent class
        // super(name) passes the name arg from the nurse class to the constructor
        // of the hospitalEmployee class where it will set the name

        // **** always call super BEFORE using this keyword when setting other properties
        // otherwise JS will throw a reference error - best practice is to put it
        // at the top of the constructor
      super(name)
      // this is a property that is not available in the parent class
      this._certifications = certifications
    }

    get certifications(){
        return this._certifications
      }
      
      addCertification(newCertification) {
        this._certifications.push(newCertification)
      }
  }
  
const nurseOlynyk = new Nurse('Olynyk', ['Trauma','Pediatrics']);
nurseOlynyk.takeVacationDays(5);
console.log(nurseOlynyk.remainingVacationDays);
nurseOlynyk.addCertification('Genetics')
console.log(nurseOlynyk.certifications)
  
  




