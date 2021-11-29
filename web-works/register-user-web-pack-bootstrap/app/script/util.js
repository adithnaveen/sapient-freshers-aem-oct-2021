exports.sayHi = (name) => {
    return "Hello " + name
}

exports.validateRegObject =(regObj) => {
    return regObj.userName.length > 6; 
}