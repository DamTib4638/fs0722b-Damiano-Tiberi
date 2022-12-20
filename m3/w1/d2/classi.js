class Vehicle {
    constructor(marca, modello, tipoVeicolo) {
        this.marca = marca;
        this.modello = modello;
        this.tipoVeicolo = tipoVeicolo;
    }
    dettagliVeicolo() {
        return `${this.tipoVeicolo} - ${this.marca} - ${this.modello}`;
    }
}
class Cars extends Vehicle {
    constructor(marca, modello) {
        super(marca, modello, 'auto');
    }
}
class Motorbike extends Vehicle {
    constructor(marca, modello) {
        super(marca, modello, 'moto');
    }
}
const jaguar = new Cars('Jaguar', 'F-Type');
const ducati = new Motorbike('Ducati', 'Panigale V4');
console.log(jaguar instanceof Cars);
console.log(ducati instanceof Motorbike);
console.log(ducati instanceof Cars);
