public class Bateria{
    private String marca;
    private int precio;
    private boolean acustica;

    public Bateria(String Marca, int precio, boolean acustica){
        this.marca = marca;
        this.precio = precio;
        this.acustica = acustica;

    }

    public String getMarca(){
        return marca;        
    }
    public void setMarca(){
        this.marca = marca;
    }
    public int getPrecio(){
        return precio;        
    }
    public void setPrecio(){
        this.precio = precio;
    }
    public boolean getAcustica(){
        return acustica;
    }
    public void imprimirAtributos(){
	System.out.println("Marca: " + marca + " Precio: " + precio)
    }















}
