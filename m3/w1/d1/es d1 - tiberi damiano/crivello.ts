var limite: number = 120;
var vincolo = Math.floor(Math.sqrt(limite));
var numeri: number[] = creaArrayNumeri(limite);
var listaPrimi: number[] = listaNumeriPrimi(numeri, vincolo);

function creaArrayNumeri(numeroMax: number) {
    let arrayIniziale: number[] = [];
    for (let i: number = 2; i <= numeroMax; i++) {
        arrayIniziale.push(i);
    }
    return arrayIniziale;
}

function listaNumeriPrimi(arrayNumeri: number[], estremo: number) {
    let risultato: number[] = [2];
    let primoElemento: boolean = true;
    // let indice: number = 0;
    for (let j: number = 2; j < estremo; j++) {
        primoElemento = true;
        for (let i: number = 0; i <= arrayNumeri.length; i++) {
            if (arrayNumeri[i] % j === 0 && arrayNumeri[i] != risultato[risultato.length-1]) {
                arrayNumeri.splice(i, 1);
            } else if (arrayNumeri[i] % j != 0 && primoElemento) {
                risultato.push(arrayNumeri[i]);
                primoElemento = false;
            }
        }
    }
    return risultato;
}
console.log(listaPrimi);