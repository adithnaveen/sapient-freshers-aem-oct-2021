// working with es6 function 

const foods = [
    {
        "id": "201",
        "item_name": "Butter Naan",
        "cost": 50
      },
      {
        "id": "202",
        "item_name": "Kadahi Chicken",
        "cost": 150
      },
      {
        "id": "203",
        "item_name": "Babycorn",
        "cost": "250"
      }
];

const foodFound = foods.find(food => food.id ==202);
console.log(foodFound);
 
const foodFoundByName = foods.find(food => food.item_name =="Babycorn");
console.log(foodFoundByName);
 
// by index 
const byId = foods.findIndex(food => food.id ==203)
console.log("203 is found @ " + byId);


