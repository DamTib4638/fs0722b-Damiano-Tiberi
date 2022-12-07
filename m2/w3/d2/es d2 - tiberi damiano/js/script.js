import {Persona} from './moduli/Persona.js';
var umano1 = new Persona('Damiano', 'Tiberi', 35);
var umano2 = new Persona('Manuel', 'Ferrucci', 30);
var umano3 = new Persona('Tizio', 'Caio', 50);

var responso = umano2.confrontaEta(umano1, umano3);
console.log(responso);

/* ARAY ESERCIZIO 2 */
// [
//     {id: 1, nome: 'Luca', cognome: 'Rossi', classe: 'A'},
//     {id: 2, nome: 'Luigi', cognome: 'Verdi', classe: 'A'},
//     {id: 3, nome: 'Mario', cognome: 'Bianchi', classe: 'A'},
//     {id: 4, nome: 'Piero', cognome: 'Neri', classe: 'A'},
//     {id: 5, nome: 'Paolo', cognome: 'Rossi', classe: 'A'},
//     {id: 6, nome: 'Sergio', cognome: 'Verdi', classe: 'A'},
//     {id: 7, nome: 'Gianno', cognome: 'Bianchi', classe: 'A'},
//     {id: 8, nome: 'Davide', cognome: 'Neri', classe: 'A'},
// ]