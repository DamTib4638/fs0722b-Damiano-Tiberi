var limite: number = 120;
var vincolo = Math.floor(Math.sqrt(limite));
console.log(vincolo);
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
    for (let j: number = 2; j <= estremo; j++) {
        primoElemento = true;
        for (let i: number = 0; i <= arrayNumeri.length; i++) {
            if (arrayNumeri[i] % j === 0 && arrayNumeri[i] != risultato[risultato.length-1]) {
                arrayNumeri.splice(i, 1);
                i--;
            } else if (arrayNumeri[i] % j != 0 && primoElemento && arrayNumeri[i] > j) {
                risultato.push(arrayNumeri[i]); // serve per non eliminare i numeri primi minori di estremo che andrebbero via a causa di loro stessi.
                primoElemento = false;
            }
        }
    }
    console.log(risultato);
    console.log(arrayNumeri);
    return arrayNumeri;
}
// console.log(listaPrimi);