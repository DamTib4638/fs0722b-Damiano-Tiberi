class Persona {
    constructor(nome, cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
    visualizzaNomeCompleto() {
        return this.nome + ' ' + this.cognome;
    }
}
var Materie;
(function (Materie) {
    Materie[Materie["Storia"] = 0] = "Storia";
    Materie[Materie["Informatica"] = 1] = "Informatica";
    Materie[Materie["Matematica"] = 2] = "Matematica";
    Materie[Materie["Html"] = 3] = "Html";
    Materie[Materie["Css"] = 4] = "Css";
    Materie[Materie["Javascript"] = 5] = "Javascript";
})(Materie || (Materie = {}));
;
class Strudente {
    constructor(nome, cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.materie = [];
    }
    visualizzaNomeCompleto() {
        return this.nome + ' ' + this.cognome;
    }
}
class Studente2 {
    constructor(nome, cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.materie = [];
    }
    visualizzaNomeCompleto() {
        return this.nome + ' ' + this.cognome;
    }
}
class Studente3 {
    constructor(nome, cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.materie = [];
    }
    visualizzaNomeCompleto() {
        return this.nome + ' ' + this.cognome;
    }
}
