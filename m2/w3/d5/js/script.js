/* PROGRAMMAZIONE ASINCRONA */

const div = document.querySelector('.row');
// const modalita = {
//     method: 'GET',
//     mode: 'cors'
// }

// fetch('https://github.com/DamTib4638/jsonProva/blob/main/users.json', modalita).then(function(response) {

/* HO PROVATO A CARICARE IL FILE JSON SUL MIO GITHUB E POI A COLLEGARMI AD ESSO, MA HO AVUTO PROBLEMI */

/* USARE LIVESERVER PER VEDERE IL RISULTATO */
fetch('./json/users.json').then(function(response) { 
    console.log(response);
    return response.json();
}).then(function(json) {                        
    let utenti = json;
    console.log('Dati: ' + utenti);
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

/* <div class="col-3 p-5">
            <div class="card" style="width: 18rem;">
                <img src="..." class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div>
        <div class="col-3 p-5">
            <div class="card" style="width: 18rem;">
                <img src="..." class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div> */