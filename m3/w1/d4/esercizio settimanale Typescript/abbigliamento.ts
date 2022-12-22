/* file json caricato in locale, aprire da Liveserver */
interface IVestiti {
    id: number;
    codProd: number;
    collezione: string;
    capo: string;
    modello: number;
    quantita: number;
    colore: string;
    prezzoIvaEsclusa: number;
    prezzoIvaInclusa: number;
    disponibile: string;
    saldo: number;
    getSaldoCapo(): number;
    getAcquistoCapo(): number;
}
abstract class Vestiti implements IVestiti {
    id: number;
    codProd: number;
    collezione: string;
    capo: string;
    modello: number;
    quantita: number;
    colore: string;
    prezzoIvaEsclusa: number;
    prezzoIvaInclusa: number;
    disponibile: string;
    saldo: number;
    constructor(id: number,
        codProd: number,
        collezione: string,
        capo: string,
        modello: number,
        quantita: number,
        colore: string,
        prezzoIvaEsclusa: number,
        prezzoIvaInclusa: number,
        disponibile: string,
        saldo: number
    ) {
        this.id = id;
        this.codProd = codProd;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantita = quantita;
        this.colore = colore;
        this.prezzoIvaEsclusa = prezzoIvaEsclusa;
        this.prezzoIvaInclusa = prezzoIvaInclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
    }
    public abstract getSaldoCapo(): number;
    public abstract getAcquistoCapo(): number;
}

class Abbigliamento extends Vestiti {
    constructor(id: number,
        codProd: number,
        collezione: string,
        capo: string,
        modello: number,
        quantita: number,
        colore: string,
        prezzoIvaEsclusa: number,
        prezzoIvaInclusa: number,
        disponibile: string,
        saldo: number) {
        super(id, codProd, collezione, capo, modello, quantita, colore, prezzoIvaEsclusa, prezzoIvaInclusa, disponibile, saldo);
    }
    public getSaldoCapo(): number {
        let sconto: number = 0;
        sconto = this.prezzoIvaInclusa * this.saldo / 100;
        return sconto;
    }
    public getAcquistoCapo(): number {
        let costoTotale = this.prezzoIvaInclusa - this.getSaldoCapo();
        costoTotale = Math.round(costoTotale * 10) / 10;
        return costoTotale;
    }
}

window.addEventListener('load', caricaCapi);

function caricaCapi() {
    fetch("./Abbigliamento.json")
        .then(function (response) {
            return response.json();
        })
        .then(function (json) {
            let divVestiti = <HTMLDivElement>document.getElementById('abbigliamento');
            let array = json;
            for (let capo of array) {
                let indumento = new Abbigliamento(capo.id, capo.codprod, capo.collezione, capo.capo, capo.modello, capo.quantita, capo.colore, capo.prezzoivaesclusa, capo.prezzoivainclusa, capo.disponibile, capo.saldo);
                let colore: string = '';
                if (indumento.collezione === 'primavera') {
                    colore = 'lightgreen';
                } else if (indumento.collezione === 'estate') {
                    colore = 'lightyellow';
                } else if (indumento.collezione === 'inverno') {
                    colore = 'lightblue';
                } else {
                    colore = 'lightred';
                }
                divVestiti.innerHTML += `
                <div class="col-lg-4 col-md-6 col-12 bg-trasparent text-dark py-2 px-4">
                    <article class="border border-dark shadow rounded-3">
                        <div class="card w-100 sfondo-${colore}">
                        <!-- <img src="img/image.png" class="card-img-top" alt="..."> -->
                            <div class="card-body text-center w-100">
                                <h1 class="card-title text-uppercase">${indumento.capo}</h1>
                                <div class="d-flex justify-content-around">
                                <p class="card-text text-capitalize">Collezione: ${indumento.collezione}</p>
                                <p class="card-text text-capitalize">Colore: ${indumento.colore}</p>
                                </div>
                                <div class="d-flex justify-content-around">
                                <p class="card-text">Prezzo intero: <span class="text-decoration-line-through">${indumento.prezzoIvaInclusa}€</span></p>
                                <p class="card-text">Saldo: <span class="bg-danger text-white px-2 rounded-2">${indumento.saldo}%</span></p>
                                </div>
                                <p class="card-text"><span class="bg-success text-white fw-bold px-2 rounded-2">Prezzo vendita: ${indumento.getAcquistoCapo()}€</span></p>
                                <button class="btn blue aggiungi" onclick="aggiungi('${indumento.capo}', ${indumento.getAcquistoCapo()})">Carrello</button>
                                
                            </div>
                        </div>
                    </article>
                </div>
                `
            }
        });
}

function aggiungi(capo:string, costo:number) {
    let carrello = <HTMLDivElement>document.getElementById('carrello');
    carrello.innerHTML += `
    <p class="my-2">Hai aggiunto <span class="text-uppercase">${capo}</span> al carrello al costo di <span class="span-parziale">${costo}</span>€</p>
    `
}