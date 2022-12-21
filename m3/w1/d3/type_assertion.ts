// Type assertion -> imposta il tipo di un valore e dice al compilatore di non inferirlo
// lo usiamo quando abbiamo una comprensione migliore del tipo di dato rispetto a ciò che TS deduce da solo
let cod: any = 123;
let employeeCod = <number> cod;
console.log(typeof(employeeCod));   // è di tipo number (sarebbe il cast), anche se è stato dichiarato any
                                    // abbiamo asserito che in questo caso il codice è di tipo number
let employee = {};
// employee.nome = 'John'; // errore -> proprietà nome non esiste nel type {}
// employee.cod = 123; // errore -> proprietà cod non esiste nel type {}
interface Employee {
    nome:string;
    code: number;
}
let employee2 = <Employee> {}   // uso l'interfaccia per fare asserzione di tipo
employee2.nome = 'John';        // ok
employee2.code = 123;           // ok
console.log(typeof(employee2.nome));
console.log(typeof(employee2.code));
console.log(employee2.nome);
console.log(employee2.code);