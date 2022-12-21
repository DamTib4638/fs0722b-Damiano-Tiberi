class Lavoratore {
    constructor(nome, cognome, redditoAnnuoLordo, codReddito) {
        this.tasseInps = 0;
        this.tasseIrpef = 0;
        this.nome = nome;
        this.cognome = cognome;
        this.redditoAnnuoLordo = redditoAnnuoLordo;
        this.codReddito = codReddito;
    }
}
class Medico extends Lavoratore {
    constructor(nome, cognome, redditoAnnuoLordo) {
        super(nome, cognome, redditoAnnuoLordo, 2);
    }
    getTasseInps(tasse) {
        this.tasseInps = tasse * 50 / 100;
        return this.tasseInps;
    }
    getTasseIrpef(tasse) {
        this.tasseIrpef = tasse * 50 / 100;
        return this.tasseIrpef;
    }
    getUtileTasse() {
        let totaleTasse = this.redditoAnnuoLordo * (2 * 20) / 100;
        return totaleTasse;
    }
    get redditoAnnuoNetto() {
        let guadagno = this.redditoAnnuoLordo - this.getTasseInps(this.getUtileTasse()) - this.getTasseIrpef(this.getUtileTasse());
        return guadagno;
    }
}
class Sviluppatore extends Lavoratore {
    constructor(nome, cognome, redditoAnnuoLordo) {
        super(nome, cognome, redditoAnnuoLordo, 1);
    }
    getTasseInps(tasse) {
        this.tasseInps = tasse * 50 / 100;
        return this.tasseInps;
    }
    getTasseIrpef(tasse) {
        this.tasseIrpef = tasse * 50 / 100;
        return this.tasseIrpef;
    }
    getUtileTasse() {
        let totaleTasse = this.redditoAnnuoLordo * (1 * 20) / 100;
        return totaleTasse;
    }
    get redditoAnnuoNetto() {
        let guadagno = this.redditoAnnuoLordo - this.getTasseInps(this.getUtileTasse()) - this.getTasseIrpef(this.getUtileTasse());
        return guadagno;
    }
}
class Magazziniere extends Lavoratore {
    constructor(nome, cognome, redditoAnnuoLordo) {
        super(nome, cognome, redditoAnnuoLordo, 0.5);
    }
    getTasseInps(tasse) {
        this.tasseInps = tasse * 50 / 100;
        return this.tasseInps;
    }
    getTasseIrpef(tasse) {
        this.tasseIrpef = tasse * 50 / 100;
        return this.tasseIrpef;
    }
    getUtileTasse() {
        let totaleTasse = this.redditoAnnuoLordo * (0.5 * 20) / 100;
        return totaleTasse;
    }
    get redditoAnnuoNetto() {
        let guadagno = this.redditoAnnuoLordo - this.getTasseInps(this.getUtileTasse()) - this.getTasseIrpef(this.getUtileTasse());
        return guadagno;
    }
}
class Pilota extends Lavoratore {
    constructor(nome, cognome, redditoAnnuoLordo) {
        super(nome, cognome, redditoAnnuoLordo, 3);
    }
    getTasseInps(tasse) {
        this.tasseInps = tasse * 50 / 100;
        return this.tasseInps;
    }
    getTasseIrpef(tasse) {
        this.tasseIrpef = tasse * 50 / 100;
        return this.tasseIrpef;
    }
    getUtileTasse() {
        let totaleTasse = this.redditoAnnuoLordo * (3 * 20) / 100;
        return totaleTasse;
    }
    get redditoAnnuoNetto() {
        let guadagno = this.redditoAnnuoLordo - this.getTasseInps(this.getUtileTasse()) - this.getTasseIrpef(this.getUtileTasse());
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
