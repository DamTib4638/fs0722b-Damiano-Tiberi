export class Persona {
    nome;
    cognome;
    eta;
    constructor (_nome, _cognome, _eta) {
        this.nome = _nome;
        this.cognome = _cognome;
        this.eta = _eta;
    }

    confrontaEta(p1, p2) {
        if (p1.eta > p2.eta) {
            return `${p1.nome} ${p1.cognome} è più vecchio di ${p2.nome} ${p2.cognome}`;
        } else if (p1.eta == p2.eta) {
            return ``;
        }
        return `${p2.nome} ${p2.cognome} è più vecchio di ${p1.nome} ${p1.cognome}`
    }
}