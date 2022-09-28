function showAlert(msg) {
    console.log(msg);
}
console.log("linea 5");
setTimeout(function () {
    showAlert("Ha pasado el tiempo");
}, 2000);
console.log("Linea 9");
//for(let i=0;i<10000;i++){}
var my = setInterval(function () { showAlert("hola"); }, 2000);
console.log("Linea 12");
clearInterval(my);
