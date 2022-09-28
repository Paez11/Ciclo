var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
var persona1 = {
    nombre: 'Victor',
    edad: 21,
    hobbies: ['3', '4']
};
var estudiante = {
    Curso: 'DAO',
    edad: 21,
    anio: 2
};
var nuevapersona = __assign(__assign(__assign({}, persona1), estudiante), { activate: false });
console.log(nuevapersona);
var nuevapersona2 = {
    persona1: persona1,
    estudiante: estudiante
};
console.log(nuevapersona2);
var array = [1, 2, 3];
var array2 = [4, 5, 6];
var result = [array, array2];
console.log(result);
var result2 = __spreadArray(__spreadArray([], array, true), array2, true);
console.log(result2);
function suma() {
    var params = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        params[_i] = arguments[_i];
    }
    console.log(params);
}
suma(2);
suma(2, 3);
suma(2, 3, '4');
