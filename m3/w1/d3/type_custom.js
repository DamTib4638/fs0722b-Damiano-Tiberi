let multiType;
multiType = 20;
multiType = true;
function add(x, y) {
    if (typeof x === 'number' && typeof y === 'number') {
        return x + y;
    }
    if (typeof x === 'string' && typeof y === 'string') {
        return x.concat(y);
    }
    throw new Error('errore');
}
console.log(add('one', 'two'));
console.log(add(1, 2));
