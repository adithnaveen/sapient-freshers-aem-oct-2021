const {sayHi, validateRegObject} = require("./util");
const {registerUserAction} = require("./actions")


const initApp =() => {
    let registerBtn = document.getElementById("regBtn");
    registerBtn.addEventListener("click", fnRegisterBtn);
}

const fnRegisterBtn= (event) => {
    event.preventDefault();
    const regObj = {};
    regObj.userName = document.getElementById("username").value;
    regObj.password = document.getElementById("password").value;
    regObj.email = document.getElementById("email").value;
    console.log(sayHi(regObj.userName));
    // validation 
    if(!validateRegObject(regObj)){
        return false; 
    }
    // invoking the end point happens here 
    registerUserAction("http://localhost:3001/users",regObj);
}


initApp();