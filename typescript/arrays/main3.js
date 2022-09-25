var marks = [2, 5, 6, 2, 1, 9];
marks.forEach(function (v, i, a) {
    console.log(i + "=>" + v);
});
var marksModified = marks.map(function (v, i, a) {
    return Math.abs(v); //v*v;
});
//let marksModified = marks.map(v=>Math.abs(v));
console.log(marks);
console.log(marksModified);
var marksPass = marks.filter(function (v) { return v >= 5; });
console.log(marksPass);
console.log(marks.every(function (v) { return v > 0; }));
