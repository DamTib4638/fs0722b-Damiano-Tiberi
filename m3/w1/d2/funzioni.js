function disp_details(id, name, mail_id) {
    console.log("ID:", id);
    console.log("Name:", name);
    if (mail_id != undefined)
        console.log("Email ID", mail_id);
}
disp_details(123, "John");
disp_details(111, "mary", "email_protected");
function addNumbers(...nums) {
    var i;
    var sum = 0;
    for (i = 0; i < nums.length; i++) {
        sum = sum + nums[i];
    }
    console.log("sum of the numbers", sum);
}
addNumbers(1, 2, 3);
addNumbers(10, 10, 10, 10, 10);
function calculate_discount(price, rate = 0.50) {
    var discount = price * rate;
    console.log("Discount Amount ", discount);
}
calculate_discount(1000);
calculate_discount(1000, 0.30);
var msg = function () {
    return "hello world";
};
console.log(msg());
var res = function (a, b) {
    return a * b;
};
console.log(res(12, 2));
var myFunction = new Function("a", "b", "return a * b");
var m = myFunction(4, 3);
console.log(m);
