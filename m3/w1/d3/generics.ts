// i generics sono un modo per indicare a funzioni/classi/interfacce ecc che tipo di dato si vuole usare al momento della chiamata
// funziona un po come il passaggio di argomenti ad una funzione, MA indica anche il tipo che deve aspettarsi alla chiamata
// quando li usiamo? -> ad esempio, quando abbiamo una gamma di dati diversi - quando usiamo quel tipo di dati in diversi punti
// i vantaggi? -> possibilità di riuso del codice - ridurre la necessità di fare ricorso al tipo any
function getArray(items: any[]): any[] {
    return new Array().concat(items);
}
// la funzione getArray genera un array di elementi di tipo any
// variabile numberArray che chiama la funzione getArray e passa dei valori
let numberArray = getArray([5, 10, 15, 20]);
let stringheArray = getArray(['Ciao', 'Buongiorno', 'Salve']);
numberArray.push(25);
stringheArray.push('Bella pe te');
numberArray.push('Erore');
stringheArray.push(30);

console.log(numberArray);       // 5, 10, 15, 20, 25, 'erore'
console.log(stringheArray);     // 'Ciao', 'Buongiorno', 'Salve', 'Bella pe te', 30
// posso stabilire il tipo di valore che l'array contiene e che quindi TS possa verificare che il tipo di dato sia rispettato
// GENERICS -> riscrivo la funzione getArray con i generics
function getArrayGenerics<T>(items: T[]):T[] {
    return new Array<T>().concat(items);
}
// i generics definiscono uno o più variabili di tipo -> identificano i tipi che vengono passati racchiusi tra <>
// T sta per Type, per questo si usa generalmente T
// viene passato alla prima dichiarazione e poi viene usato per popolare nelle altre dichiarazioni
// nella funzione getArrayGenerics uso T per specificare il tipo di parametri (1), il tipo restituito della funzione (2) e restituisce il nuovo array in output (3).
// per richiamare la funzione getArrayGenerics è sufficiente passare il <Type>
// -> getArrayGenerics<number> -> accetterà una matrice di valori number e restituirà una matrice di valori number
let numberArray2 = getArrayGenerics<number>([5, 10, 15, 20]);
numberArray2.push(25);          // ok
// numberArray2.push('ciao');      // errore
let stringheArray2 = getArrayGenerics<string>(['Ciao', 'Buongiorno', 'Salve']);
stringheArray2.push('35');      // ok
// stringheArray2.push(35);         // errore
// se si omette la variabile di tipo quando si chiama la funzione sarà TS a dedurlo
// funziona solo su tipi di dati semplici (number, string, boolean, null, undefined); se passo array o oggetti -> restituisce any
