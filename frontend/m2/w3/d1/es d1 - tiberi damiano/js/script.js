/* 
    Il costruttore Persona qui sotto definisce sia le proprietà di persona sia i metodi che possiede. In altre parole, sto definendo la classe Persona, più che l'istanza dell'oggetto Persona.
*/
function Persona (nomeF, cognomeF, dataNascitaF) {
    this.nome = nomeF;
    this.cognome = cognomeF;
    this.dataNascita = dataNascitaF;
    this.ricavaEta = function() {
        if (this.dataNascita) {
            let eta = 0;
            let annoCorrente = new Date().getFullYear();
            let annoUtente = new Date(this.dataNascita).getFullYear();
            if (annoCorrente > annoUtente) {
                eta = annoCorrente-annoUtente;
                return eta;
            } else {
                alert('Devi ancora nascere');
            }
        } else {
            alert('Inserisci la tua data di nascita');
        }
    }
    this.aggiungiUtente = function() {
        let tBody = document.getElementById('cuoreTabella');
        let nuovaRiga = document.createElement('tr');
        let nuovaColonnaNominativo = document.createElement('td');
        let nuovaColonnaEta = document.createElement('td');
        nuovaColonnaNominativo.classList.add('col-6');
        nuovaColonnaNominativo.textContent += this.nome + ' ' + this.cognome;
        nuovaColonnaEta.classList.add('col-6');
        nuovaColonnaEta.textContent += this.ricavaEta();
        nuovaRiga.appendChild(nuovaColonnaNominativo);
        nuovaRiga.appendChild(nuovaColonnaEta);
        tBody.appendChild(nuovaRiga);
    }
}

let nomeForm = document.getElementById('nome');
let cognomeForm = document.getElementById('cognome');
let dataNascitaForm = document.getElementById('dataNascita');
let salvaUtente = document.getElementById('salva');
salvaUtente.addEventListener('click', inserisciUtente);

function inserisciUtente() {
    let nuovoUtente = new Persona(nomeForm.value, cognomeForm.value, dataNascitaForm.value);
    svuotaCampi();
    if ((nuovoUtente.nome || nuovoUtente.cognome) && nuovoUtente.dataNascita) {
        nuovoUtente.aggiungiUtente();
    } else {
        alert('Inserisci bene i campi');
    }
}

function svuotaCampi() {
    nomeForm.value = '';
    cognomeForm.value = '';
    dataNascitaForm.value = '';
}