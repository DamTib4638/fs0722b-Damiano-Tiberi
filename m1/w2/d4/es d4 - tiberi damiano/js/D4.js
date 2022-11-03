const starWarsCharacters = [
  {
    name: "Luke Skywalker",
    height: "172",
    mass: "277",
    hair_color: "blond",
    skin_color: "fair",
    eye_color: "blue",
    birth_year: "19BBY",
    gender: "male"
  },
  {
    name: "C-3PO",
    height: "167",
    mass: "75",
    hair_color: "n/a",
    skin_color: "gold",
    eye_color: "yellow",
    birth_year: "112BBY",
    gender: "n/a"
  },
  {
    name: "R2-D2",
    height: "96",
    mass: "32",
    hair_color: "n/a",
    skin_color: "white, blue",
    eye_color: "red",
    birth_year: "33BBY",
    gender: "n/a"
  },
  {
    name: "Darth Vader",
    height: "202",
    mass: "136",
    hair_color: "none",
    skin_color: "white",
    eye_color: "yellow",
    birth_year: "41.9BBY",
    gender: "male"
  },
  {
    name: "Leia Organa",
    height: "150",
    mass: "49",
    hair_color: "brown",
    skin_color: "light",
    eye_color: "brown",
    birth_year: "19BBY",
    gender: "female"
  },
  {
    name: "Owen Lars",
    height: "178",
    mass: "120",
    hair_color: "brown, grey",
    skin_color: "light",
    eye_color: "blue",
    birth_year: "52BBY",
    gender: "male"
  },
  {
    name: "Beru Whitesun lars",
    height: "165",
    mass: "75",
    hair_color: "brown",
    skin_color: "light",
    eye_color: "blue",
    birth_year: "47BBY",
    gender: "female"
  },
  {
    name: "R5-D4",
    height: "97",
    mass: "32",
    hair_color: "n/a",
    skin_color: "white, red",
    eye_color: "red",
    birth_year: "unknown",
    gender: "n/a"
  },
  {
    name: "Biggs Darklighter",
    height: "183",
    mass: "84",
    hair_color: "black",
    skin_color: "light",
    eye_color: "brown",
    birth_year: "24BBY",
    gender: "male"
  },
  {
    name: "Obi-Wan Kenobi",
    height: "182",
    mass: "77",
    hair_color: "auburn, white",
    skin_color: "fair",
    eye_color: "blue-gray",
    birth_year: "57BBY",
    gender: "male"
  }
];

/* ESERCIZIO 1
Crea una variabile chiamata "characters" e inserisci un array vuoto
*/
console.log('Esercizio 1');
let characters = [];
console.log(characters);

/* ESERCIZIO 2
Usando un for loop, cicla l'array "starWarsCharacters" ed accedi alla proprietà "name". 
Usa il valore contenuto inserendolo nell'array creato precedentemente. 
Come risultato dovresti ottenere qualcosa di simile: ["Luke Skywalker", "C-3PO", "R2-D2", etc..]
*/
console.log('Esercizio 2');
for (let elemento of starWarsCharacters) {
  characters.push(elemento.name);
}
console.log(characters);

/* ESERCIZIO 3
  Seguendo i passaggi precedenti crea un array chiamato "femaleCharacters" e inserisci un oggetto con questa struttura: 
  {name: Leia Organa, hair_color: "brown", eye_color: "brown"}
*/
console.log('Esercizio 3');
let femaleCharacters = new Array ({
  nome: 'Leia Organa',
  hair_color: 'brown',
  eye_color: 'brown'
});

console.log(femaleCharacters);

/* ESERCIZIO 4
  Crea un oggetto "eyeColor" che abbia come proprietà: blue, yellow, brown, red, blue-gray.
  ognuna di queste proprietà contiene un array vuoto
*/
console.log('Esercizio 4');
let eyeColor = {
  blue: [],
  yellow: [],
  brown: [],
  red: [],
  blueGray: []
}
console.log(eyeColor);

/* ESERCIZIO 5
  Inserisci l'oggetto dei personaggi in "starWarsCharacters" nell'array corrispondente al colore dei loro occhi nell'oggetto "eyeColor" precedentemente creato
  Utilizza uno switch statement per determinare in quale proprietà inserire il personaggio
  */
  console.log('Esercizio 5');
  for (let elemento of starWarsCharacters) {
    switch (elemento.eye_color) {
      case 'blue':
        eyeColor.blue.push(elemento);
        continue;
      case 'yellow':
        eyeColor.yellow.push(elemento);
        continue;
      case 'brown':
        eyeColor.brown.push(elemento);
        continue;
      case 'red':
        eyeColor.red.push(elemento);
        continue;
      case 'blue-gray':
        eyeColor.blueGray.push(elemento);
        continue;
      default:
        console.log('Colore occhi non trovato');
    }
  }
  console.log(eyeColor);

/* ESERCIZIO 6
  Usa un while loop per calcolare la massa totale dell'equipaggio
  */
  console.log('Esercizio 6');
let i = 0, massa = 0;
while(i < starWarsCharacters.length) {
  massa += Number(starWarsCharacters[i].mass);
  i++;
}
console.log(massa);

/* ESERCIZIO 7

Crea uno switch statement per rivelare la tipologia di carico, utilizzando la massa totale, di un'impotetica astronave contenente i personaggi dell'array "starWarsCharacters"
(cerca su un motore di ricerca switch case e conditionals)

Se la massa è inferiore a 500 stampa in console: "Ship is under loaded",
Se la massa è uguale a 500 stampa in console: "Ship is half loaded",
Se la massa è superiore a 700 stampa in console: "Warning: Load is over 700",
Se la massa è superiore a 900 stampa in console: "Critical Load: Over 900",
Se la massa è superiore a 1000 stampa in console: "DANGER! OVERLOAD ALERT: Jump ship now!"

Una volta fatto, modifica la massa di qualche elemento dell'equipaggio e vedi se riesci ad ottenere un messaggio diverso.
*/
console.log('Esercizio 7');
console.log(massa);
switch(true) {
  case massa < 500:
    console.log('Ship is under loaded');
    break;
  case massa == 500:
    console.log('Ship is half loaded');
    break;
  case massa > 700 && massa < 900:
    console.log('Warning: Load is over 700');
    break;
  case massa > 900 && massa <= 1000:
    console.log('Critical Load: Over 900');
    break;
  case massa > 1000:
    console.log('DANGER! OVERLOAD ALERT: Jump ship now!');
    break;
  default:
    console.log('Nessuna massa');
}

/* ESERCIZIO 8
Usa un for loop per cambiare il valore della proprietà "gender" di alcuni personaggi dal valore "n/a" a "robot" (Tip: puoi creare un nuovo array, o tentare la riassegnazione del valore corrispondente)
*/
console.log('Esercizio 8');
let starWarsCharactersRobot = [];

for (let elemento of starWarsCharacters) {
  if (elemento.gender == 'n/a') {
    elemento.gender = 'robot';
  }
  starWarsCharactersRobot.push(elemento);
}
console.log(starWarsCharactersRobot);

/* EXTRA ESERCIZIO 9

Utilizzando gli elementi presenti nell'array "femaleCharacters" rimuovi dall'array "characters" le stringhe corrispondenti a personaggi con lo stesso nome"
Usa uno più for loop per raggiungere il risultato

(tip: cerca un metodo degli array per rimuovere un elemento)

Una volta fatto crea un conosle.log per controllare la proprietà length di "characters" prima e dopo l'operazione
*/
console.log('Esercizio 9');
console.log(femaleCharacters);
console.log(starWarsCharacters);
for (let femmina of femaleCharacters) {
  let nome = femmina.nome;
  for (let i = 0; i < starWarsCharacters.length; i++) {
    if (starWarsCharacters[i].name == nome) {
      starWarsCharacters.splice(i, 1);
      // console.log(starWarsCharacters[i]);
    }
  }
}
console.log(starWarsCharacters);

/* EXTRA ESERCIZIO 10
Crea una funzionalità che prenda un elemento casuale dall'array "starWarsCharacters" e ne stampi in console le proprietà in modo discorsivo
*/
console.log('Esercizio 10');
let casuale = parseInt(Math.random() * starWarsCharacters.length);
console.log(casuale);
let personaggio = starWarsCharacters[casuale];
console.log('Il personaggio ' + personaggio.name + ' è alto ' + personaggio.height + ', ha una massa di ' + personaggio.mass + ', ha un colore di capelli ' + personaggio.hair_color + ', il colore della pelle ' + personaggio.skin_color + ', il colore degli occhi è ' + personaggio.eye_color + ', anno di nascita ' + personaggio.birth_year + ' ed è di genere ' + personaggio.gender);