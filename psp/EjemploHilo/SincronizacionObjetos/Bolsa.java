package SincronizacionObjetos;

import java.util.ArrayList;

public class Bolsa {
    private ArrayList<Producto> productos= new ArrayList<Producto>();

    public void addProducto(Producto producto){
        if (!estaLlena()){
            productos.add(producto);
        }
    }

    public boolean estaLlena(){
        return productos.size()>=5;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public int getSize(){
        return productos.size();
    }
}
