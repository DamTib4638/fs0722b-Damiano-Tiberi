window.onload = function () {
    let p = document.querySelector('#testo');
    if (typeof (Storage) != undefined) {
        if (!sessionStorage.forward) {
            sessionStorage.forward = 1;
        }
        p.innerHTML = `${sessionStorage.forward} seconds passed on this Session`
        setInterval(() => {
            sessionStorage.forward = Number(sessionStorage.forward) + 1
            p.innerHTML = `${sessionStorage.forward} seconds passed on this Session`
        }, 1000);
        
    } else {
        p.innerHTML = 'Il tuo browser non supporta Web Storage...'
    }
}