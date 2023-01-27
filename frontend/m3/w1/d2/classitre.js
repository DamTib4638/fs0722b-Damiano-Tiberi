class PrinterClass {
    doPrint() {
        console.log("doPrint() from Parent called...");
    }
}
class StringPrinter extends PrinterClass {
    doPrint() {
        super.doPrint();
        console.log("doPrint() is printing a string..");
    }
}
var obw = new StringPrinter();
obw.doPrint();
