let Persona = {
    nombre: 'Carlos',
    direccion: 'Córdoba',
    edad: 25,
    hobbies: [
        'correr',
        'programar',
        'cantar'
    ],
    saluda: (p)=>{
        console.log('Hola soy yo '+p.edad);
    }
};
console.log(persona);
/*
console.log(persona.nombre);
console.log(persona.hobbies);
console.log(persona.hobbies[1]);*/

Persona['profesion'] = 'profe';
Persona.saluda(Persona);

