function identity(value, message) {
    console.log(message);
    return value;
}
let returnNumber = identity(100, 'Morgen');
let returnString = identity('100', 'Hallo');
let returnBoolean = identity(true, 'Tschüss');
returnNumber = returnNumber * 100;
