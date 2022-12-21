class MotherAccount {

    /* Proprietà della classe MotherAccount */
    private balanceInit: number = 0;
    private nome: string;
    private cognome: string;

    /* Costruttore della classe MotherAccount */
    // constructor(n: string, c: string) {
    //     this.nome = n;
    //     this.cognome = c;
    // }

    /* Metodi della classe MotherAccount */
    public twoDeposit(v: number): number {
        this.balanceInit += v;
        console.log('Versamento di ' + v + '€ effettuato. Il saldo attuale è: ' + this.saldo + '€');
        return this.balanceInit;
    }

    public twoWithDraw(p: number): void {
        if (p < this.balanceInit) {
            this.balanceInit = this.balanceInit - p;
            console.log('Prelievo di ' + p + '€ effettuato. Il saldo attuale è: ' + this.saldo + '€');
        } else {
            console.log('Prelievo fallito. Saldo inferiore alla cifra richiesta');
        }
    }

    get nomeProprio():string {
        return this.nome;
    }

    set nomeProprio(valore) {
        this.nome = valore;
    }

    get cognomeProprio():string {
        return this.cognome;
    }

    set cognomeProprio(valore) {
        this.cognome = valore;
    }

    get saldo(): number {
        let interesse: number = this.addInterest();
        return this.balanceInit + interesse;
    }

    private addInterest(): number {
        return this.balanceInit * 10 / 100;
    }

    // getNome(): string {
    //     return this.nome;
    // }

    // getCognome(): string {
    //     return this.cognome;
    // }
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
    /* Proprietà della classe SonAccount */
    private balanceInit: number = 0;
    private nome: string;
    private cognome: string;

    /* Costruttore della classe SonAccount */
    // constructor(n: string, c: string) {
    //     this.nome = n;
    //     this.cognome = c;
    // }

    /* Metodi della classe SonAccount */
    oneDeposit(v: number): number {
        this.balanceInit += v;
        console.log('Versamento di ' + v + '€ effettuato. Il saldo attuale è: ' + this.saldo + '€');
        return this.balanceInit;
    }

    oneWithDraw(p: number): void {
        if (p < this.balanceInit) {
            this.balanceInit = this.balanceInit - p;
            console.log('Prelievo di ' + p + '€ effettuato. Il saldo attuale è: ' + this.saldo + '€');
        } else {
            console.log('Prelievo fallito. Saldo inferiore alla cifra richiesta');
        }
    }

    get nomeProprio():string {
        return this.nome;
    }

    set nomeProprio(valore) {
        this.nome = valore;
    }

    get cognomeProprio():string {
        return this.cognome;
    }

    set cognomeProprio(valore) {
        this.cognome = valore;
    }

    get saldo(): number {
        return this.balanceInit;
    }

    // getNome(): string {
    //     return this.nome;
    // }

    // getCognome(): string {
    //     return this.cognome;
    // }
}

let figlio = new SonAccount();
figlio.nomeProprio = 'Damiano';
figlio.cognomeProprio = 'Tiberi';
console.log('Il saldo iniziale di ' + figlio.nomeProprio + ' è di: ' + figlio.saldo);
figlio.oneDeposit(1500);
console.log('Il saldo attuale di ' + figlio.nomeProprio + ' è di: ' + figlio.saldo);
figlio.oneWithDraw(200);
console.log('Il saldo attuale di ' + figlio.nomeProprio + ' è di: ' + figlio.saldo);