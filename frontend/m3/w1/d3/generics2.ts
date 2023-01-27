// uso di più variabili di tipo
// funzione identity che accetta due parametri diversi -> posso usare due generics diversi T, U ed assegno due parametri diversi ad ogni parametro e ad ogni tipo restituito.
function identity<T, U> (value: T, message: U): T {
    console.log(message);
    return value;
}

// inizializzo una variabile chiamando la funzione identity ed assegno i tipi di dato per gli argomenti value e message
let returnNumber = identity<number, string>(100, 'Morgen');
let returnString = identity<string, string>('100', 'Hallo');
let returnBoolean = identity<boolean, string>(true, 'Tschüss');
// TS controlla il tipo di dati e restituisce un errore se ci sono conflitti
returnNumber = returnNumber * 100; // ok
// returnString = returnString * 100; // errore -> non mi lascia assegnare number a string
// returnBoolean = returnBoolean * 100; // errore -> non mi lascia assegnare number a boolean
