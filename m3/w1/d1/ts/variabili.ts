// type assertion
let code:any = 123;
let employeeCode = <number> code;
console.log(typeof(employeeCode));

// digitazione dedotta
let variabile = 12; // il compilatore la cataloga come numero perchè il valore assegnato è numero