var alphas;
alphas = ["1", "2", "3", "4"];
console.log(alphas[0]);
console.log(alphas[1]);
var nums = [1, 2, 3, 3];
console.log(nums[0]);
console.log(nums[1]);
console.log(nums[2]);
console.log(nums[3]);
var arr_names = new Array(4);
for (var i = 0; i < arr_names.length; i++) {
    arr_names[i] = i * 2;
    console.log(arr_names[i]);
}
var names = new Array("Mary", "Tom", "Jack", "Jill");
for (var i = 0; i < names.length; i++) {
    console.log(names[i]);
}
var numbers = [1, 4, 9];
var length = numbers.push(10);
console.log("new numbers is : " + numbers);
var length = numbers.push(20);
console.log("new numbers is : " + numbers);
var arr = [12, 13];
var [x, y] = arr;
console.log(x);
console.log(y);
var j;
var nums = [1001, 1002, 1003, 1004];
for (j in nums) {
    console.log(nums[j]);
}
var nomi = new Array("Mary", "Tom", "Jack", "Jill");
function disp(arr_nomi) {
    for (var i = 0; i < arr_nomi.length; i++) {
        console.log(nomi[i]);
    }
}
disp(nomi);
