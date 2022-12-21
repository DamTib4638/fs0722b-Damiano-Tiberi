function getArray(items) {
    return new Array().concat(items);
}
let numberArray = getArray([5, 10, 15, 20]);
let stringheArray = getArray(['Ciao', 'Buongiorno', 'Salve']);
numberArray.push(25);
stringheArray.push('Bella pe te');
numberArray.push('Erore');
stringheArray.push(30);
console.log(numberArray);
console.log(stringheArray);
function getArrayGenerics(items) {
    return new Array().concat(items);
}
let numberArray2 = getArrayGenerics([5, 10, 15, 20]);
numberArray2.push(25);
let stringheArray2 = getArrayGenerics(['Ciao', 'Buongiorno', 'Salve']);
stringheArray2.push('35');
