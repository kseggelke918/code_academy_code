let spaceship = {
    'Fuel Type' : 'Turbo Fuel',
    homePlanet : 'Earth'
  };
  
  // Write your code below
  function greenEnergy (obj) {
    obj['Fuel Type'] = 'avocado oil'
  }
  
  function remotelyDisable (obj) {
    obj['disabled'] = true 
  }
  
  greenEnergy(spaceship)
  remotelyDisable(spaceship)
  
  console.log(spaceship)
  
  // returns { 'Fuel Type': 'avocado oil',
    // homePlanet: 'Earth',
    // disabled: true }