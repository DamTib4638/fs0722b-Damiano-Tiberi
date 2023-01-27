var limite = 120;
var vincolo = Math.floor(Math.sqrt(limite));
console.log(vincolo);
var numeri = creaArrayNumeri(limite);
var listaPrimi = listaNumeriPrimi(numeri, vincolo);
function creaArrayNumeri(numeroMax) {
    let arrayIniziale = [];
    for (let i = 2; i <= numeroMax; i++) {
        arrayIniziale.push(i);
    }
    return arrayIniziale;
}
function listaNumeriPrimi(arrayNumeri, estremo) {
    let risultato = [2];
    let primoElemento = true;
    for (let j = 2; j <= estremo; j++) {
        primoElemento = true;
        for (let i = 0; i <= arrayNumeri.length; i++) {
            if (arrayNumeri[i] % j === 0 && arrayNumeri[i] != risultato[risultato.length - 1]) {
                arrayNumeri.splice(i, 1);
                i--;
            }
            else if (arrayNumeri[i] % j != 0 && primoElemento && arrayNumeri[i] > j) {
                risultato.push(arrayNumeri[i]);
                primoElemento = false;
            }
        }
    }
    return arrayNumeri;
}
