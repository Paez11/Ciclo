let list0:number[]; //null | undefined
let list1:number[] = [];
let list2:number[] = [1,2,3];
let list3:Array<number> = [1,2,3];
let list4:Array<number> = new Array(); //==list1

for(let i=0; i<list3.length; i++){
    console.log(list3[i]);
}

//off muestra los valores
for(let iesimo of list3){
    console.log(iesimo);
}

//in muestra las keys
for(let iesimo in list3){
    console.log(iesimo);
}
