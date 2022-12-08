import { Paginazione } from "./moduli/Paginazione.js";
var array = [
    { id: 1, nome: 'Luca', cognome: 'Rossi', classe: 'A' },
    { id: 2, nome: 'Luigi', cognome: 'Verdi', classe: 'A' },
    { id: 3, nome: 'Mario', cognome: 'Bianchi', classe: 'A' },
    { id: 4, nome: 'Piero', cognome: 'Neri', classe: 'A' },
    { id: 5, nome: 'Paolo', cognome: 'Rossi', classe: 'A' },
    { id: 6, nome: 'Sergio', cognome: 'Verdi', classe: 'A' },
    { id: 7, nome: 'Gianno', cognome: 'Bianchi', classe: 'A' },
    { id: 8, nome: 'Davide', cognome: 'Neri', classe: 'A' },
];

var paginazione = new Paginazione(array, 2);

mostraInfo();
let inizio = document.getElementById('prima');
inizio.addEventListener('click', function () {
    paginazione.primaPagina();
    mostraInfo();
})
let fine = document.getElementById('ultima');
fine.addEventListener('click', function () {
    paginazione.ultimaPagina();
    mostraInfo();
})
let prec = document.getElementById('precedente');
prec.addEventListener('click', function () {
    paginazione.paginaPrecedente();
    mostraInfo();
})
let succ = document.getElementById('successiva');
succ.addEventListener('click', function () {
    paginazione.paginaSuccessiva();
    mostraInfo();
})

function mostraInfo() {
    let infos = paginazione.suddivisioneInPagine();
    let tBody = document.getElementById('contenuto');
    let righe = tBody.querySelectorAll('tr');
    for (let riga of righe) {
        riga.remove();
    }
    
    for (let elemento of infos) {

        let nuovaRiga = document.createElement('tr');
        let nuovaColonnaID = document.createElement('td');
        let nuovaColonnaNome = document.createElement('td');
        let nuovaColonnaCognome = document.createElement('td');
        let nuovaColonnaPagina = document.createElement('td');
        nuovaColonnaID.classList.add('col');
        nuovaColonnaNome.classList.add('col');
        nuovaColonnaCognome.classList.add('col');
        nuovaColonnaPagina.classList.add('col');
        nuovaColonnaID.textContent = elemento.id;
        nuovaColonnaNome.textContent = elemento.nome;
        nuovaColonnaCognome.textContent = elemento.cognome;
        nuovaColonnaPagina.textContent = elemento.classe;

        nuovaRiga.appendChild(nuovaColonnaID);
        nuovaRiga.appendChild(nuovaColonnaNome);
        nuovaRiga.appendChild(nuovaColonnaCognome);
        nuovaRiga.appendChild(nuovaColonnaPagina);

        tBody.appendChild(nuovaRiga);
    }
}