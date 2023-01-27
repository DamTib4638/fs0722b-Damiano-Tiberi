class Lavoratore {
    constructor(nome, cognome, redditoAnnuoLordo, codReddito) {
        this.tasseInps = 0;
        this.tasseIrpef = 0;
        this.nome = nome;
        this.cognome = cognome;
        this.redditoAnnuoLordo = redditoAnnuoLordo;
        this.codReddito = codReddito;
    }
    get redditoAnnuoNetto() {
        let guadagno = this.redditoAnnuoLordo - this.getTasseInps(this.getUtileTasse()) - this.getTasseIrpef(this.getUtileTasse());
        return guadagno;
    }
    getTasseInps(tasse) {
        this.tasseInps = tasse * 50 / 100;
        return this.tasseInps;
    }
    getTasseIrpef(tasse) {
        this.tasseIrpef = tasse * 50 / 100;
        return this.tasseIrpef;
    }
}
class Medico extends Lavoratore {
    constructor(nome, cognome, redditoAnnuoLordo) {
        super(nome, cognome, redditoAnnuoLordo, 2);
    }
    getUtileTasse() {
        let totaleTasse = this.redditoAnnuoLordo * (2 * 20) / 100;
        return totaleTasse;
    }
}
class Sviluppatore extends Lavoratore {
    constructor(nome, cognome, redditoAnnuoLordo) {
        super(nome, cognome, redditoAnnuoLordo, 1);
    }
    getUtileTasse() {
        let totaleTasse = this.redditoAnnuoLordo * (1 * 20) / 100;
        return totaleTasse;
    }
}
class Magazziniere extends Lavoratore {
    constructor(nome, cognome, redditoAnnuoLordo) {
        super(nome, cognome, redditoAnnuoLordo, 0.5);
    }
    getUtileTasse() {
        let totaleTasse = this.redditoAnnuoLordo * (0.5 * 20) / 100;
        return totaleTasse;
    }
}
class Pilota extends Lavoratore {
    constructor(nome, cognome, redditoAnnuoLordo) {
        super(nome, cognome, redditoAnnuoLordo, 3);
    }
    getUtileTasse() {
        let totaleTasse = this.redditoAnnuoLordo * (3 * 20) / 100;
        return totaleTasse;
    }
}
let medico = new Medico('Anna', 'Annina', 40000);
let pilota = new Pilota('Mario', 'Mariano', 100000);
let sviluppatore = new Sviluppatore('Pippo', 'Pluto', 25000);
let magazziniere = new Magazziniere('Lino', 'Piso', 18000);
console.log('MEDICO: ' + medico.nome + ' ' + medico.cognome);
console.log('Reddito annuo netto: ' + medico.redditoAnnuoNetto + '€');
console.log(' ');
console.log('PILOTA: ' + pilota.nome + ' ' + pilota.cognome);
console.log('Reddito annuo netto: ' + pilota.redditoAnnuoNetto + '€');
console.log(' ');
console.log('MAGAZZINIERE: ' + magazziniere.nome + ' ' + magazziniere.cognome);
console.log('Reddito annuo netto: ' + magazziniere.redditoAnnuoNetto + '€');
console.log(' ');
console.log('SVILUPPATORE: ' + sviluppatore.nome + ' ' + sviluppatore.cognome);
console.log('Reddito annuo netto: ' + sviluppatore.redditoAnnuoNetto + '€');
