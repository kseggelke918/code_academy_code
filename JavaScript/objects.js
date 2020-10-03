let spaceship = {
    'Fuel Type' : 'Turbo Fuel',
    homePlanet : 'Earth',
    color: 'silver',
    'Secret Mission' : 'Discover life outside of Earth.'
  };
  
  // Write your code below
  // update object
  spaceship['color'] = 'glorious gold'
  spaceship['numEngines'] = 7
  
  delete spaceship['Secret Mission']
  
  console.log(spaceship)