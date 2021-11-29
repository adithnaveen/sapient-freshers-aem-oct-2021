// to show working of promise 

function divide(n1, n2, callback) {
    if(typeof callback != 'function') {
        throw ("Please pass callback function")
    }


   setTimeout(() => {
    if(typeof n1 !='number') {
       callback("Please enter first value as number");
       return; 
    }
    if(typeof n2 !='number') {
        callback("Please enter second value as number")
        return 
    }
    if(n2 ===0) {
        callback("please dont divide by zero")
        return
    }

   callback(null, n1/n2);
   }, 0);
}
console.log("Start");
let result = divide(123,10, (err, result) => {
    if(err) {
        console.log("Error Occured: " + err);
    }else {
        console.log(result);
    }
}); 

console.log("End");