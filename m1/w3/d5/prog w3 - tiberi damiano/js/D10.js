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


/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

// JS Basics


/* NOTE GENERALI DEL FOGLIO:

    HO SPOSTATO PER COMODITà L'ARRAY PREDEFINITO IN CIMA ED HO INSERITO UN CONSOLE LOG CHE INDICA A QUALE ESERCIZIO CORRISPONDE UN CERTO RISULTATO OTTENUTO IN CONSOLE.
*/



/* ESERCIZIO A
  Crea una variabile chiamata "sum" e assegnaci il risultato della somma tra i valori 10 e 20.
*/

/* DEFINISCO UNA VARIABILE SUM E CI ESEGUO L'ADDIZIONE, SUCCESSIVAMENTE LA STAMPO IN CONSOLE */
let sum = 10 + 20;
console.log('Esercizio A');
console.log(sum);

/* ESERCIZIO B
  Crea una variabile chiamata "random" e assegnaci un numero casuale tra 0 e 20 (deve essere generato dinamicamente a ogni esecuzione).
*/

let random = Math.round(Math.random()*21); // NELLA VARIABILE RANDOM CI ANDRà UN VALORE COMPRESO TRA 0 E 20 INCLUSI
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio B');
console.log(random);

/* ESERCIZIO C
  Crea una variabile chiamata "me" e assegnaci un oggetto contenente le seguenti proprietà: name = il tuo nome, surname = il tuo cognome, age = la tua età.
*/

/* DEFINISCO UNA VARIABILE OGGETTO CHIAMATE 'ME' E INSERISCO LE PROPRIETà RICHIESTE */
let me = {
  nome: 'Damiano',
  cognome: 'Tiberi',
  anni: 35
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio C');
console.log(me);

/* ESERCIZIO D
  Crea del codice per rimuovere programmaticamente la proprietà "age" dall'oggetto precedentemente creato.
*/

/* CANCELLO PROPRIETà ANNI DALL'OGGETTO 'ME' COME RICHIESTO */
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
delete me.anni;
console.log('Esercizio D');
console.log(me);

/* ESERCIZIO E
  Crea del codice per aggiungere programmaticamente all'oggetto precedentemente creato un array chiamato "skills", contenente i linguaggi di programmazione che conosci.
*/

/* AGGIUNGO PROPRIETà SKILLS ALL'OGGETTO 'ME' COME RICHIESTO */
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
me.skills = ['HTML', 'CSS', 'Javascript', 'Java', 'Angular'];
console.log('Esercizio E');
console.log(me);

/* ESERCIZIO F
  Crea un pezzo di codice per aggiungere un nuovo elemento all'array "skills" contenuto nell'oggetto "me".
*/

/* AGGIUNGO ALLA LISTA DELLE SKILLS DELL'OGGETTO 'ME' UN NUOVO LINGUAGGIO, INSERENDOLO IN CODA ALL'ARRAY DELLE SKILLS */
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
me.skills.push('Typescript');
console.log('Esercizio F');
console.log(me);

/* ESERCIZIO G
  Crea un pezzo di codice per rimuovere programmaticamente l'ultimo elemento dall'array "skills" contenuto nell'oggetto "me".
*/

/* RIMUOVO DALLA CODA DELL'ARRAY SKILLS DELL'OGGETTO 'ME', COME RICHIESTO */
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
me.skills.pop();
console.log('Esercizio G');
console.log(me);

// Funzioni

/* ESERCIZIO 1
  Crea una funzione chiamata "dice": deve generare un numero casuale tra 1 e 6.
*/

/* DEFINISCO UNA FUNZIONE TRAMITE IL METODO DELLE COSTANTI IN CUI MI CALCOLO UN NUMERO RANDOM TRA 1 E 6, USANDO IL METODO RANDOM DELLA CLASSE MATH E IL METODO CEIL, IN MODO DA OTTENERE IL RANGE 1-6 */
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
const dice = function() {
  return Math.ceil(Math.random()*6);
}
console.log('Esercizio 1');
console.log(dice());

/* ESERCIZIO 2
  Crea una funzione chiamata "whoIsBigger" che riceve due numeri come parametri e ritorna il maggiore dei due.
*/

/* DEFINISCO UNA FUNZIONE SENZA IL METODO DELLE COSTANTI, MA ASSEGNANDOLE DIRETTAMENTE UN NOME, PASSANDO AD ESSA DUE PARAMETRI CHE, SE L'UTENTE NON INSERISCE, ACQUISISCONO IL VALORE DI DEFAULT = 0 */
/* ALL'INTERNO, CONFRONTO I NUMERI PER DECRETARNE IL MAGGIORE TRA I DUE */
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
function whoIsBigger(num1 = 0, num2 = 0) {
  if (num1>=num2) {
    return num1;
  }
  return num2;
}
console.log('Esercizio 2');
console.log(whoIsBigger(46, 38));

/* ESERCIZIO 3
  Crea una funzione chiamata "splitMe" che riceve una stringa come parametro e ritorna un'array contenente ogni parola della stringa.

  Es.: splitMe("I love coding") => ritorna ["I", "Love", "Coding"]
*/

/* FUNZIONE CHE PRENDE UN PARAMETRO STRINGA A CUI APPLICO IL METODO SPLIT SUDDIVIDENDO IN BASE AGLI SPAZI CHE TROVA */
const splitMe = function(str) {
  let parola = str.split(' ');
  /* OTTENGO UN'ARRAY FORMATO DALLE SINGOLE PAROLE CHE FORMANO LA STRINGA IN INGRESSO */
  return parola;
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 3');
console.log(splitMe('Luca è un bravissimo tutor'));

/* ESERCIZIO 4
  Crea una funzione chiamata "deleteOne" che riceve una stringa e un booleano come parametri.
  Se il valore booleano è true la funzione deve ritornare la stringa senza il primo carattere, altrimenti la deve ritornare senza l'ultimo.
*/

const deleteOne = function(str, bool) {
  if (bool) { // SE è VERO, STAMPO LA STRINGA IN INGRESSO SENZA LA PRIMA LETTERA ED ESCO DALLA FUNZIONE
    return str.slice(1);
  }
  return str.slice(0, str.length-1); // SE è FALSO, STAMPO LA STRINGA IN INGRESSO SENZA L'ULTIMA LETTERA ED ESCO
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 4');
console.log(deleteOne('Ciao a tutti', true));

/* ESERCIZIO 5
  Crea una funzione chiamata "onlyLetters" che riceve una stringa come parametro e la ritorna eliminando tutte le cifre numeriche.

  Es.: onlyLetters("I have 4 dogs") => ritorna "I have dogs"
*/

const onlyLetters = function(str) { // LA FUNZIONE RICEVE UNA STRINGA IN INGRESSO
  let risultato = ''; //DEFINISCO UNA VARIABILE STRINGA VUOTA
  for (let carattere of str) {
    /* PER OGNI CARATTERE DELLA STRINGA CONTROLLO SE ESSO è UN NUMERO E, SOLO SE NON LO è, CONCATENO NEL RISULTATO MANTENENDO L'ORDINE INIZIALE DELLA STRINGA, CHE RISULTA DEPURATA DAI NUMERI */
    if (carattere != '0' && carattere != '1' && carattere != '2' && carattere != '3' && carattere != '4' &&
      carattere != '5' && carattere != '6' && carattere != '7' && carattere != '8' && carattere != '9') {
        risultato += carattere; // QUI AVVIENE LA CONCATENAZIONE DEI SOLI CARATTERI PERMESSI
    }
  }
  return risultato;
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 5');
console.log(onlyLetters('C1ao'));

/* ESERCIZIO 6
  Crea una funzione chiamata "isThisAnEmail" che riceve una stringa come parametro e ritorna true se la stringa è un valido indirizzo email.
*/

function isThisAnEmail(email) {
  if (email == '') { // SE IL PARAMETRO IN INGRESSO è VUOTO, LA MAIL NON è VALIDA
    return false;
  }
  /* HO TROVATO ONLINE QUESTA ESPRESSIONE REGOLARE CHE VIENE USATA PER CONVALIDARE UN CORRETTO INDIRIZZO MAIL */
  /* SE L'EMAIL INSERITA SUPERA IL TEST DI QUESTA ESPRESSIONE REGOLARE, ALLORA è UNA MAIL VALIDA, ALTRIMENTI NO */
  if(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email)) {
    return true;
  }
  return false;
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 6');
console.log(isThisAnEmail('info@info.it'));

/* ESERCIZIO 7
  Scrivi una funzione chiamata "whatDayIsIt" che ritorna il giorno della settimana corrente.
*/

const whatDayIsIt = function() {
  /* PRENDO IL GIORNO DELLA SETTIMANA RELATIVO AL GIORNO D'OGGI E ASSOCIO IL VALORE NUMERICO TRA 0 E 6 CHE OTTENGO AL CORRISPONDENTE GIORNO DELLA SETTIMANA DELL'ARRAY CREATO AD HOC, IN CUI I GIORNI DELLA SETTIMANA RISPETTANO IL CRITERIO DI DATE */
  let numeroGiorno = new Date().getDay();
  let arraySettimana = ['Domenica', 'Lunedì', 'Martedì', 'Mercoledì', 'Giovedì', 'Venerdì', 'Sabato'];
  return arraySettimana[numeroGiorno];
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 7');
console.log(whatDayIsIt());

/* ESERCIZIO 8
  Scrivi una funzione chiamata "rollTheDices" che riceve un numero come parametro.
  Deve invocare la precedente funzione dice() il numero di volte specificato nel parametro, e deve tornare un oggetto contenente una proprietà "sum":
  il suo valore deve rappresentare il totale di tutti i valori estratti con le invocazioni di dice().
  L'oggetto ritornato deve anche contenere una proprietà "values", contenente un array con tutti i valori estratti dalle invocazioni di dice().

  Example:
  rollTheDices(3) => ritorna {
      sum: 10
      values: [3, 3, 4]
  }
*/

const rollTheDices = function(numero) {
  let obj = {
    sum: 0,
    values: []
  }
  /* DEFINISCO QUI SOPRA UN OGGETTO CON LE PROPRIETà RICHIESTE E, SOLO SE IL NUMERO IN INPUT è > 0 */
  if (numero > 0) {
    for (let i=0; i<numero; i++) {
      let numeroEstratto = dice(); //CHIAMO 'NUMERO' VOLTE LA FUNZIONE 'DICE' E SALVO IL VALORE OTTENUTO NELL'ARRAY
      obj.values.push(numeroEstratto); //INSERISCO IL VALORE OTTENUTO IN CODA ALL'ARRAY
      obj.sum += numeroEstratto; // CALCOLO AD OGNI CHIAMATA ALLA FUNZIONE 'DICE', LA SOMMA DI CIò CHE OTTENGO
    }
    return obj;
  } else {
    return 'Inserisci un numero maggiore di zero'; // SE HAI INSERITO 'NUMERO' <= 0 NON CALCOLO NULLA
  }
  
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 8');
console.log(rollTheDices(5));

/* ESERCIZIO 9
  Scrivi una funzione chiamata "howManyDays" che riceve una data come parametro e ritorna il numero di giorni trascorsi da tale data.
*/

const howManyDays = function(data) {
  let giorniPassati = 0; // VARIABILE CHE CALCOLA I GIORNI PASSATI DALLA DATA IN INGRESSO
  if (data.includes('/')) { //SE INSERISCI UNA DATA NEL FORMATO ITALIANO CON LA / (DD/MM/YYYY)
    let dataItaliana = data.split('/').reverse().join('-'); //RIPORTO LA DATA INSERITA NEL FORMATO INGLESE
    dataItaliana = new Date(dataItaliana); //OTTENGO I MILLISECONDI TRA QUESTA DATA E IL 01/01/1970
    let dataOdierna = Date.now(); //OTTENGO I MILLISECONDI TRA OGGI E IL 01/01/1970
    giorniPassati = dataOdierna-dataItaliana; // OTTENGO I MILLISECONDI TRA OGGI E DATA IN INPUT
    giorniPassati = Math.floor(((giorniPassati/1000)/3600)/24); // OTTENGO I GIORNI TRASCORSI, APPROSSIMATI PER DIFETTO
  } else if (data.charAt(1) == '-' || data.charAt(2) == '-') { // SE FORMATO ITALIANO MA CON - (DD-MM-YYYY)
    let dataItaliaTrattini = data.split('-').reverse().join('-'); //RIPORTO LA DATA INSERITA NEL FORMATO INGLESE
    dataItaliaTrattini = new Date(dataItaliaTrattini); //OTTENGO I MILLISECONDI TRA QUESTA DATA E IL 01/01/1970
    let dataOdierna = Date.now(); //OTTENGO I MILLISECONDI TRA OGGI E IL 01/01/1970
    giorniPassati = dataOdierna-dataItaliaTrattini; // OTTENGO I MILLISECONDI TRA OGGI E DATA IN INPUT
    giorniPassati = Math.floor(((giorniPassati/1000)/3600)/24); // OTTENGO I GIORNI TRASCORSI, APPROSSIMATI PER DIFETTO
  } else { // SE INSERISCI IN FORMATO INGLESE (YYYY-MM-DD)
    let dataOdierna = Date.now(); //OTTENGO I MILLISECONDI TRA OGGI E IL 01/01/1970
    giorniPassati = dataOdierna-data; // OTTENGO I MILLISECONDI TRA OGGI E DATA IN INPUT
    giorniPassati = Math.floor(((giorniPassati/1000)/3600)/24); // OTTENGO I GIORNI TRASCORSI, APPROSSIMATI PER DIFETTO
  }
  return giorniPassati; // RESTITUISCO I GIORNI TRASCORSI
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 9');
console.log(howManyDays('09-11-2022'));

/* ESERCIZIO 10
  Scrivi una funzione chiamata "isTodayMyBirthday" che deve ritornare true se oggi è il tuo compleanno, falso negli altri casi.
*/

function isTodayMyBirthday (dataTest) {
  if (dataTest.includes('/')) { //STESSA FILOSOFIA DELL'ESERCIZIO PRECEDENTE PER I FORMATI DELLE DATE IN INPUT
    let data = new Date();
    let dataItaliana = dataTest.split('/'); // OTTENGO IL VETTORE DI DATA IN FORMATO ITALIANO IN CUI HO
    let giorno = dataItaliana[0]; //IN PRIMA POSIZIONE IL GIORNO DEL MESE
    let mese = dataItaliana[1]; // IN SECONDA POSIZIONE IL NUMERO DEL MESE (CORRETTO)
    if (mese == data.getMonth() + 1 && giorno == data.getDate()) { //GUARDO SE IL MESE DEL TUO COMPLEANNO E IL GIORNO DEL TUO COMPLEANNO CORRISPONDONO AD OGGI
      return true; //TANTI AUGURI
    }
    return false; //NIENTE AUGURI
  } else if (dataTest.charAt(1) == '-' || dataTest.charAt(2) == '-') { //STESSA LOGICA DEL BLOCCO PRECEDENTE
    let dataItaliaTrattini = dataTest.split('-');
    let data = new Date();
    let giorno = dataItaliaTrattini[0];
    let mese = dataItaliaTrattini[1];
    if (mese == data.getMonth() + 1 && giorno == data.getDate()) {
      return true;
    }
    return false;
  } else {
    let dataInglese = dataTest.split('-'); // HAI INSERITO UNA DATA GIA IN FORMATO (YYYY-MM-DD)
    let data = new Date();
    let giorno = dataInglese[2]; //IL GIORNO, IN QUESTO FORMATO, SI TROVA IN POSIZIONE 2 DELL'ARRAY OTTENUTO DALLO SPLIT
    let mese = dataInglese[1]; // IL MESE SEMPRE IN POSIZIONE 1
    if (mese == data.getMonth() + 1 && giorno == data.getDate()) { //COME BLOCCHI PRECEDENTI
      return true;
    }
    return false;
  }
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 10');
console.log(isTodayMyBirthday('2002-11-11'));

// Arrays & Oggetti

// NOTA: l'array "movies" usato in alcuni esercizi è definito alla fine di questo file

/* ESERCIZIO 11
  Scrivi una funzione chiamata "deleteProp" che riceve un oggetto e una stringa come parametri; deve ritornare l'oggetto fornito dopo aver eliminato
  in esso la proprietà chiamata come la stringa passata come secondo parametro.
*/

let campione = new Object ({ // CREO OGGETTO CAMPIONE CON LE SUE PROPRIETà
  nome: 'Paolo',
  cognome: 'Maldini',
  anni: 54,
  professioneAttuale: 'dirigente sportivo',
  professionePassata: 'calciatore',
  squadra: 'Milan'
});

const deleteProp = function(obj, str) {
  Reflect.deleteProperty(obj, str); //METODO TROVATO IN RETE PER CANCELLARE UNA PROPRIETà PASSATA IN INPUT, SE VIENE TROVATA, ALTRIMENTI NON CANCELLA NULLA
  return obj;
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 11');
console.log(deleteProp(campione, 'mmm'));

/* ESERCIZIO 12
  Scrivi una funzione chiamata "newestMovie" che trova il film più recente nell'array "movies" fornito.
*/

const newestMovie = function(movies) { // LA FUNZIONE, COME MOLTE DELLE SEGUENTI, HA IN INGRESSO MOVIES, L'ARRAY IN ALTO
  let filmRecente = movies[0]; // INIZIALMENTE IL FILM PIù RECENTE è SOLO IL PRIMO CHE TROVO
  let annoMaggiore = movies[0].Year; //MI SALVO IL SUO ANNO
  for (let film of movies) {
    if (film.Year > annoMaggiore) { //SE NELL'ARRAY TROVO UN ANNO PIù RECENTE, AGGIORNO IL FILM PIù RECENTE
      filmRecente = film;
    }
  }
  return filmRecente; //OTTENGO IL FILM PIù RECENTE
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 12');
console.log(newestMovie(movies));

/* ESERCIZIO 13
  Scrivi una funzione chiamata countMovies che ritorna il numero di film contenuti nell'array "movies" fornito.
*/

const countMovies = function (array) {
  return array.length; //CALCOLO LA LUNGHEZZA DELL'ARRAY CON IL METODO LENGTH
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('esercizio 13');
console.log(countMovies(movies));

/* ESERCIZIO 14
  Scrivi una funzione chiamata "onlyTheYears" che crea un array con solamente gli anni di uscita dei film contenuti nell'array "movies" fornito.
*/

const onlyTheYears = function(movies) {
  let anni = []; //VETTORE CHE CONTERRà I SOLI ANNI DELL'ARRAY MOVIES
  for (let anno of movies) {
    anni.push(anno.Year); //PER OGNI FILM DELL'ARRAY, SALVO L'ANNO NELL'ARRAY ANNI
  }
  return anni;
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 14');
console.log(onlyTheYears(movies));

/* ESERCIZIO 15
  Scrivi una funzione chiamata "onlyInLastMillennium" che ritorna solamente i film prodotto nel millennio scorso contenuti nell'array "movies" fornito.
*/

function onlyInLastMillennium(array) {
  let miniArray = []; // DEFINISCO L'ARRAY CHE AVRà I SOLI FILM VINTAGE
  for (let film of array) {
    if (film.Year < 2000) {
      miniArray.push(film); // PER OGNI FILM DI MOVIES, SE è VINTAGE, LO METTO NELL'ARRAY
    }
  }
  return miniArray;
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 15');
console.log(onlyInLastMillennium(movies))

/* ESERCIZIO 16
  Scrivi una funzione chiamata "sumAllTheYears" che ritorna la somma di tutti gli anni in cui sono stati prodotti i film contenuti nell'array "movies" fornito.
*/

const sumAllTheYears = function (arr) {
  let somma = 0;
  for (let elemento of arr) {
    somma += Number(elemento.Year); // PER OGNI FILM DI MOVIES, SOMMO L'ANNO DI USCITA
  }
  return somma;
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 16');
console.log(sumAllTheYears(movies));

/* ESERCIZIO 17
  Scrivi una funzione chiamata "searchByTitle" che riceve una stringa come parametro e ritorna i film nell'array "movies" fornito che la contengono nel titolo.
*/

function searchByTitle (array, parola) {
  let filtroFilm = []; //ARRAY CHE CONTERRà I FILM CHE RISPETTANO IL PARAMETRO DI INPUT
  let pos = -1; // DEFINISCO UNA VARIABILE A -1 CHE AIUTA NELLA RICERCA DEL PARAMETRO IN INPUT NEL TITOLO DI OGNI FILM
  for (let movie of array) {
    pos = movie.Title.search(parola); //CERCO LA PAROLA IN INPUT NEI TITOLI, SE VIENE TROVATA, IL METODO SEARCH MI RITORNA UN VALORE >= 0 E QUINDI SE POS NON è -1, HO TROVATO LA PAROLA E IL FILM LO INSERISCO NELL'ARRAY FINALE
    if (pos > -1) {
      filtroFilm.push(movie);
      pos = -1; // DOPO AVER TROVATO UN FILM CHE RISPETTA IL CRITERIO, RIMETTO POS A -1, ALTRIMENTI TUTTI GLI ALTRI FIM SAREBBERO BUONI, ANCHE SE NON RISPETTANO IL PARAMETRO
    }
  }
  return filtroFilm;
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 17');
console.log(searchByTitle(movies, 'Lord'));

/* ESERCIZIO 18
  Scrivi una funzione chiamata "searchAndDivide" che riceve una stringa come parametro e ritorna un oggetto contenente due array: "match" e "unmatch".
  "match" deve includere tutti i film dell'array "movies" fornito che contengono la stringa fornita all'interno del proprio titolo, mentre "unmatch" deve includere tutti i rimanenti.
*/

function searchByTitle (array, parola) {
  let raccolta = {
    filmSI: [],
    filmNO: []
  }
  /* CREO UN OGGETTO CON DUE ARRAY DENTRO, CHE VERRANNO POPOLATI DAGLI OPPORTUNI FILM */
  let pos = -1;
  for (let movie of array) {
    pos = movie.Title.search(parola); // PER OGNI FILM CERCO LA PAROLA DI INPUT NEL TITOLO
    if (pos > -1) {
      raccolta.filmSI.push(movie); //SE C'è, IL FILM VA NELL'ARRAY SI
      pos = -1; //RIMETTO A -1 PER LO STESSO MOTIVO DELL'ESERCIZIO PRECEDENTE
    } else {
      raccolta.filmNO.push(movie); // SE LA PAROLA NON C'è NEL TITOLO, IL FILM VA NELLA SQUADRA DEI NO
    }
  }
  return raccolta; //RESTITUISCO L'INTERO OGGETTO, SIA CON I FILM SI CHE CON I FILM NO
}
console.log('Esercizio 18');
let result = searchByTitle(movies, 'Lord'); //OTTENGO L'OGGETTO CON LE DUE LISTE CHE RISPETTANO LA PAROLA IN INPUT
let filmConParolaNelTitolo = result.filmSI; // SALVO I FILM CHE RISPETTANO IL PARAMETRO
let filmSenzaParolaNelTitolo = result.filmNO; // SALVO I FILM CHE NON RISPETTANO IL PARAMETRO
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Di seguito i film che hanno la parola cercata nel titolo');
console.log(filmConParolaNelTitolo);
console.log('Di seguito i film che NON hanno la parola cercata nel titolo');
console.log(filmSenzaParolaNelTitolo);

/* ESERCIZIO 19
  Scrivi una funzione chiamata "removeIndex" che riceve un numero come parametro e ritorna l'array "movies" fornito privo dell'elemento nella posizione ricevuta come parametro.
*/

const removeIndex = function(arr, id) { // PASSO IN INPUT ALLA FUNZIONE SIA L'ARRAY MOVIES CHE UN ID
  if (id < arr.length && id >= 0) { //SE L'ID INSERITO RIENTRA NEGLI INDICI PRESENTI NELL'ARRAY
    arr.splice(id, 1); //ELIMINO L'ELEMENTO DELL'ARRAY CORRISPONDENTE A QUELL'ID (SOLO QUELL'ELEMENTO)
    return arr;
  }
  return false; //L'ID INSERITO NON è NEL RANGE DEGLI INDICI PRESENTI NELL'ARRAY, QUINDI NON ELIMINO NULLA
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 19');
console.log(removeIndex(movies, 12));

// DOM (nota: gli elementi che selezionerai non si trovano realmente nella pagina)



/*
    NOTA: HO INSERITO L'HTML COLLEGATO AGLI ESERCIZI 20-26 IN MODO CHE, DECOMMENTANDO LA CHIAMATA ALLA FUNZIONE CORRISPONDENTE, LI PUOI VEDERE AL VOLO. IN PARTICOLARE: IL 20, 21 E 22 LI HO LASCIATI DECOMMENTATI PERCHè CHIEDONO LA STAMPA IN CONSOLE
*/


/* ESERCIZIO 20
  Scrivi una funzione per selezionare l'elemento dotato di id "container" all'interno della pagina.
*/

/* IN QUESTA FUNZIONE MI RICHIAMO L'ELEMENTO HTML (UNICO) CORRISPONDENTE ALL'ID RICHIESTO */
const selezionaElemento = function() {
  let div = document.getElementById('container'); //USO IL METODO GETELEMENTBYID DELL'OGGETTO DOCUMENT PER PRENDERE L'ELEMENTO HTML
  return div;
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 20');
console.log(selezionaElemento());

/* ESERCIZIO 21
  Scrivi una funzione per selezionare ogni tag <td> all'interno della pagina.
*/

/* SELEZIONO TUTTI I TAG TD CHE TROVEREI NEL FOGLIO, TRAMITE METODO QUERYSELECTORALL */
const selezionaTD = function() {
  let tds = document.querySelectorAll('td');
  return tds;
}
/* SUCCESSIVAMENTE STAMPO IL RISULTATO IN CONSOLE */
console.log('Esercizio 21');
console.log(selezionaTD());

/* ESERCIZIO 22
  Scrivi una funzione che, tramite un ciclo, stampa in console il testo contenuto in ogni tag <td> all'interno della pagina.
*/

const stampaTDs = function() {
  let tds = document.querySelectorAll('td'); // COME ESERCIZIO PRECEDENTE
  for (let contenuto of tds) { //PER OGNI TD TROVATO
    console.log(contenuto.textContent); // STAMPEREI IL SUO CONTENUTO
  }
}

console.log('Esercizio 22');
stampaTDs(); // ESEGUO LA FUNZIONE

/* ESERCIZIO 23
  Scrivi una funzione per aggiungere un background di colore rosso a ogni link all'interno della pagina.
*/

const coloreRosso = function () {
  let siti = document.querySelectorAll('a'); // PRENDO TUTTI I TAG a DEL FOGLIO HTML
  for (let sito of siti) {
    sito.style.backgroundColor = 'red'; //PER OGNUNO DI QUESTI a, IMPOSTO IL SUO BACKGROUNDCOLOR A ROSSO
  }
}

console.log('Esercizio 23 - VEDI CODICE');
// ESEGUO LA FUNZIONE
//coloreRosso(); 


/* ESERCIZIO 24
  Scrivi una funzione per aggiungere un nuovo elemento alla lista non ordinata con id "myList".
*/

const nuovoElem = function () {
  let lista = document.querySelectorAll('#myList > li'); //SELEZIONO TUTTI GLI 'li' FIGLI DIRETTI DELLA LISTA CON ID 'myList' DEL FOGLIO
  let nuovaRiga = document.createElement('li'); // CREO UN NUOVO ELEMENTO li (CHE NON VEDO NEL FOGLIO IN QUESTA RIGA)
  nuovaRiga.textContent = 'Quarta riga aggiunta'; //SCRIVO IL SUO CONTENUTO
  let ultimo;
  for (let elemento of lista) {
    ultimo = elemento; //MI PORTO ALL'ULTIMO POSTO DEGLI 'li' GIà PRESENTI
  }
  ultimo.append(nuovaRiga); //APPENDO L' 'li' CREATO IN FONDO ALLA LISTA (SOLO QUI LO VEDO REALMENTE NEL FOGLIO)
}

console.log('Esercizio 24 - VEDI CODICE');
// ESEGUO LA FUNZIONE
//nuovoElem();

/* ESERCIZIO 25
  Scrivi una funzione per svuotare la lista non ordinata con id "myList".
*/

const svuotaLista = function() {
  let righe = document.querySelectorAll('#myList > li'); // PRENDO TUTTE LE 'li' DEL FOGLIO DIRETTAMENTE SUCCESSIVE ALL'ELEMENTO CON ID myList
  for (let riga of righe) {
    riga.textContent = ''; // E SVUOTO IL SUO CONTENUTO
  }
}

console.log('Esercizio 25 - VEDI CODICE');
// ESEGUO LA FUNZIONE
//svuotaLista();

/* ESERCIZIO 26
  Scrivi una funzione per aggiungere ad ogni tag <tr> la classe CSS "test"
*/

const aggiungiClasse = function() {
  let trTags = document.querySelectorAll('tr'); // PRENDO TUTTI I 'tr' DEL FOGLIO HTML
  for (let riga of trTags) { //PER OGNI tr
    riga.classList.add('test'); // AGGIUNGO LA CLASSE test AD ESSI
  }
}

console.log('Esercizio 26 - VEDI CODICE');
// ESEGUO LA FUNZIONE
//aggiungiClasse();

// [EXTRA] JS Avanzato

/* ESERCIZIO 27
  Crea una funzione chiamata "halfTree" che riceve un numero come parametro e costruisce un mezzo albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  halfTree(3)

  *
  **
  ***

*/

// function halfTree(num) {
//   let p = document.createElement('p');
//   for (let i=1; i<=num; i++) {
//     p.textContent += '*';
//     p.appendChild(p);
//   }
// }


// function halfTree(num) {
//   let prova = '';
//   for (let i=1; i<=num; i++) {
//     prova += '*';
//     console.log(prova);
//   }
// }

//halfTree(5);

/* ESERCIZIO 28
  Crea una funzione chiamata "tree" che riceve un numero come parametro e costruisce un albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  tree(3)

    *
   ***
  *****

*/

/* ESERCIZIO 29
  Crea una funzione chiamata "isItPrime" che riceve un numero come parametro e ritorna true se il numero fornito è un numero primo.
*/

/* Questo array viene usato per gli esercizi. Non modificarlo. */

