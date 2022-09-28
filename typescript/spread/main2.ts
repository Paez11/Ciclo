class Coche{
    
    private marca:string;
    private _potencia:number;

    constructor(marca, potencia){
        this.marca=marca;
        this._potencia=potencia;
    }
    

    //constructor(private marca:string, private potencia:number){}

    public getMarca():string{
        return this.marca;
    }

    public setMarca(marca:string){
        this.marca=marca;
    }

    set potencia(potencia:number){
        if(potencia<0) potencia=0;
        this._potencia=potencia;
    }

    get potencia():number{
        return this._potencia;
    }
}

let c:Coche = new Coche("renault",60);
c.setMarca("Toyota");
c.potencia=-50;
console.log(c);