//let list0:number[]; //null | undefined
var list1 = [];
var list2 = [1, 2, 3];
var list3 = [1, 2, 3];
var list4 = new Array(); //==list1
for (var i = 0; i < list3.length; i++) {
    console.log(list3[i]);
}
//off muestra los valores
for (var _i = 0, list3_1 = list3; _i < list3_1.length; _i++) {
    var iesimo = list3_1[_i];
    console.log(iesimo);
}
//in muestra las keys
for (var iesimo in list3) {
    console.log(iesimo);
}
