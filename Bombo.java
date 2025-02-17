public class Bombo{
    private String material;
    private boolean garantia;

    public Bombo(){
        material = "nylon";
        garantia = true;
    }
    
    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material, boolean garantia){
        this.material = material;
        this.garantia = garantia;
    }

    public boolean getGarantia(){
        return garantia;
    }

    public void setGarantia(boolean garantia){
        this.garantia = garantia;
    }

    public void imprimirDetalles(){
        System.out.println("Material: " + material + " Garantia: " + garantia);
    }




}