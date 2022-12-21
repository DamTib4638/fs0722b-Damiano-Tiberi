// tipo unione descrive un valore che può essere di diversi tipi
// lo usiamo quando un valore non è sotto il nostro controllo (ad esempio, potrebbe essere sia string che number)
// non uso any per limitare i tipi possibili
let multiType: number | boolean;
multiType = 20;         // ok
multiType = true;       // ok
// multiType = 'twenty';   // non è valido

// ho valori che possono essere numeri o stringhe, se sono entrambi numeri somma, se sono entrambi stringhe concatena, altrimenti errore
function add(x:number | string, y:number | string) {
    if(typeof x === 'number' && typeof y === 'number') {
        return x+y;
    }
    if(typeof x === 'string' && typeof y === 'string') {
        return x.concat(y);
    }
    throw new Error('errore');
}

console.log(add('one', 'two'));     // return 'onetwo'
console.log(add(1, 2));             // return 3
// console.log(add('one', 2));         // return error
