const names = [
    'shivanand', 
    'ashotosh', 
    'utkarsh', 
    'rishab'
];

const fnIterateName = () => {
    for(let name of names) {
        console.log(name);
    }
}

// add two numbers 
const addNumbers = (num1, num2) =>  num1 + num2
const sayHi =(name) => console.log(name)

fnIterateName()
console.log(addNumbers(10, 20));
sayHi("Bhavya");