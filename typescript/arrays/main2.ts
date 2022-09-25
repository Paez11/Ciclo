let fruits:string[] = ['Banana','Melon','lemon'];
console.log(fruits);
fruits.push('orange');
console.log(fruits);
//let fruit = fruits.pop(); //LIFO (push) last input first output
let fruit = fruits.shift(); // FIFO (push) first input first output
console.log(fruit);
console.log(fruits);
console.log('---------');

fruits.unshift('Strawberry');
console.log(fruits);