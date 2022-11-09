document.querySelector('#aggiungi')
        .addEventListener('click', function(){

            let testo = document.querySelector('#text');
            
            let div = document.createElement('div');
            div.classList.add('todo')
            
            let span = document.createElement('span');
            span.textContent = testo.value;
            

            let completato = document.createElement('button');
            completato.textContent = '✓';

            completato.addEventListener('click', ()=> {
                div.classList.add('completato');//assegno una classe aggiuntiva
                document.querySelector('#lista-completati')
                .append(div);//sposto il div nella lista completati
                completato.textContent = 'X';
            })

            div.append(span, completato);
            document.querySelector('#lista').append(div);

            testo.value = '';  
        });



        let cerca = document.querySelector('#cerca');

        cerca.addEventListener('keyup', ()=> {
            
            let todos = document.querySelectorAll('.todo');
            
            for(let task of todos){
                let testo = task.querySelector('span').textContent.toUpperCase();
                
                if(testo.search(cerca.value.toUpperCase()) == -1){
                    task.style.display = 'none';
                }else{
                    task.style.display = 'block';
                }
            }

        })