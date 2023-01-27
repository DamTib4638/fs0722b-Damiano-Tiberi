class Vehicle2 {
    constructor(marca, modello, tipoVeicolo) {
        this.marca = marca;
        this.modello = modello;
        this.tipoVeicolo = tipoVeicolo;
    }
    dettagliVeicolo() {
        return `${this.tipoVeicolo} - ${this.marca} - ${this.modello}`;
    }
}
class Cars2 extends Vehicle2 {
    constructor(marca, modello) {
        super(marca, modello, 'auto');
    }
    dettagliVeicolo() {
        console.log('Dettagli auto:');
        return super.dettagliVeicolo();
    }
}
const jaguar2 = new Cars2('Jaguar', 'F-Type');
const ducati2 = new Motorbike('Ducati', 'Panigale V4');
console.log(jaguar instanceof Cars);
console.log(jaguar.dettagliVeicolo());
console.log(jaguar.marca);
console.log(jaguar.modello);
console.log(jaguar.tipoVeicolo);
