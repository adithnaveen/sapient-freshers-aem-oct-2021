// to show working of promise 

function divide(n1, n2) {
    return new Promise((resolve, reject) => {
        if(typeof n1 !='number') {
            reject("Please enter first value as number");
         }
         if(typeof n2 !='number') {
            reject("Please enter second value as number");
        }
        if(n2 ===0) {
            reject("please dont divide by zero");
        }
        resolve( n1/n2);
    })
}
console.log("Start");

// version 1
// let result = divide(10,"4a");
// result.then(res => console.log("Result :" + res));
// result.catch(err => console.log("Error : " + err));

// version 2
// let result = divide(10,4);
// result
//     .then(res =>console.log("Result :" + res))
//     .catch(err => console.log("Err : "+ err))


// version 3 
setTimeout(async () => {
    try {
        let result = await divide(10,4);
        console.log("Result :" + result)
    }catch(err) {
        console.log("Err : "+ err);
    }
}, 0);

console.log("End");


////////////////////////
function hi() {
    // 20 seconds 
    console.log("hi")
}


console.log("First LIne ");
hi()
console.log("last line ")