const robot = {
	model: 'SAL-1000',
  mobile: true,
  sentient: false,
  armor: 'Steel-plated',
  energyLevel: 75
};

// We’d like to grab the property names, otherwise known as keys, 
// and save the keys in an array which is assigned to robotKeys. 
// However, there’s something missing in the method call.
const robotKeys = Object.keys(robot);

console.log(robotKeys);

// return an array, but the array will contain more arrays that have 
// both the key and value of the properties in an object.
const robotEntries = Object.entries(robot)

console.log(robotEntries);

// newRobot will be a new object that has all the properties of robot 
// and the properties in the following object: 
// {laserBlaster: true, voiceRecognition: true}. Make sure that you are 
// not changing the robot object!
const robotCopy = Object.assign({}, robot)
const newRobot = Object.assign(robotCopy, {laserBlaster: true, voiceRecognition: true})

console.log(newRobot);