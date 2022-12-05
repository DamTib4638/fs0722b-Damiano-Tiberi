function Persona (nomeF, cognomeF, dataNascitaF) {
    this.nome = nomeF;
    this.cognome = cognomeF;
    this.dataNascita = dataNascitaF;
}

let nomeForm = document.getElementById('nome');
let cognomeForm = document.getElementById('cognome');
let dataNascitaForm = document.getElementById('dataNascita');
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
    let nuovoUtente = new Persona(nomeForm.value, cognomeForm.value, dataNascitaForm.value);
    if ((nuovoUtente.nome || nuovoUtente.cognome) && nuovoUtente.dataNascita) {
        let nuovaRiga = document.createElement('tr');
        let nuovaColonnaNominativo = document.createElement('td');
        let nuovaColonnaEta = document.createElement('td');
        nuovaColonnaNominativo.classList.add('col-6');
        nuovaColonnaNominativo.textContent += nuovoUtente.nome + ' ' + nuovoUtente.cognome;
        nuovaColonnaEta.classList.add('col-6');
        nuovaColonnaEta.textContent += calcoloEta(nuovoUtente.dataNascita);
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