public class Bombo{
    private String material;
    private boolean garantia;


 public String getMaterial(){
      return material;
 }
 public void setMaterial(String material){
    this.material = material; 
 }

 public boolean getGarantia(){
    return garantia;
 }

 public void setGarantia(boolean garantia){
    this.garantia = garantia;
 }
 public void imprimirDetalles(){
	System.out.println("Material: " + material + " Garantia: " + garantia)
}
 







}
