// tuple -> è un nuovo tipo di dato introdotto da TS
// ci serve a definire un array che ha elementi di tipi diversi tra loro
// fissare il tipo di un numero di elementi (ad esempio i primi due) -> array avrà uno chema preciso dei tipi di dati
// array in cui voglio memorizzare nome ed età di una persona -> il primo elemento sarà string, il secondo sarà number
var persona: [string, number] = ['Mario Rossi', 25]; // mantieni l'ordine
// le tuple non hanno una dimensione fissa -> posso aggiungere senza definire i tipi
// è possibile aggiungere altri elementi purchè dello stesso tipo di dati dichiarato
// le tuple vincolano al rispetto dei tipi dichiarati
// persona[4] = true; // non è previsto nella dichiarazione della tupla