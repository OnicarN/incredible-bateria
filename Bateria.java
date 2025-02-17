public class Bateria{
    private String marca;

    private boolean acustica;

    private Bombo bombo;

    public Bateria(String marca, boolean acustica){
        this.marca = marca;
        bombo = new Bombo();
        this.acustica = acustica;

    }

    public String getMarca(){
        return marca;        
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public Bombo getBombo(){
        return bombo;
    }
    public void setBombo(Bombo bombo){
        this.bombo =bombo;
    }
   
    public boolean getAcustica(){
        return acustica;
    }
    public void imprimirAtributos(){
    System.out.println("Marca: " + marca +". Material del bombo: " + bombo.getMaterial() + ". Garantia del bombo: " + bombo.getGarantia());
    }
    
    public void setAcustica(boolean acustica){
        this.acustica = acustica;
    }
    public void imprimirDetalles(){
        System.out.println("Marca: " + marca +". Material del bombo: " + bombo.getMaterial() + ". Garantia del bombo: " + bombo.getGarantia());
    }
    















}
