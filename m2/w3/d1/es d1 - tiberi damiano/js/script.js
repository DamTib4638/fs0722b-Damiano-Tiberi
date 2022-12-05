function Persona () {
    this.nome = '';
    this.cognome = '';
    this.annoCompl = '';
}

let nomeForm = document.getElementById('nome');
let cognomeForm = document.getElementById('cognome');
let dataNascitaForm = document.getElementById('dataNascita');
let nuovoUtente = new Persona();
let salvaUtente = document.getElementById('salva');
let tBody = document.getElementById('cuoreTabella');

function calcoloEta (dataUtente) {
    let eta = 0;
    if (dataUtente) {
        let annoUtente = new Date(dataUtente);
        let annoCorrente = new Date();
        annoCorrente = annoCorrente.getFullYear();
        annoUtente = annoUtente.getFullYear();
        console.log(annoCorrente);
        console.log(annoUtente);
        if (annoCorrente > annoUtente) {
            eta = annoCorrente-annoUtente;
        } else {
            alert('Devi ancora nascere');
        }
    } else {
        alert('Inserisci la tua data di nascita');
    }
    return eta;
}

salvaUtente.addEventListener('click', inserisciUtente);

function inserisciUtente(e) {
    if ((nomeForm.value || cognomeForm.value) && dataNascitaForm) {
        let nuovaRiga = document.createElement('tr');
        let nuovaColonnaNominativo = document.createElement('td');
        let nuovaColonnaEta = document.createElement('td');
        nuovaColonnaNominativo.classList.add('col-6');
        nuovaColonnaNominativo.textContent += nomeForm.value + ' ' + cognomeForm.value;
        nuovaColonnaEta.classList.add('col-6');
        nuovaColonnaEta.textContent += calcoloEta(dataNascitaForm.value);
        nuovaRiga.appendChild(nuovaColonnaNominativo);
        nuovaRiga.appendChild(nuovaColonnaEta);
        tBody.appendChild(nuovaRiga);
        svuotaCampi();
    } else {
        alert('Inserisci bene i campi');
    }
}

function svuotaCampi() {
    nomeForm.value = '';
    cognomeForm.value = '';
    dataNascitaForm.value = '';
}