let marks:number[]=[2,5,6,2,1,9];

marks.forEach((v,i,a)=>{
    console.log(i+"=>"+v);
});

let marksModified = marks.map((v,i,a)=>{
    return Math.abs(v); //v*v;
});
//let marksModified = marks.map(v=>Math.abs(v));

console.log(marks);
console.log(marksModified);

let marksPass = marks.filter(v=>v>=5);

console.log(marksPass);

console.log(marks.every(v=>v>0));