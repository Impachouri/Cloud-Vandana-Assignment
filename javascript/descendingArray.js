const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function sortDescending(array) {
  const filteredArray = array.filter(value => value !== '');
  return filteredArray.sort((a, b) => b - a);
}

function processInput() {
  rl.question('Enter numbers separated by spaces (or type "exit" to quit): ', (input) => {
    if (input.toLowerCase() === 'exit') {
      rl.close();
    } else {
      const numbers = input.split(' ').map(Number);
      const sortedNumbers = sortDescending(numbers);
      console.log('Sorted in descending order: ' + sortedNumbers.join(' '));
      processInput();
    }
  });
}

processInput();
