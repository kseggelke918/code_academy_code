const animals = ['hippo', 'tiger', 'lion', 'seal', 'cheetah', 'monkey', 'salamander', 'elephant'];

const foundAnimal = animals.findIndex(a => {
  return a === 'elephant'
})

const startsWithS = animals.findIndex(a => {
  return a[0] === 's'
})