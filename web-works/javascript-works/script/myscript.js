console.log("Hi i'm from extenal file")


function fnFirstFunction() {
    console.log("Hi i'm from Function")
}

function fnCheckToVote() {
    const name = prompt("Enter Your Name")
    const age = parseInt(prompt("Enter Your age ", "18"))

    if(age > 18) {
        console.log("You can Vote " + name +" you are aged " + age); 
        const flag = confirm("Do you want to get in")
        if(flag) {
            console.log("You are inside Vote Boot")
        }else {
            console.log("you are not interested to vote... BYE");
        }
    }else  {
        console.log("Sorry Mr/Ms :" + name +" you have to wait for " + (18-age) +" years")
    }
}

function fnAddNumbers() {
    // keep accepting numbers will use enter 0
    // and finally display sum of all numbers
}

function fnMixingDataTypes() {
    let str ='abc'; 
    let intVal = 123; 
    let boolVal = true; 
    console.log(str + intVal)

    console.log(intVal + boolVal)

    console.log(100=="100");
    console.log(100==="100");
    console.log(100*"3");
    console.log(100/"abc");
    if(100/"abc"==NaN) {
        console.log("its Nan");
    }else {
        console.log("its not NaN");
    }

    if(isNaN(100/"abc")) {
        console.log("NaN Check with is NaN True");
    }else {
        console.log("NaN Check with is NaN False");
    }
}


function fnDisplay() {
    console.log("Display without param");
    console.log(fnDisplay.arguments.length)

    // for(let i=0; i<fnDisplay.arguments.length; i++) {
    //     console.log(fnDisplay.arguments[i]);
    // }

   
    // for(let value in fnDisplay.arguments) {
    //     console.log(fnDisplay.arguments[value]);
    // }
 for( let value of fnDisplay.arguments) {
        console.log(value);
    }

}

// function fnDisplay(val) {
//     console.log("Display  param" + val );
// }
// function fnDisplay(val, val2) {
//     console.log("Display  with 2  param" + val  + ", " + val2)
// }


function fnObjectTest1() {
    let obj = new Object

    obj.name = "Hemanth"
    obj.age = 22; 

    console.log(obj)
    console.log(obj.name);
    console.log(obj.age);
    console.log(obj.something)
}




function Employee(name, empId) {
    this.name = name; 
    this.empId = empId;

    this.myPrevillaged = function() {
        console.log("myPrevillaged in employee class")
        myPrivate()
    }
    var myPrivate = function() {
        console.log("myPrivate in employee class")
    }
}
Employee.prototype.display = function() {
    console.log("Emp Name " + this.name)
    console.log("Emp Id " + this.empId)
}


function fnCaller() {
    let emp = new Employee("Swati", 22); 
    emp.display();
    emp.myPrevillaged();
    // emp.myPrivate();
}


function fnDiffLetConstVar() {
    // var 
    for(let i=0; i<5; i++) {
        console.log(i);
    }
    console.log(i);
}

function fnArrays1() {
    let arr = new Array(5);
    arr[0] = 10; 
    arr[1] = "hi"; 
    arr[2] = 100; 
    arr[3] = true; 
    arr[4] = new Employee("Harry", 11);

    for(let tempVal of arr) {
        console.log(tempVal);
    }
}

function fnArrays2() {
    let arr = new Array(5); 
    arr[0] = "Sunday";
    arr[1] = "Monday";
    arr[2] = "Tuesday";
    arr[3] = "Wednesday";
    arr[4] = "Thursday";
    arr[5] = "Friday";
    console.log(arr.length);
    for(let tempVal of arr) {
        console.log(tempVal);
    }

    arr.push("Saturday", "AnotherDay"); 
    console.log(arr);
    arr.unshift("NoDay");
    console.log(arr);
    
    // take off element from the last position 
    arr.pop(); 
    console.log(arr);
    // take off the element from the start
    arr.shift();
    console.log(arr);

    arr.splice(3, 2, "NEW VALUE", "NEW NEW VALUE");
    console.log(arr);
}