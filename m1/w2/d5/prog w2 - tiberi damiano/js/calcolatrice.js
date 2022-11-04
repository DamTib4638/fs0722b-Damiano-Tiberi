/* suoni pulsanti */
    /* = */
    let kiss = new Audio();
    kiss.src = 'audio/kiss.wav';
    kiss.playbackRate = 3.0;
    /* 1, 7 */
    let bau = new Audio();
    bau.src = 'audio/bau.wav';
    bau.playbackRate = 1.5;
    /* 2, 9 */
    let goat = new Audio();
    goat.src = 'audio/goat.wav';
    goat.playbackRate = 2.0;
    /* 3 */
    let lion = new Audio();
    lion.src = 'audio/lion.wav';
    lion.playbackRate = 1.5;
    /* 0 */
    let miao = new Audio();
    miao.src = 'audio/miao.wav';
    miao.playbackRate = 1.5;
    /* 5 */
    let muuu = new Audio();
    muuu.src = 'audio/muuu.wav';
    muuu.playbackRate = 2.0;
    /* C */
    let ops = new Audio();
    ops.src = 'audio/ops.wav';
    ops.playbackRate = 3.0;
    /* +, -, *, / */
    let risata = new Audio();
    risata.src = 'audio/risata.wav';
    risata.playbackRate = 1.5;
    /* 4 */
    let scimmia = new Audio();
    scimmia.src = 'audio/scimmia.wav';
    scimmia.playbackRate = 1.5;
    /* 6, 8 */
    let zzz = new Audio();
    zzz.src = 'audio/zzz.wav';
    zzz.playbackRate = 2.0;
    /* . */
    let bee = new Audio();
    bee.src = 'audio/bee.wav';
    bee.playbackRate = 2.0;
/* fine suoni pulsanti */

/* dichiaro una variabile globale booleana a false per gestire il corretto inserimento dei caratteri nel display della calcolatrice */
var testTotale = false;

function aggiungiCifra(bottone) {

/* funzione che aggiunge il simbolo, corrispondente al pulsante pigiato, nel display */
    
    if (!testTotale) { 
        /* se entro qui, significa che non sto inserendo un nuovo simbolo subito dopo aver pigiato il pulsante uguale. */

        let numeri = document.getElementById('numeri');
        document.getElementById("numeri").value += bottone.getAttribute('data-simbolo');
        let array = [];
        /* inizio i controlli su cosa sto inserendo */
        array[0] = numeri.value[0];
        /* se il primo carattere è uno 0, impongo il punto subito dopo */
        if (array[0] == '0') {
            array.push('.');
        }
        for (let i = 1; i < numeri.value.length; i++) {
            array.push(numeri.value[i]);
        }
        /* gestisco l'errore dell'inserimento di più caratteri non numerici (+,-,*,/,.) in sequenza e tengo in considerazione l'ultimo pigiato dall'utente. */
        for (let i = 0; i < array.length-1; i++) {
            if (array[i] == '+' || array[i] == '-' || array[i] == '*' || array[i] == '/' || array[i] == '.') {
                if (array[i+1] == '+' || array[i+1] == '-' || array[i+1] == '*' || array[i+1] == '/' || array[i+1] == '.') {
                    array.splice(i, 1);
                    i--;
                }
            }
        }
        
        if (array[0] == '+' || array[0] == '*' || array[0] == '/' || array[0] == '.') {
            array.shift();
        }
        document.getElementById("numeri").value = '';
        for (let pulsante of array) {
            document.getElementById('numeri').value += pulsante;
        }
    } else {
        /* sto inserendo un nuovo simbolo nel display subito dopo aver pigiato il pulsante uguale, quindi nel display c'è il risultato della precedente operazione. */

        /* permetto di concatenare un simbolo di una nuova operazione al risultato della precedente solo se sto inserendo un simbolo che non è un numero. */
        if (bottone.getAttribute('data-simbolo')=='+' || bottone.getAttribute('data-simbolo')=='-' || bottone.getAttribute('data-simbolo')=='*' || bottone.getAttribute('data-simbolo')=='/' || bottone.getAttribute('data-simbolo')=='.') {
            // da questo momento posso inserire quando voglio, perchè ho iniziato una nuova operazione
            testTotale = false;
            let numeri = document.getElementById('numeri');
            document.getElementById("numeri").value += bottone.getAttribute('data-simbolo');
            let array = [];
            /* inizio i controlli su cosa sto inserendo */
            array[0] = numeri.value[0];
            /* se il primo carattere è uno 0, impongo il punto subito dopo */
            if (array[0] == '0') {
                array.push('.');
            }
            for (let i = 1; i < numeri.value.length; i++) {
                array.push(numeri.value[i]);
            }
            /* gestisco l'errore dell'inserimento di più caratteri non numerici (+,-,*,/,.) in sequenza e tengo in considerazione l'ultimo pigiato dall'utente. */
            for (let i = 0; i < array.length-1; i++) {
                if (array[i] == '+' || array[i] == '-' || array[i] == '*' || array[i] == '/' || array[i] == '.') {
                    if (array[i+1] == '+' || array[i+1] == '-' || array[i+1] == '*' || array[i+1] == '/' || array[i+1] == '.') {
                        array.splice(i, 1);
                        i--;
                    }
                }
            }
            if (array[0] == '+' || array[0] == '*' || array[0] == '/' || array[0] == '.') {
                array.shift();
            }
            document.getElementById("numeri").value = '';
            for (let pulsante of array) {
                document.getElementById('numeri').value += pulsante;
            }
        } else {
            /* non permetto di concatenare un nuovo numero al risultato della precedente operazione se prima non ripulisco */
            reset();
            testTotale = false;
            document.getElementById("numeri").value += bottone.getAttribute('data-simbolo');

            let array = [];
            /* inizio i controlli su cosa sto inserendo */
            array[0] = numeri.value[0];
            /* se il primo carattere è uno 0, impongo il punto subito dopo */
            if (array[0] == '0') {
                array.push('.');
            }
            for (let i = 1; i < numeri.value.length; i++) {
                array.push(numeri.value[i]);
            }
            /* gestisco l'errore dell'inserimento di più caratteri non numerici (+,-,*,/,.) in sequenza e tengo in considerazione l'ultimo pigiato dall'utente. */
            for (let i = 0; i < array.length-1; i++) {
                if (array[i] == '+' || array[i] == '-' || array[i] == '*' || array[i] == '/' || array[i] == '.') {
                    if (array[i+1] == '+' || array[i+1] == '-' || array[i+1] == '*' || array[i+1] == '/' || array[i+1] == '.') {
                        array.splice(i, 1);
                        i--;
                    }
                }
            }
            if (array[0] == '+' || array[0] == '*' || array[0] == '/' || array[0] == '.') {
                array.shift();
            }
            document.getElementById("numeri").value = '';
            for (let pulsante of array) {
                document.getElementById('numeri').value += pulsante;
            }

        }
    }
}

function tot() {

    /* Svolge l'operazione richiesta e mostra il risultato */


    let numeri = document.getElementById("numeri");
    let array = [];
    for (let i = 0; i < numeri.value.length; i++) {
        array.push(numeri.value[i]);
    }
    if (numeri.value != '' && numeri.value != 'undefined' && array[array.length-1] != '+' && array[array.length-1] != '-' && array[array.length-1] != '*' && array[array.length-1] != '/' && array[array.length-1] != '.') {
        /* calcolo il risultato di un'operazione solo se si è inserita un'espressione aritmetica congrua */
        numeri.value = eval(numeri.value);
        testTotale = true; // mi ricordo che ho appena premuto il tasto uguale
    }
    
}

function reset() {
    /* Al click del tasto C si ripulisce il campo di testo e imposto la variabile testTotale a false */
    document.getElementById("numeri").value = '';
    if (testTotale) {
        testTotale = false;
    }
}

function indietro() {
    /* Esci dall'app */
    location.href = 'index.html';
}