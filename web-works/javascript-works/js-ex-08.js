const person = {
    first: "Arjun", 
    last:"ramamoorthy", 
    location : {
        city:"Hyderabad", 
        sate:"Telangana"
    }
};

console.log(person);
console.log(person.first);

// destructuring 
const {first, last} = person; 
console.log("First Name is " + first + " Last Name is " + last);
// in es6 
console.log(`First Name ${first} Last Name ${last}`);

const electronics = {computer:"Apple", processor:"M1", price:12345};
console.log(electronics);

function myFunction(category, ...products)  {
    console.log(`Category ${category}`);
    console.log(`Products ${products}`);
}
myFunction("Electronics", "Computer", "Mouse", "Keyboard");