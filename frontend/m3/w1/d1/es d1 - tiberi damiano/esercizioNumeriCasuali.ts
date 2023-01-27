var numeroGiocatore1: number = assegnaNumeroCasuale();
var numeroGiocatore2: number = assegnaNumeroCasuale();
console.log('Numero giocatore 1: ' + numeroGiocatore1);
console.log('Numero giocatore 2: ' + numeroGiocatore2);

function verificaVincita(n1:number, n2:number): void {
    var numeroVincente: number = assegnaNumeroCasuale();
    console.log('Il numero vincente estratto è: ' + numeroVincente);
    if (numeroVincente === n1) {
        console.log('Il giocatore 1 ha indovinato il numero vincente');
    } else if (numeroVincente === n2) {
        console.log('Il giocatore 2 ha indovinato il numero vincente');
    } else {
        let avvicinamentoGiocatore1: number = Math.abs(numeroVincente-n1);
        let avvicinamentoGiocatore2: number = Math.abs(numeroVincente-n2);
        if (avvicinamentoGiocatore1<avvicinamentoGiocatore2) {
            console.log('Nessun giocatore ha indovinato il numero, ma il Giocatore 1 si è avvicinato di più');
        } else {
            console.log('Nessun giocatore ha indovinato il numero, ma il Giocatore 2 si è avvicinato di più');
        }
        console.log('Il giocatore 1 è andato lontano di ' + avvicinamentoGiocatore1 + ' passi');
        console.log('Il giocatore 2 è andato lontano di ' + avvicinamentoGiocatore2 + ' passi');
    }
}

function assegnaNumeroCasuale () {
    return Math.floor(Math.random()*(100-1)+1);
}

verificaVincita(numeroGiocatore1, numeroGiocatore2);