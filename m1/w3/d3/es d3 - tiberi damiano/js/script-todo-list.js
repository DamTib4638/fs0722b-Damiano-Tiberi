let pulsanteAggiungi = document.querySelector('#aggiungi');
pulsanteAggiungi.addEventListener('click', aggiungiCompito);

function aggiungiCompito() {

    let testo = document.querySelector('#text');

    if (testo.value != '') {
    
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
        alert ('Devi inserire una nuova attività per aggiungerla');
    }
}

function eliminaCompito(bottoneElimina, div) {
    bottoneElimina.addEventListener('click', function () {
        let lineaDaEliminare = document.querySelector('#principale');
        lineaDaEliminare.removeChild(div);
    })
}

function svolgiCompito(bottoneFatto, div) {
    bottoneFatto.addEventListener('click', function() {
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



        // let cerca = document.querySelector('#cerca');

        // cerca.addEventListener('keyup', ()=> {
            
        //     let todos = document.querySelectorAll('.todo');
            
        //     for(let task of todos){
        //         let testo = task.querySelector('span').textContent.toUpperCase();
                
        //         if(testo.search(cerca.value.toUpperCase()) == -1){
        //             task.style.display = 'none';
        //         }else{
        //             task.style.display = 'block';
        //         }
        //     }

        // })