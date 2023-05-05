package z058_laboratoriocaja.model;


public class Caja {
    private int ancho;
    private int profundo;
    private int alto;
        

    public Caja() {
        System.out.println("Ejecutando constructor vacío");
    }

    public Caja(int ancho, int profundo, int alto) {
        this.ancho = ancho;
        this.profundo = profundo;
        this.alto = alto;        
    }

   public int getAncho(){
       return ancho;
   }
    
   public void setAncho(int ancho){
       this.ancho = ancho;       
   }
   
   public int getProfundo(){
       return profundo;
   }
   
   public void setProfunco(int profundo){
       this.profundo = profundo;
   }
    
   public int getAlto(){
       return alto;
   }
   
   public void setAlto(int alto){
       this.alto = alto;
   }
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Caja{");
        sb.append("ancho=").append(ancho);
        sb.append(", profundo=").append(profundo);
        sb.append(", alto=").append(alto);
        sb.append('}');
        return sb.toString();
    }
}
