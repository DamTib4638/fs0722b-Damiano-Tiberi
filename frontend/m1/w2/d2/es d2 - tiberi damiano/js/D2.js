/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 1:');
let variabileTestuale = 'Testuale';
let variabileNumerica = 46;
let variabileBooleana = false;
let array = [46, 58, 21];
let persona = {
  nome: 'Damiano',
  cognome: 'Tiberi',
  eta: 18,
  sesso: 'M'
};
console.log('In JS ci sono le scatole magiche, che si chiamano variabili, in cui poter inserire i dati. Quando si inserisce un dato in una scatola, questa può prendere uno dei super poteri che JS mette a disposizione. I super poteri si chiamano DataTypes e sono: STRINGA, NUMERO, BOOLEANO, ARRAY e OGGETTO. Ogni variabile può acquisire un solo super potere per ogni dato che possiede al suo interno ed è il dato stesso a consegnarle questo potere. Ad esempio: ');
console.log('La variabile variabileTestuale ' + variabileTestuale + ' ha il Datatype STRINGA');
console.log('La variabile variabileNumerica ' + variabileNumerica + ' ha il Datatype NUMERO');
console.log('La variabile variabileBooleana ' + variabileBooleana + ' ha il Datatype BOOLEANO');
console.log('La variabile array ' + array + ' ha il Datatype ARRAY');
console.log('La seguente variabile persona ha il Datatype OGGETTO');
console.log(persona);

/* ESERCIZIO 2
 Crea una variable chiamata "name" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 2');
let nome = 'Damiano';
console.log(nome);

/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 3');
let addizione = 12 + 20;
console.log(addizione);

/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 4');
let x = 12;

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "name" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 5');
nome = 'Tiberi';
console.log(nome);
const COGNOME = 'TIBERI';
console.log(COGNOME);
// COGNOME = 'tiberi';
// console.log(COGNOME);

/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 6');
let sottrazione = 4 - x;
console.log(sottrazione);

/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 7');
let name1 = 'john';
let name2 = 'John';
if (name1 == name2) {
  console.log('Variabili uguali');
} else {
  console.log('Le due variabili sono diverse, perchè JS è Case-Sensitive');
}

if (name1.toLowerCase == name2.toLowerCase) {
  console.log('Variabili uguali');
} else {
  console.log('non uguali');
}
