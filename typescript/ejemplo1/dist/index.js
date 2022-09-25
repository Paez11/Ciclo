"use strict";
class HolaMundo {
    constructor(saludo) {
        this.saludo = saludo;
    }
    saluda() {
        return "hola " + this.saludo;
    }
}
function saludame(frase) {
    console.log(frase);
}
let saludame2 = (frase) => {
    console.log(frase);
};
saludame("o");
saludame2("p");
let hm = new HolaMundo("Victor");
//let boton:HTMLButtonElement = document.createElement("button");
let boton = document.createElement("div");
//saludame();
boton.innerText = "botón";
boton.className = "miboton";
//boton.onclick=saludame;
boton.onclick = () => {
    console.log("Click en botón");
};
document.body.appendChild(boton);
//console.log(hm.saluda);
