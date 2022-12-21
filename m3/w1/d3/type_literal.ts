// tipi letterali -> possiamo definire un set customizzato di valori possibili
// non solo string, number, boolean ma possiamo specificare che valori esatti le nostre stringhe, numeri, booleani possono avere
// riduzione -> elenco i casi potenziali possibili
type testResult = 'passato' | 'fallito' | 'incompleto';
let myResult: testResult;   // i valori possibili sono quelli che ho elencato
myResult = 'incompleto';    // valido
myResult = 'passato';       // valido
// myResult = 'fallimento';    // non valido

type dado = 1 | 2 | 3 | 4 | 5 | 6 ;
let tiroDado: dado;
tiroDado = 1;   // valido
tiroDado = 5;   // valido
// tiroDado = 10;  // non valido
