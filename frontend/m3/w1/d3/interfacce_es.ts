// le interfacce sono un contratto sintattico; definiscono la sintassi a cui deve aderire qualsiasi entità
// le interfacce definiscono proprietà/metodi che sono i membri dell'interfaccia (contengono solo le dichiarazioni dei membri)
// sarà nelle classi derivate che andremo a definire i membri -> fornisco una struttura standard che le classi seguono

interface IPersona2 {
    nome:string,
    cognome:string,
    saluta: () => string;
}
var essere: IPersona2 = { // lìoggetto ha il vincolo definito nell'interfaccia
    nome:'Tom',
    cognome:'Hanks',
    saluta: ():string => {return 'Ciao'}
}

console.log(essere.nome);
console.log(essere.cognome);
console.log(essere.saluta());

var essere: IPersona2 = { // lìoggetto ha il vincolo definito nell'interfaccia
    nome:'Damiano',
    cognome:'Tiberi',
    saluta: ():string => {return 'Buondì'}
}

console.log(essere.nome);
console.log(essere.cognome);
console.log(essere.saluta());

// ereditarietà
interface Person {
    age:number;
}
interface Musicista extends Person {
    strumento: string;
}
var drummer = <Musicista>{};
drummer.age = 35;
drummer.strumento = 'Batteria';
console.log('Age: ' + drummer.age);
console.log('Strumento: ' + drummer.strumento);
