export class Paginazione {
    items = [];
    pageSize = 10;
    paginaCorrente = 1;

    constructor (lista, numero) {
        this.items = lista ? lista : [];
        this.pageSize = numero > 0 ? numero : 10;
    }

    totalePagine() {
        return Math.ceil(this.items.length / this.pageSize);
    }
    primaPagina() {
        return this.paginaCorrente = 1;
    }
    ultimaPagina() {
        return this.paginaCorrente = this.totalePagine();
    }
    paginaPrecedente() {
        return this.paginaCorrente == 1 ? this.paginaCorrente : this.paginaCorrente--;
    }
    paginaSuccessiva() {
        return this.paginaCorrente == this.totalePagine() ? this.paginaCorrente : this.paginaCorrente++;
    }
    suddivisioneInPagine() {
        let inf = (this.pageSize * (this.paginaCorrente - 1));
        let sup = (this.pageSize * (this.paginaCorrente - 1)) + 1;
        let result = this.items.slice(inf, sup+1);
        return result;
    }
}