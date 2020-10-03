let spaceship = {
    passengers: null,
    telescope: {
      yearBuilt: 2018,
      model: "91031-XLT",
      focalLength: 2032 
    },
    crew: {
      captain: { 
        name: 'Sandra', 
        degree: 'Computer Engineering', 
        encourageTeam() { console.log('We got this!') },
       'favorite foods': ['cookies', 'cakes', 'candy', 'spinach'] }
    },
    engine: {
      model: "Nimbus2000"
    },
    nanoelectronics: {
      computer: {
        terabytes: 100,
        monitors: "HD"
      },
      'back-up': {
        battery: "Lithium",
        terabytes: 50
      }
    }
  }; 
   // both of these capFave constants will work
  const capFave = spaceship['crew']['captain']['favorite foods'][0]
  
  // const capFave = spaceship.crew.captain['favorite foods'][0]
  
  spaceship['passengers'] = [{sally:{name: 'Sally'}}, {neil:{name: 'Neil'}}]
  
  // both of these constants get the same result
  const firstPassenger = spaceship['passengers'][0]
  
  // const firstPassenger = spaceship.passengers[0]
  
  console.log(firstPassenger)