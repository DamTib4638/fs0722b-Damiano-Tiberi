class Shape {
    constructor(a) {
        this.Area = a;
    }
}
class Circle extends Shape {
    disp() {
        console.log("Area of the circle: " + this.Area);
    }
}
var oggetto = new Circle(223);
oggetto.disp();
class Root {
}
class Child extends Root {
}
class Leaf extends Child {
}
var obje = new Leaf();
obje.str = "hello";
console.log(obje.str);
