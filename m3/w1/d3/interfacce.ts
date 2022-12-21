/* Il type system è un tipo strutturale (Structural type system).
    Il compiler quando fa il controllo/la comparazione dei tipi di dato si basa sulla struttura/forma.
*/
function inviaMessaggio(msg: { email: string, messaggio: string }) {
    // il parametro indica che viene accettato un oggetto che ha almeno le proprietà email e messaggio



    // mailSender.sendTo(msg.email, msg.messaggio) // da errore perchè non abbiamo creato l'oggetto mailSender



    // al netto che non creo l'oggetto mailSender
    var mioMessaggio = { email: '', messaggio: '' };
    inviaMessaggio(mioMessaggio); // questa chiamata è corretta perchè ci sono i parametri attesi

    var mioMessaggio2 = { messaggio: 'Ciao' };



    // inviaMessaggio(mioMessaggio2); // da errore, perchè non rispetta i vincoli



    // questa chiamata genera un errore perchè quando compilo l'oggetto non contiene la proprietà email
}
// -> una volta che dichiariamo una struttura per il parametro della funzione ts, verifica che effettivamente venga passato un oggetto con quella struttura.
// -> Typescript consente la definizione di un'interfaccia che definisce la struttura del nostro parametro
interface Messaggio {
    email: string;
    messaggio: string;
} // interface consente di definire il tipo di dato (messaggio nel nostro caso), Typescript quando compila verifica la struttura
// in questo modo si potrà utilizzare Messaggio come se fosse un tipo di dato predefinito (ad esempio riusarlo nella nostra app)
function inviaMessaggio2(msg: Messaggio) {



    // mailSender.sendTo(msg.email, msg.messaggio); // da errore perchè non abbiamo creato l'oggetto mailSender



}
// la struttura dichiarata dell'interfaccia rappresenta gli elementi minimi che un oggetto deve avere
var mioMessaggio3 = {
    email: '',
    messaggio: '',
    data: new Date()
}; // il fatto che la proprietà data non è prevista, non pregiudica la compatibilità dell'oggetto col tipo previsto
interface Messaggio2 {
    email: string;
    nomeDestinatario?: string; // elementi opzionali -> sono accettati se presenti, ma non da errore se sono assenti
    oggetto?: string; // elementi opzionali -> sono accettati se presenti, ma non da errore se sono assenti
    messaggio: string;
}

// le interfacce non descrivono solo oggetti ma anche altri elementi del linguaggio
// ad esempio definisco una funzione numerica che opera su valori numerici
interface FunzioneNumerica {
    (x:number, y:number):number; // prendo due valori numerici in input e restituisco un numero
}
// faccio una funzione del tipo appena dichiarato
var somma: FunzioneNumerica;
somma = function(a:number, b:number) {  // dichiarare il tipo non ci obbliga ad usare gli stessi nomi dei parametri
    return a+b;                         // l'unica cosa importante è che i tipi dei dati siano corrispondenti
}

// possiamo anche dichiarare delle interfacce che descrivono degli array
interface ArrayDiStringhe {
    [index:number]:string // definisco il tipo dell'indice (number) e il tipo di ciascun elemento (string)
}
var x1: ArrayDiStringhe = ['uno', 'due', 'tre'];

// per l'indice dell'array oltre al tipo number è previsto anche il tipo string
interface Dizionario {
    [index:string]:string;
}
var x2: Dizionario;
x2['chiave1']='valore1';
x2['chiave2']='valore2';
// per l'indice i tipi di dati possibili sono solo number e string, per gli elementi dell'array possiamo usare qualsiasi tipo
// Ad esempio: array di oggetti
interface ArrayDiOggetti {
    [index:number]: {id:number, label:string}
}
var x3: ArrayDiOggetti = [
    {id:1, label:'aaa'},
    {id:2, label:'bbb'}
];