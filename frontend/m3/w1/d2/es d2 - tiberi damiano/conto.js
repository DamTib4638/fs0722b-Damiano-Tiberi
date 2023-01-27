class MotherAccount {
    constructor() {
        this.balanceInit = 0;
    }
    twoDeposit(v) {
        this.balanceInit += v;
        console.log('Versamento di ' + v + '€ effettuato. Il saldo attuale è: ' + this.saldo + '€');
        return this.balanceInit;
    }
    twoWithDraw(p) {
        if (p < this.balanceInit) {
            this.balanceInit = this.balanceInit - p;
            console.log('Prelievo di ' + p + '€ effettuato. Il saldo attuale è: ' + this.saldo + '€');
        }
        else {
            console.log('Prelievo fallito. Saldo inferiore alla cifra richiesta');
        }
    }
    get nomeProprio() {
        return this.nome;
    }
    set nomeProprio(valore) {
        this.nome = valore;
    }
    get cognomeProprio() {
        return this.cognome;
    }
    set cognomeProprio(valore) {
        this.cognome = valore;
    }
    get saldo() {
        let interesse = this.addInterest();
        return this.balanceInit + interesse;
    }
    addInterest() {
        return this.balanceInit * 10 / 100;
    }
}
let signora = new MotherAccount();
signora.nomeProprio = 'Grazia';
signora.cognomeProprio = 'Graziella';
console.log('Il saldo iniziale di ' + signora.nomeProprio + ' è di: ' + signora.saldo);
signora.twoDeposit(5000);
console.log('Il saldo attuale di ' + signora.nomeProprio + ' è di: ' + signora.saldo);
signora.twoWithDraw(1000);
console.log('Il saldo attuale di ' + signora.nomeProprio + ' è di: ' + signora.saldo);
class SonAccount {
    constructor() {
        this.balanceInit = 0;
    }
    oneDeposit(v) {
        this.balanceInit += v;
        console.log('Versamento di ' + v + '€ effettuato. Il saldo attuale è: ' + this.saldo + '€');
        return this.balanceInit;
    }
    oneWithDraw(p) {
        if (p < this.balanceInit) {
            this.balanceInit = this.balanceInit - p;
            console.log('Prelievo di ' + p + '€ effettuato. Il saldo attuale è: ' + this.saldo + '€');
        }
        else {
            console.log('Prelievo fallito. Saldo inferiore alla cifra richiesta');
        }
    }
    get nomeProprio() {
        return this.nome;
    }
    set nomeProprio(valore) {
        this.nome = valore;
    }
    get cognomeProprio() {
        return this.cognome;
    }
    set cognomeProprio(valore) {
        this.cognome = valore;
    }
    get saldo() {
        return this.balanceInit;
    }
}
let figlio = new SonAccount();
figlio.nomeProprio = 'Damiano';
figlio.cognomeProprio = 'Tiberi';
console.log('Il saldo iniziale di ' + figlio.nomeProprio + ' è di: ' + figlio.saldo);
figlio.oneDeposit(1500);
console.log('Il saldo attuale di ' + figlio.nomeProprio + ' è di: ' + figlio.saldo);
figlio.oneWithDraw(200);
console.log('Il saldo attuale di ' + figlio.nomeProprio + ' è di: ' + figlio.saldo);
