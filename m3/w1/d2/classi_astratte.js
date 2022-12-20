class Veicolo {
    constructor(marca, modello, colore) {
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
    }
    vernicia(colore) {
        this.colore = colore;
    }
    coloreCorrente() {
        return this.colore;
    }
}
class Automobile extends Veicolo {
    constructor(marca, modello, colore) {
        super(marca, modello, colore);
    }
    dettagliVeicolo() {
        return `${this.marca} - ${this.modello}`;
    }
}
const jaguars = new Automobile('Jaguar', 'F-Type', 'nero');
console.log(jaguars.dettagliVeicolo());
console.log(jaguars.coloreCorrente());
jaguars.vernicia('rosso');
console.log(jaguars.coloreCorrente());
