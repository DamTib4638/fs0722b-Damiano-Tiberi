function addiziona(a, b) {
    if (typeof a === 'number') {
        return a + b;
    }
    return a.reduce((parziale, valoreCorrente, indiceCorrente, a) => {
        return parziale + valoreCorrente;
    });
}
console.log(addiziona(11, 22));
console.log(addiziona([6, 12, 18, 36]));
