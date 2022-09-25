interface Persona{
    nombre:string,
    edad:number,
    hobbies:string[],
    sexo?:boolean
}

let persona:Persona = {
    nombre:'Victor',
    edad:21,
    hobbies:['3','4']
};

for(let k in persona){
    //console.log(k);
    console.log(persona[k]);
}

let b=0;
if(b === 0){
    console.log('Es cero');
}