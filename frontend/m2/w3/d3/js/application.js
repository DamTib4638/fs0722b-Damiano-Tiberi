salvaIlDato = function(info) {
    localStorage.ultimoPensiero = info;
    alert('memorizzazione effettuata');
};
recuperaIlDato = function(elemento) {
    if(confirm('Sostituire il contenuto attuale con il last?')) {
        elemento.value = localStorage.ultimoPensiero;
    }
};