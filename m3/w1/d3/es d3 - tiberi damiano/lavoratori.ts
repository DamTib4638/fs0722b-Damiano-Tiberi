abstract class Lavoratore {
    protected nome: string;
    protected cognome: string;
    protected codReddito: number;
    protected redditoAnnuoLordo: number;
    protected tasseInps: number = 0;
    protected tasseIrpef: number = 0;

    constructor(nome, cognome, redditoAnnuoLordo, codReddito) {
        this.nome = nome;
        this.cognome = cognome;
        this.redditoAnnuoLordo = redditoAnnuoLordo;
        this.codReddito = codReddito;
    }

    public abstract get redditoAnnuoNetto(): number

    public abstract getTasseInps(tasse:number):number

    public abstract getTasseIrpef(tasse:number):number

    public abstract getUtileTasse(): number;

    /* metodi get */
    // get getNome() {
    //     return this.nome;
    // }
    // get getCognome() {
    //     return this.cognome;
    // }
    // get getCodFis() {
    //     return this.codFis;
    // }
    // get getEta() {
    //     return this.eta;
    // }
    /* metodi set */
    // set setNome(val) {
    //     this.nome = val;
    // }
    // set setCognome(val) {
    //     this.cognome = val;
    // }
    // set setCodFis(val) {
    //     this.codFis = val;
    // }
    // set setEta(val) {
    //     this.eta = val;
    // }
}

class Medico extends Lavoratore {
    constructor (nome, cognome, redditoAnnuoLordo) {
        super(nome, cognome, redditoAnnuoLordo, 2);
    }
    public getTasseInps(tasse:number):number {
        this.tasseInps = tasse * 50 / 100;
        return this.tasseInps;
    }
    public getTasseIrpef(tasse:number):number {
        this.tasseIrpef = tasse * 50 / 100;
        return this.tasseIrpef;
    }
    public getUtileTasse(): number {
        let totaleTasse = this.redditoAnnuoLordo * (2 * 20) / 100;
        return totaleTasse;
    }
    public get redditoAnnuoNetto(): number {
        let guadagno: number = this.redditoAnnuoLordo - this.getTasseInps(this.getUtileTasse()) - this.getTasseIrpef(this.getUtileTasse());
        return guadagno;
    }
}
class Sviluppatore extends Lavoratore {
    constructor (nome, cognome, redditoAnnuoLordo) {
        super(nome, cognome, redditoAnnuoLordo, 1);
    }
    public getTasseInps(tasse:number):number {
        this.tasseInps = tasse * 50 / 100;
        return this.tasseInps;
    }
    public getTasseIrpef(tasse:number):number {
        this.tasseIrpef = tasse * 50 / 100;
        return this.tasseIrpef;
    }
    public getUtileTasse(): number {
        let totaleTasse = this.redditoAnnuoLordo * (1 * 20) / 100;
        return totaleTasse;
    }
    public get redditoAnnuoNetto(): number {
        let guadagno: number = this.redditoAnnuoLordo - this.getTasseInps(this.getUtileTasse()) - this.getTasseIrpef(this.getUtileTasse());
        return guadagno;
    }
}
class Magazziniere extends Lavoratore {
    constructor (nome, cognome, redditoAnnuoLordo) {
        super(nome, cognome, redditoAnnuoLordo, 0.5);
    }
    public getTasseInps(tasse:number):number {
        this.tasseInps = tasse * 50 / 100;
        return this.tasseInps;
    }
    public getTasseIrpef(tasse:number):number {
        this.tasseIrpef = tasse * 50 / 100;
        return this.tasseIrpef;
    }
    public getUtileTasse(): number {
        let totaleTasse = this.redditoAnnuoLordo * (0.5 * 20) / 100;
        return totaleTasse;
    }
    public get redditoAnnuoNetto(): number {
        let guadagno: number = this.redditoAnnuoLordo - this.getTasseInps(this.getUtileTasse()) - this.getTasseIrpef(this.getUtileTasse());
        return guadagno;
    }
}
class Pilota extends Lavoratore {
    constructor (nome, cognome, redditoAnnuoLordo) {
        super(nome, cognome, redditoAnnuoLordo, 3);
    }
    public getTasseInps(tasse:number):number {
        this.tasseInps = tasse * 50 / 100;
        return this.tasseInps;
    }
    public getTasseIrpef(tasse:number):number {
        this.tasseIrpef = tasse * 50 / 100;
        return this.tasseIrpef;
    }
    public getUtileTasse(): number {
        let totaleTasse = this.redditoAnnuoLordo * (3 * 20) / 100;
        return totaleTasse;
    }
    public get redditoAnnuoNetto(): number {
        let guadagno: number = this.redditoAnnuoLordo - this.getTasseInps(this.getUtileTasse()) - this.getTasseIrpef(this.getUtileTasse());
        return guadagno;
    }
}

let medico = new Medico('Anna', 'Annina', 40000);
let pilota = new Pilota('Mario', 'Mariano', 100000);
let sviluppatore = new Sviluppatore('Pippo', 'Pluto', 25000);
let magazziniere = new Magazziniere('Lino', 'Piso', 18000);
console.log('MEDICO');
console.log('Reddito annuo netto medico: ' + medico.redditoAnnuoNetto + '€');
console.log('PILOTA');
console.log('Reddito annuo netto medico: ' + pilota.redditoAnnuoNetto + '€');
console.log('MAGAZZINIERE');
console.log('Reddito annuo netto medico: ' + magazziniere.redditoAnnuoNetto + '€');
console.log('SVILUPPATORE');
console.log('Reddito annuo netto medico: ' + sviluppatore.redditoAnnuoNetto + '€');