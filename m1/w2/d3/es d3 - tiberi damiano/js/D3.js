/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 1');
let numeroUno = Number(prompt('Inserisci un numero'));
let numeroDue = Number(prompt('inserisci un altro numero'));
if (numeroUno > numeroDue) {
  console.log('Il numero ' + numeroUno + ' è il maggiore tra i due numeri');
} else if (numeroUno < numeroDue) {
  console.log('Il numero ' + numeroDue + ' è il maggiore tra i due numeri');
} else {
  console.log('I due numeri confrontati sono uguali');
}

/* ESERCIZIO 2
  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 2');
let cinque;
console.log(cinque = (25 != 5) ? 'not equal' : 'Il numero è 5');
// cinque = 25;
// if (cinque != 5) {
//   console.log('not equal');
// } else {
//   console.log('Il numero fornito è 5');
// }

/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 3');
let numeroFornito;
console.log(numeroFornito = (25 % 5 == 0) ? 'divisibile per 5' : 'Il numero non è divisibile per 5');
// numeroFornito = 25;
// if ((numeroFornito % 5) == 0) {
//   console.log('divisibile per 5');
// } else {
//   console.log('Il numero non è divisibile per 5');
// }


/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 4');
let interoUno = Number(prompt('Inserisci un intero'));
let interoDue = Number(prompt('Inserisci un altro intero'));
if(interoUno == 8 || interoDue == 8 || (interoUno + interoDue == 8) || (interoUno - interoDue == 8) || (interoDue - interoUno == 8)) {
  console.log('Uno dei due numeri è 8 oppure è 8 la loro somma o la loro differenza');
} else {
  console.log('Nessuno dei due numeri è 8 e nemmeno la loro somma o la loro differenza fa 8');
}

/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 5');
let totalShoppingCart = 30;
const COSTO_SPEDIZIONE = 10;
if (totalShoppingCart > 50) {
  console.log('Hai diritto alla spedizione gratuita in quanto il tuo totale supera i 50€');
  console.log('Il costo attuale totale del tuo carrello è ' + totalShoppingCart);
} else {
  console.log('Il totale del tuo carrello NON supera i 50€. Per usufruire della spedizione gratuita, ti mancano ' + (50.01-totalShoppingCart) + '€');
  console.log('Il costo attuale del tuo carrello è ' + (totalShoppingCart+COSTO_SPEDIZIONE));
}


/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 6');
let scontoAcquisitoBlackFriday = totalShoppingCart*20/100;
totalShoppingCart -= scontoAcquisitoBlackFriday;
if (totalShoppingCart > 50) {
  console.log('Hai diritto alla spedizione gratuita in quanto il tuo totale supera i 50€');
  console.log('Il costo attuale totale del tuo carrello è ' + totalShoppingCart);
} else {
  console.log('Il totale del tuo carrello NON supera i 50€. Per usufruire della spedizione gratuita, ti mancano ' + (50.01-totalShoppingCart) + '€');
  console.log('Il costo attuale del tuo carrello è ' + (totalShoppingCart+COSTO_SPEDIZIONE));
}

/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 7');
let a = 58;
let b = 5;
let c = 46;
let ordinato = [];
console.log('Abbiamo le tre variabili di partenza: ');
console.log('a = ' + a);
console.log('b = ' + b);
console.log('c = ' + c);
if (a > b) {
  if (a > c) {
    ordinato[0] = a;
    if (b >= c) {
      ordinato[1] = b;
      ordinato[2] = c;
    } else {
      ordinato[1] = c;
      ordinato[2] = b;
    }
  } else if (a < c) {
    ordinato[0] = c;
    ordinato[1] = a;
    ordinato[2] = b;
  } else {
    ordinato[0] = a;
    ordinato[1] = c;
    ordinato[2] = b;
  }
} else if (a < b) {
  if (b > c) {
    ordinato[0] = b;
    if (a >= c) {
      ordinato[1] = a;
      ordinato[2] = c;
    } else {
      ordinato[1] = c;
      ordinato[2] = a;
    }
  } else if (b < c) {
    ordinato[0] = c;
    ordinato[1] = b;
    ordinato[2] = a;
  } else {
    ordinato[0] = b;
    ordinato[1] = c;
    ordinato[2] = a;
  }
} else if (a == b) {
  if (a >= c) {
    ordinato[0] = b;
    ordinato[1] = c;
    ordinato[2] = a;
  } else {
    ordinato[0] = b;
    ordinato[1] = c;
    ordinato[2] = a;
  }
}
console.log('Inumeri in ordine decrescente sono: ' + ordinato);

/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 8');
let variabile = 'VARIABILE';
console.log('La variabile ' + variabile + ' è di tipo ' + typeof(variabile));
let variabile2 = 55;
console.log('La variabile ' + variabile2 + ' è di tipo ' + typeof(variabile2));
let variabile3 = true;
console.log('La variabile ' + variabile3 + ' è di tipo ' + typeof(variabile3));
if (typeof(variabile) === 'string') {
  console.log('è una stringa');
} else if (typeof(variabile) === 'number') {
  console.log('è un numero');
} else if (typeof(variabile) === 'boolean') {
  console.log('è un booleano');
}

/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 9');
let verificaPariDispari = 58;
if (verificaPariDispari % 2 == 0) {
  console.log('Il numero è pari');
} else {
  console.log('Il numero è dispari');
}

/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  let val = 7
  if (val < 10) {
      console.log("Meno di 10");
    } else if (val < 5) {
      console.log("Meno di 5");
    } else {
      console.log("Uguale a 10 o maggiore");
    }
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 10');
let val = 30;
if (val < 10) {
  console.log('Meno di 10');
  if (val < 5) {
    console.log('Meno di 5');
  }
} else {
  console.log('Uguale a 10 o maggiore');
}

/* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".
*/

const me = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
}


/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 11');
me.city = 'Toronto';
console.log(me);


/* ESERCIZIO 12
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 12');
delete me.lastName;
console.log(me);

/* ESERCIZIO 13
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 13');
delete me.skills[2];
console.log(me);

/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 14');
let arrayVuoto = [];
arrayVuoto[0] = 1;
arrayVuoto[1] = 2;
arrayVuoto[2] = 3;
arrayVuoto[3] = 4;
arrayVuoto[4] = 5;
arrayVuoto[5] = 6;
arrayVuoto[6] = 7;
arrayVuoto[7] = 8;
arrayVuoto[8] = 9;
arrayVuoto[9] = 10;
console.log(arrayVuoto);
let arrayVuoto2 = [];
let i;
for (i=0;i<10;i++) {
  arrayVuoto2[i] = i+1;
}
console.log(arrayVuoto2);

/* ESERCIZIO 15
  Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
console.log('Esercizio 15');
arrayVuoto[9] = 100;
console.log(arrayVuoto);
