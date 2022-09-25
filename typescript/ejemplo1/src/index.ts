class HolaMundo{
    private saludo:String;

    constructor(saludo:String){
        this.saludo=saludo;
    }
    saluda():String{
        return "hola "+this.saludo;
    }
}

function saludame(frase: string):void{
    console.log(frase);
}
let saludame2 = (frase: any)=>{
    console.log(frase);
}

saludame("o");
saludame2("p");
let hm = new HolaMundo("Victor");
//let boton:HTMLButtonElement = document.createElement("button");
let boton:HTMLDivElement = document.createElement("div");
//saludame();
boton.innerText="botón";
boton.className="miboton";
//boton.onclick=saludame;
boton.onclick=()=>{
    console.log("Click en botón");
};
document.body.appendChild(boton);
//console.log(hm.saluda);