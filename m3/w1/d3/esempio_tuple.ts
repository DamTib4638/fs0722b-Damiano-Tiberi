var myTupla = [10, 'Hello', 'World', 'TS']; // il tipo di dato viene dedotto
console.log(myTupla[0]);
console.log(myTupla[1]);
// per fare operazioni sulle tuple sono supportati i metodi degli array
console.log('numero elementi prima di push: ' + myTupla.length);    // ritorna la lunghezza della tupla
myTupla.push(12);                                                   // appende il valore alla tupla
console.log('numero elementi dopo il push: ' + myTupla.length);     // ritorna la lunghezza della tupla
// myTupla.push(true); // da errore
console.log('numero elementi prima di pop: ' + myTupla.length);     // ritorna la lunghezza della tupla
console.log(myTupla.pop() + 'pop dalla tupla');                     // appende il valore alla tupla
console.log('numero elementi dopo il pop: ' + myTupla.length);      // ritorna la lunghezza della tupla

// le tuple sono mutabili, possono aggiornare i valori
console.log('primo valore di tupla ' + myTupla[0]);
// update a tupla
myTupla[0] = 121;
console.log('primo valore della tupla modificato al valore ' + myTupla[0]);

// destrutturazione di una tupla
var a = [10, 'Hallo'];
var [b, c] = a;
console.log(b);
console.log(c);