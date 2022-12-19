var limite = 120;
var vincolo = Math.floor(Math.sqrt(limite));
var numeri = creaArrayNumeri(limite);
var listaPrimi = listaNumeriPrimi(numeri, vincolo);
function creaArrayNumeri(numeroMax) {
    var arrayIniziale = [];
    for (var i = 2; i <= numeroMax; i++) {
        arrayIniziale.push(i);
    }
    return arrayIniziale;
}
function listaNumeriPrimi(arrayNumeri, estremo) {
    var risultato = [2];
    var primoElemento = true;
    // let indice: number = 0;
    for (var j = 2; j < estremo; j++) {
        primoElemento = true;
        for (var i = 0; i <= arrayNumeri.length; i++) {
            if (arrayNumeri[i] % j === 0 && arrayNumeri[i] != risultato[risultato.length - 1]) {
                arrayNumeri.splice(i, 1);
            }
            else if (arrayNumeri[i] % j != 0 && primoElemento) {
                risultato.push(arrayNumeri[i]);
                primoElemento = false;
            }
        }
    }
    return risultato;
}
console.log(listaPrimi);
