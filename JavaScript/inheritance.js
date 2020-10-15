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




// class Doctor {
//     constructor(name, insurance) {
//       this._name = name;
//       this._insurance = insurance;
//       this._remainingVacationDays = 20;
//     }
  
//     takeVacationDays(days) {
//       this._remainingVacationDays = this._remainingVacationDays - days
//     }
//   }
  
//   class Nurse {
//     constructor(name, certifications) {
//       this._name = name; 
//       this._certifications = certifications
//       this._remainingVacationDays = 20
//     }
  
//     takeVacationDays(days) {
//       this._remainingVacationDays = this._remainingVacationDays - days
//     }
  
//     addCertification() {
      
//     }
//   }