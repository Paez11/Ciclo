
let persona1 = {
    nombre:'Victor',
    edad:21,
    hobbies:['3','4']
};

let estudiante = {
    Curso:'DAO',
    edad:21,
    anio:2
};

let nuevapersona = {
    ...persona1, ...estudiante, activate:false
};
console.log(nuevapersona);

let nuevapersona2 = {
    persona1,estudiante
};

console.log(nuevapersona2);

let array=[1,2,3];
let array2=[4,5,6];

let result=[array,array2];
console.log(result);
let result2=[...array,...array2];
console.log(result2);

function suma(...params){
    console.log(params);
}

suma(2);
suma(2,3);
suma(2,3,'4');