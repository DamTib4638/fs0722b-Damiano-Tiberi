// interface -> è un modo di definire dei tipi personalizzati in TS
// interface -> è una sorta di vincolo di contratto, cioè stabilisce come un oggetto può interagire con un altro oggetto
// interface -> definisce i membri che una classe deve avere, così che gli oggetti che devono interagire sanno che proprietà/metodi devono avere/chiamare.
interface IPersona {
    nome:string;
    cognome:string;
    visualizzaNomeCompleto():string;
}
// una classe che vuole interagire con l'interfaccia deve "aderire al contratto" e cioè avere nome, cognome e visualizzaNomeCompleto; inoltre, queste proprietà/metodi devono essere string.
class Persona implements IPersona { // la classe Persona dichiara di implementare l'interfaccia IPersona tramite la key implements
    nome:string;
    cognome:string;
    constructor(nome:string, cognome:string) {
        this.nome = nome;
        this.cognome = cognome;
    }
    visualizzaNomeCompleto():string {
        return this.nome + ' ' + this.cognome;
    }
}

// implemento una proprietà non prevista dall'interfaccia
enum Materie {Storia, Informatica, Matematica, Html, Css, Javascript};
class Strudente implements IPersona {
    nome:string;
    cognome:string;
    materie: Materie[];
    // sto implementando una proprietà che non è prevista nell'interfaccia (interfaccia da solo il vincolo minimo dei membri di una classe)
    constructor(nome:string, cognome:string) {
        this.nome = nome;
        this.cognome = cognome;
        this.materie = [];
    }
    visualizzaNomeCompleto():string {
        return this.nome + ' ' + this.cognome;
    }
}

// posso implementare più interfacce contemporaneamente
interface IStudio {
    materie: Materie[];
}

class Studente2 implements IPersona, IStudio {
    nome:string;
    cognome:string;
    materie: Materie[];
    constructor(nome:string, cognome:string) {
        this.nome = nome;
        this.cognome = cognome;
        this.materie = [];
    }
    visualizzaNomeCompleto():string {
        return this.nome + ' ' + this.cognome;
    }
}
// Typescript prevede l'estendibilità delle interfacce -> definiamo una nuova interfaccia ereditante le caratteristiche definite in un'altra interfaccia.
interface IStudente extends IPersona {
    materie: Materie[];
}

class Studente3 implements IStudente {
    nome:string;
    cognome:string;
    materie: Materie[];
    constructor(nome:string, cognome:string) {
        this.nome = nome;
        this.cognome = cognome;
        this.materie = [];
    }
    visualizzaNomeCompleto():string {
        return this.nome + ' ' + this.cognome;
    }
}