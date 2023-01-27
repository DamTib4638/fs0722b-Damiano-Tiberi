/* ESERCIZIO 1
  Scrivi una funzione per concatenare due stringhe ricevute come parametri, selezionando solamente i primi 2 caratteri della
  prima e gli ultimi 3 della seconda. Converti la stringa risultante in maiuscolo e mostrala con un console.log().
*/

function esercizio1 (str1, str2) {
  let primiDue = str1.substring(0,2);
  let ultimiTre = str2.substring(str2.length-3, str2.length);
  let result = primiDue + ultimiTre;
  return result.toUpperCase();
}
/* PUOI USARE ANCHE SLICE */
console.log('esercizio 1');
console.log(esercizio1('lato', 'tempo'));

/* ESERCIZIO 2
  Scrivi una funzione per creare un array di soli valori DISPARI da 1 a 100.
 */

  function dispariCento () {
    let dispari = [];
    for (let i=1; i<=100; i++) {
      if (i % 2 === 1) {
        dispari.push(i);
      } 
    }
    return dispari;
  }
  console.log('esercizio 2');
  console.log('I numeri dispari tra 1 e 100 sono: ' + dispariCento());


/* ESERCIZIO 3
  Scrivi una funzione per creare un array di soli valori multipli di 5, da 1 a 100.
 */

  const multipliCinque = function () {
    let inFilaPerCinque = [];
    for (let i=1; i<=100; i++) {
      if (i % 5 === 0) {
        inFilaPerCinque.push(i);
      } 
    }
    return inFilaPerCinque;
  };
  const multipli = multipliCinque();
  console.log('esercizio 3');
  console.log('I numeri multipli di 5 tra 1 e 100 sono: ' + multipli);

/* ESERCIZIO 4
  Scrivi una funzione per creare un array di 10 elementi; ognuno di essi deve essere un valore random compreso tra 0 e 100 (incluso).
 */

  function arrayCasuale () {
    let arrCas = [];
    for (let i=0; i<10; i++) {
      arrCas.push(Math.round(Math.random()*100));
    }
    return arrCas;
  }
  let risultato = arrayCasuale();
  console.log('esercizio 4');
  console.log(`L'array di 10 elementi, con i numeri casuali tra 0 e 100, creato è: ${risultato}`);
  // ho usato l'interpolazione di stringhe.

/* ESERCIZIO 5
  Scrivi una funzione per ricavare solamente i valori PARI da un array composto da soli valori numerici.
 */
  let array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  function soloPari () {
    let pari = [];
    for (let numero of array) {
      if (numero % 2 === 0) {
        pari.push(numero);
      }
    }
    return pari;
  }

  console.log('esercizio 5');
  console.log('Il vettore di partenza è: ' + array);
  console.log('I numeri pari corrispondenti sono: ' + soloPari());

/* ESERCIZIO 6
  Scrivi una funzione per sommare a catena i numeri contenuti in un array.
 */

  function sommaACatena (arrayDaSommare) {
    let somma = 0;
    for (let numero of arrayDaSommare) {
      somma += numero;
    }
    return somma;
  }
  let totale = sommaACatena(array)
  console.log ('esercizio 6');
  console.log('La somma a catena è: ' + totale);

/* ESERCIZIO 7
  Scrivi una funzione per incrementare di 1 tutti i valori numerici in un array.
*/
// array
function incrementaArray (arrayDaIncrementare) {
  for (let i = 0; i < arrayDaIncrementare.length; i++) {
    arrayDaIncrementare[i]++;
  }
  return arrayDaIncrementare;
}

console.log('esercizio 7');
console.log('array incrementato: ' + incrementaArray(array));

/* ESERCIZIO 8
  Sostituisci ogni stringa contenuta in un array con un numero rappresentante la sua lunghezza.
  es.: ["EPICODE", "is", "great"] => [7, 2, 5]
*/

let arrayStringa = ['Ciao', 'Luca', 'sono', 'Damiano', 'Tiberi'];
function contaLettere (arrayDaContare) {
  let arrayLettere = [];
  for (let parola of arrayDaContare) {
    arrayLettere.push(parola.length);
  }
  return arrayLettere;
}
console.log('esercizio 8');
console.log('Le lettere dei campi sono: ' + contaLettere(arrayStringa));

/* ESERCIZIO 9 (EXTRA)
  Scrivi una funzione per eliminare solo i valori PARI da un array.
*/

function eliminaPari (array) {
  for (let i=0; i<array.length; i++) {
    if (array[i] % 2 === 0) {
      array.splice(i,1);
    }
  }
  return array;
}
console.log('esercizio 9');
console.log('array compromesso: ' + eliminaPari(array));

/* ESERCIZIO 10 (EXTRA)
  Scrivi una funzione per creare un array di 10 elementi; ognuno di essi deve essere un valore random compreso tra 0 e 10 (incluso), SENZA AMMETTERE DUPLICATI.
 */

const createRandomWithoutDuplicate = function () {
  let array = [];
  for (let i=0; i<10; i++) {
    let added = false;
    while (!added) {
      let numberToAdd = Math.ceil(Math.random()* 10);
      if(!array.includes(numberToAdd)) {
        array.push(numberToAdd);
        added = true;
      }
    }
  }
  return array;
}
console.log('esercizio 10');
console.log(createRandomWithoutDuplicate());

function arrayRandom () {
  let arrayNato = [];
  let numeroCasuale;
  let nonDoppione = true;
  let contatore = 0;
  while (contatore < 10) {
    numeroCasuale = Math.round(Math.random()*10);
    for (let i=0; i<10; i++) {
      if (arrayNato[i] === numeroCasuale) {
        nonDoppione = false;
        break;
      }
    }
    if (nonDoppione) {
      arrayNato.unshift(numeroCasuale);
      contatore++;
    } else {
      nonDoppione = true;
    }
  }
  return arrayNato;
}

console.log('esercizio 10');
console.log(arrayRandom());

/* ESERCIZIO 11 (EXTRA)
  Scrivi un algoritmo in grado di invertire un array.
  es: [1, 3, 5] ==> [5, 3, 1]
*/

let nuovoArray = [10, 20, 30, 40, 46, 50, 58, 60];
const inverso = function (arrayDaInvertire) {
  let arrayInverso = [];
  for (let elemento of arrayDaInvertire) {
    arrayInverso.unshift(elemento);
  }
  return arrayInverso;
}
/* PUOI USARE IL METODO REVERSE */
console.log('esercizio 11');
console.log('Risultato: ' + inverso(nuovoArray));

/* Questo array di film verrà usato negli esercizi a seguire. Non modificarlo e scorri oltre per riprendere gli esercizi :) */
const movies = [
  {
    Title: 'The Lord of the Rings: The Fellowship of the Ring',
    Year: '2001',
    imdbID: 'tt0120737',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings: The Return of the King',
    Year: '2003',
    imdbID: 'tt0167260',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings: The Two Towers',
    Year: '2002',
    imdbID: 'tt0167261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNGE5MzIyNTAtNWFlMC00NDA2LWJiMjItMjc4Yjg1OWM5NzhhXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of War',
    Year: '2005',
    imdbID: 'tt0399295',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTYzZWE3MDAtZjZkMi00MzhlLTlhZDUtNmI2Zjg3OWVlZWI0XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'Lords of Dogtown',
    Year: '2005',
    imdbID: 'tt0355702',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDBhNGJlOTAtM2ExNi00NmEzLWFmZTQtYTZhYTRlNjJjODhmXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings',
    Year: '1978',
    imdbID: 'tt0077869',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGMyNWJhZmYtNGQxYi00Y2ZjLWJmNjktNTgzZWJjOTg4YjM3L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1990',
    imdbID: 'tt0100054',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOTI2NTQyODk0M15BMl5BanBnXkFtZTcwNTQ3NDk0NA@@._V1_SX300.jpg',
  },
  {
    Title: 'The Lords of Salem',
    Year: '2012',
    imdbID: 'tt1731697',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjA2NTc5Njc4MV5BMl5BanBnXkFtZTcwNTYzMTcwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Greystoke: The Legend of Tarzan, Lord of the Apes',
    Year: '1984',
    imdbID: 'tt0087365',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM5MzcwOTg4MF5BMl5BanBnXkFtZTgwOTQwMzQxMDE@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1963',
    imdbID: 'tt0057261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGEwYTlhMTgtODBlNC00ZjgzLTk1ZmEtNmNkMTEwYTZiM2Y0XkEyXkFqcGdeQXVyMzU4Nzk4MDI@._V1_SX300.jpg',
  },
  {
    Title: 'The Avengers',
    Year: '2012',
    imdbID: 'tt0848228',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Infinity War',
    Year: '2018',
    imdbID: 'tt4154756',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Age of Ultron',
    Year: '2015',
    imdbID: 'tt2395427',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM4OGJmNWMtOTM4Ni00NTE3LTg3MDItZmQxYjc4N2JhNmUxXkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Endgame',
    Year: '2019',
    imdbID: 'tt4154796',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SX300.jpg',
  },
]

/* ESERCIZIO 12
  Scrivi una funzione per trovare il film più vecchio nell'array fornito.
*/
// movies
const antico = function (movies) {
  let filmAntico = movies[0];
  let annoMinore = movies[0].Year;
  for (let film of movies) {
    if (film.Year < annoMinore) {
      filmAntico = film;
    }
  }
  return filmAntico;
}

console.log('esercizio 12');
console.log(antico(movies));

/* ESERCIZIO 13
  Scrivi una funzione per ottenere il numero di film contenuti nell'array fornito.
*/

const numeroFilm = function (array) {
  return array.length;
}

console.log('esercizio 13');
console.log(numeroFilm(movies));

/* ESERCIZIO 14
  Scrivi una funzione per creare un array con solamente i titoli dei film contenuti nell'array fornito.
*/

function listaTitoli (array) {
  let titoliFilm = [];
  for (let titoli of array) {
    titoliFilm.push(titoli.Title);
  }
  return titoliFilm;
}
console.log('esercizio 14');
console.log(listaTitoli(movies));

/* ESERCIZIO 15
  Scrivi una funzione per ottenere dall'array fornito solamente i film usciti nel millennio corrente.
*/

function filtraMillennio (array) {
  let miniArray = [];
  for (let film of array) {
    if (film.Year > 2000) {
      miniArray.push(film);
    }
  }
  return miniArray;
  }
console.log('esercizio 15');
console.log(filtraMillennio(movies));

/* ESERCIZIO 16
  Scrivi una funzione per ottenere dall'array fornito uno specifico film (la funzione riceve un imdbID come parametro).
*/

function ottieniFilm (lista, id) {
  let film;
  for (let elemento of lista) {
    if (elemento.imdbID === id) {
      film = elemento;
    }
  }
  return film;
}
let ricerca = ottieniFilm(movies, 'tt0077869');
console.log('esercizio 16');
console.log('Il film richiesto è: ');
console.log(ricerca);

/* ESERCIZIO 17
  Scrivi una funzione per calcolare la somma di tutti gli anni in cui sono stati prodotti i film contenuti nell'array fornito.
*/

const sommaAnni = function (arr) {
  let somma = 0;
  for (let elemento of arr) {
    somma += Number(elemento.Year);
  }
  return somma;
}

console.log('esercizio 17');
console.log('La somma degli anni è: ' + sommaAnni(movies));
console.log(movies);

/* ESERCIZIO 18 (EXTRA)
  Scrivi una funzione per recuperare tutti i film dall'array fornito che contengono una parola fornita.
*/

function ricercaParola (array, parola) {
  let filtroFilm = [];
  let pos = -1;
  for (let movie of array) {
    pos = movie.Title.search(parola);
    if (pos > -1) {
      filtroFilm.push(movie);
      pos = -1;
    }
    pos = movie.Year.search(parola);
    if (pos > -1) {
      filtroFilm.push(movie);
      pos = -1;
    }
  }
  return filtroFilm;
}

console.log('esercizio 18');
console.log(ricercaParola(movies, '2005'));
