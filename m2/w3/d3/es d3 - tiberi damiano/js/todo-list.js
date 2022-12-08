let pulsanteAggiungi = document.querySelector('#aggiungi');
pulsanteAggiungi.addEventListener('click', aggiungiCompito); //la funzione va senza () se no la esegue a priori.

var arrayLocalStorage = [];

window.addEventListener('load', ripristinaLista);

function ripristinaLista() {
    if (localStorage.tasks) {
        arrayLocalStorage = localStorage.tasks.split(',');
        componiLista(arrayLocalStorage);
    }
}

function componiLista(array) {
    for (let task of array) {

        let div = document.createElement('div');
        div.classList.add('todo');

        let span = document.createElement('span');
        span.textContent = task.toUpperCase();
        span.classList.add('span-compito');

        let bottoneFatto = document.createElement('button');
        bottoneFatto.textContent = '✓';
        bottoneFatto.classList.add('button-fatto');

        let bottoneElimina = document.createElement('button');
        bottoneElimina.textContent = 'X';
        bottoneElimina.classList.add('button-elimina');

        let principale = document.querySelector('#principale');

        //testo.value = '';

        div.append(span, bottoneElimina, bottoneFatto);

        principale.append(div);

        svolgiCompito(bottoneFatto, div);
        eliminaCompito(bottoneElimina, div);
    }
}

function aggiungiCompito() {

    let testo = document.querySelector('#text');
    if (testo.value != '' && testo.value != ' ') {
        arrayLocalStorage.push(testo.value);
        localStorage.tasks = arrayLocalStorage;
        let div = document.createElement('div');
        div.classList.add('todo');

        let span = document.createElement('span');
        span.textContent = testo.value.toUpperCase();
        span.classList.add('span-compito');

        let bottoneFatto = document.createElement('button');
        bottoneFatto.textContent = '✓';
        bottoneFatto.classList.add('button-fatto');

        let bottoneElimina = document.createElement('button');
        bottoneElimina.textContent = 'X';
        bottoneElimina.classList.add('button-elimina');

        let principale = document.querySelector('#principale');

        testo.value = '';

        div.append(span, bottoneElimina, bottoneFatto);

        principale.append(div);

        svolgiCompito(bottoneFatto, div);
        eliminaCompito(bottoneElimina, div);
    } else {
        alert('Devi inserire una nuova attività per aggiungerla');
    }
}

function eliminaCompito(bottoneElimina, div) {
    bottoneElimina.addEventListener('click', function () {
        let lineaDaEliminare = document.querySelector('#principale');
        let taskSelezionato = div.childNodes[0].outerText.toLowerCase();
        console.log(taskSelezionato);
        arrayLocalStorage.splice(arrayLocalStorage.indexOf(taskSelezionato), 1);
        localStorage.tasks = arrayLocalStorage;
        lineaDaEliminare.removeChild(div);
    })
}

function svolgiCompito(bottoneFatto, div) {
    bottoneFatto.addEventListener('click', function () {
        let compitoSvolto = div;
        if (compitoSvolto.style.backgroundColor != 'lightblue') {
            compitoSvolto.style.backgroundColor = 'lightblue';
            compitoSvolto.style.textDecoration = 'line-through';
            let bottoneSost = compitoSvolto.querySelector('.button-fatto');
            bottoneSost.style.backgroundColor = 'steelblue';
            bottoneSost.textContent = '🠑';
        } else {
            compitoSvolto.style.backgroundColor = 'lightcoral';
            compitoSvolto.style.textDecoration = 'none';
            let bottoneSost = compitoSvolto.querySelector('.button-fatto');
            bottoneSost.style.backgroundColor = 'green';
            bottoneSost.textContent = '✓';
        }

    })
}

let cerca = document.querySelector('#cerca');
cerca.addEventListener('keyup', ricerca);

function ricerca() {
    let todos = document.querySelectorAll('.todo');
    for (let compito of todos) {
        let testo = compito.querySelector('span').textContent.toUpperCase();
        if (testo.search(cerca.value.toUpperCase()) == -1) {
            compito.style.display = 'none';
        } else {
            compito.style.display = 'block';
        }
    }
}