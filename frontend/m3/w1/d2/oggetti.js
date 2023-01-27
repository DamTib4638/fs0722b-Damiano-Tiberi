class Car {
    constructor(engine) {
        this.engine = engine;
    }
    disp() {
        console.log("Engine is : " + this.engine);
    }
}
var ogg = new Car("XXSY1");
console.log("Leggo l'attributo del valore di Engine:" + ogg.engine);
ogg.disp();
