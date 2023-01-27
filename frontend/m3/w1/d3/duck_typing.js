function addPoints(p1, p2) {
    var x = p1.x + p2.x;
    var y = p1.y + p2.y;
    return { x: x, y: y };
}
var newPoint = addPoints({ x: 3, y: 4 }, { x: 5, y: 1 });
