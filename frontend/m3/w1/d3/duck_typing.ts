// duck-typing -> due oggetti sono considerati dello stesso tipo se condividono lo stesso insieme di proprietà
// TS verifica la presenza delle proprietà negli oggetti
interface IPoint {
    x:number;
    y:number
}
function addPoints (p1:IPoint, p2:IPoint):IPoint {
    var x = p1.x + p2.x;
    var y = p1.y + p2.y;
    return {x:x, y:y}
}
var newPoint = addPoints({x:3, y:4}, {x:5, y:1})    // struttura valida
// var newPoint = addPoints({x:3}, {x:5, y:1})    // struttura non valida, manca la prima y