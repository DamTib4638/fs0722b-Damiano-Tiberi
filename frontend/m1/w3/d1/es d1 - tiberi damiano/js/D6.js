/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato..
*/

/* SCRIVI QUI LA TUA RISPOSTA */

const area = function (l1, l2) {
    return l1*l2;
};
const areaResult = area(3, 4);
// console.log(areaResult);
console.log(area(2,2));

function areaRettangolo (l1, l2) {
    return l1*l2;
}

let areaRet = areaRettangolo(5, 7);
console.log(areaRet);

/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function crazySum (s1 = 0, s2 = 0) {
    if (s1===s2) {
        return (s1+s2)*3;
    }
    return s1+s2;
}

console.log(crazySum (46, 58));

/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

console.log(crazyDiff(20));
function crazyDiff (val = 0) {
    if (val > 19) {
        return (val-19)*3; // se devi calcolare il valore assoluto, usa Math.abs(val-19)
    }
    return 19-val;
}

/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function boundary (n) {
    if (20 <= n <= 100 || n == 400) {
        return true;
    }
    return false;
}

console.log(boundary(55));

/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function epify (str) {
    if (str.startsWith('EPICODE')) {
        return str;
    }
    return 'EPICODE'+str;
}
console.log(epify('XXX'));

/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/

/* SCRIVI QUI LA TUA RISPOSTA */
function check3and7(p) {
    if ((p % 3 === 0 || p % 7 === 0) && p > 0) {
        return true;
    }
    return false;
}
let multiplo = check3and7(63);
console.log(multiplo);

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function reverseString (str) {
    let stringa = str.split('');
    let controStringa = stringa.reverse();
    let finale = controStringa.join('');
    return finale;
}

console.log(reverseString('EDOCIPE'));

/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function upperFirst(str) {
    
    
    
}
let stringa2 = 'ciao luca';
console.log(upperFirst(stringa2));


/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
function cutString(str) {
    return str.substring(1, str.length-1);
}

let stringa ='cciao lucaa';
console.log('esercizio 9');
console.log(cutString(stringa));


/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function giveMeRandom (n) {
    let array = [];
    if (n>0) {
        for (let i=0; i<n; i++) {
            array.push(Math.round(Math.random()*10));
        }
    }
    return array;
}

console.log(giveMeRandom(11));
