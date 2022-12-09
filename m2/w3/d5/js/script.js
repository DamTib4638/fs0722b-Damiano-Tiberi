/* HO CREATO UNA VARIABILE PER PROVARE UNA CHIAMATA ESTERNA CHE SPIEGO SOTTO */
var opzione = true;

/* USARE LIVESERVER PER VEDERE IL RISULTATO */
window.addEventListener('load', caricaContenuto);
function caricaContenuto() {
    const div = document.querySelector('.row');
    if (opzione) {      // SE IMPOSTO A TRUE LA VARIABILE opzione
        fetch('./json/users.json').then(function (response) {       // CHIAMO JSON LOCALE E FUNZIONA SOLO CON LIVE SERVER
            return response.json();
        }).then(function (json) {
            let utenti = json;
            for (let i = 0; i < 2; i++) {
                div.innerHTML += `
                    <div class="col-3 p-3">
                    <div class="card w-100 border border-dark shadow text-center">
                    <img src="${utenti[i].profileURL}" class="card-img-top w-25 bg-light rounded-circle mx-auto mt-3" alt="immagine profilo">
                    <div class="card-body">
                    <h5 class="card-title">${utenti[i].firstName} ${utenti[i].lastName}</h5>
                    <a href="#" class="card-link text-warning text-decoration-none">${utenti[i].email}</a>
                    </div>
                    </div>
                    </div>`
            }
        });
    } else {            // SE IMPOSTO A FALSE LA VARIABILE opzione
        fetch('https://jsonplaceholder.typicode.com/users').then(function (response) { 
            /*  CHIAMO JSON ONLINE E FUNZIONA SIA CON LIVE SERVER CHE CON BROWSER.
                MI SONO COLLEGATO A QUESTO SITO PERCHè NON SONO RIUSCITO A PRENDERE USERS.JSON DA GITHUB
                PER QUESTO MOTIVO, DI TUTTI GLI USERS CHE SCARICO DAL SITO, MI SALVO IN users SOLO I PRIMI DUE
                ED AGGIUNGO AGLI OGGETTI CORRISPONDENTI LA PROPRIETà CHE MANCAVA PER L'IMMAGINE, IN MODO DA OTTENERRE
                LO STESSO RISULTATO.
            */
            return response.json();
        }).then(function (json) {
            let users = [json[0], json[1]];
            users[0].profileURL = 'img/male.png';
            users[1].profileURL = 'img/female.png';
            for (let i = 0; i < 2; i++) {
                div.innerHTML += `
                    <div class="col-3 p-3">
                    <div class="card w-100 border border-dark shadow text-center">
                    <img src="${users[i].profileURL}" class="card-img-top w-25 bg-light rounded-circle mx-auto mt-3" alt="immagine profilo">
                    <div class="card-body">
                    <h5 class="card-title">${users[i].name}</h5>
                    <a href="#" class="card-link text-warning text-decoration-none">${users[i].email}</a>
                    </div>
                    </div>
                    </div>`
            }
        });
    }

}