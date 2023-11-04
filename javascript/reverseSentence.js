const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverseWords(sentence) {
  const words = sentence.split(' ');
  const reversedWords = words.map(word => reverseWord(word));
  return reversedWords.join(' ');
}

function reverseWord(word) {
  return word.split('').reverse().join('');
}

function processInput() {
  rl.question('Enter a sentence (or type "exit" to quit): ', (input) => {
    if (input.toLowerCase() === 'exit') {
      rl.close();
    } else {
      const reversedSentence = reverseWords(input);
      console.log('Reversed sentence: ' + reversedSentence);
      processInput();
    }
  });
}

processInput();
