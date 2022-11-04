function aggiungiCifra(bottone) {

    /* DEVI SVOLGERE PIù LOGICA POSSIBILE PER QUANTO RIGUARDA LA SCRITTURA NEL CAMPO DI TESTO */
    let numeri = document.getElementById('numeri');
    /* Inserisce in sequenza le cifre sul display della calcolatrice */
    //console.log(numeri.value);
    document.getElementById("numeri").value += bottone.getAttribute('data-simbolo');

    
    let array = [];
    for (let i = 0; i < numeri.value.length; i++) {
        array.push(numeri.value[i]);
    }
    for (let i = 0; i < array.length-1; i++) {
        if (array[i] == '+' || array[i] == '-' || array[i] == '*' || array[i] == '/' || array[i] == '.') {
            if (array[i+1] == '+' || array[i+1] == '-' || array[i+1] == '*' || array[i+1] == '/' || array[i+1] == '.') {
                array.splice(i, 1);
                i--;
            }
        }
    }
    // console.log(numeri.value);
    // console.log(array);
    // console.log(typeof numeri.value);
    document.getElementById("numeri").value = '';
    for (let pulsante of array) {
        document.getElementById('numeri').value += pulsante;
    }
    

}

function tot() {

    /* DEVI SVOLGERE PIù LOGICA POSSIBILE PER IL CORRETTO FUNZIONAMENTO DELLE OPERAZIONI */

    /* Svolge l'operazione richiesta e mostra il risultato */
    let numeri = document.getElementById("numeri");
    // console.log(numeri.value);
    numeri.value = eval(numeri.value);
}

function disabilita() {
    let disabilita = document.getElementById("numeri");
    // let button;
    // button = document.querySelector(".btn-tastiera");
    // console.log(button);
    // console.log(typeof button);
    if (disabilita.value) {
        
    }
}

function reset() {
    /* Al click del tasto C si ripulisce il campo di testo */
    document.getElementById("numeri").value = '';
}

function indietro() {
    /* Esci dall'app */
    location.href = 'index.html';
}