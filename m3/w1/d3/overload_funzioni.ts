// overload list -> quando in una funzione dichiaro tipi diversi
// compilatore -> analizza la lista e cerca la compilazione corretta da invocare in base agli argomenti passati
// possiamo definire più funzioni con lo stesso nome ma che hanno parametri diversi per numero e tipo
// possiamo avere valori di ritorno diversi
// 1. elenco le varie versioni di una funzione (senza il corpo della funzione, ma con i tipi di parametri + dei valori di ritorno)
// 2. definisco le funzioni e assegno i diversi comportamenti
function addiziona(addendo1: number, addendo2: number): number;
function addiziona(addendi: number[]): number;
function addiziona(a: number | number[], b?: number): number {
    if (typeof a === 'number') {
        return a + b;
    }
    return a.reduce(
        (
            parziale: number,
            valoreCorrente: number,
            indiceCorrente: number,
            a: number[]) => {
            return parziale + valoreCorrente;
        });
}
console.log(addiziona(11, 22));             // 33
console.log(addiziona([6, 12, 18, 36]));    // 72