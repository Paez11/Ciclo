var Coche = /** @class */ (function () {
    function Coche(marca, potencia) {
        this.marca = marca;
        this._potencia = potencia;
    }
    //constructor(private marca:string, private potencia:number){}
    Coche.prototype.getMarca = function () {
        return this.marca;
    };
    Coche.prototype.setMarca = function (marca) {
        this.marca = marca;
    };
    Object.defineProperty(Coche.prototype, "potencia", {
        get: function () {
            return this._potencia;
        },
        set: function (potencia) {
            if (potencia < 0)
                potencia = 0;
            this._potencia = potencia;
        },
        enumerable: false,
        configurable: true
    });
    return Coche;
}());
var c = new Coche("renault", 60);
c.setMarca("Toyota");
c.potencia = -50;
console.log(c);
