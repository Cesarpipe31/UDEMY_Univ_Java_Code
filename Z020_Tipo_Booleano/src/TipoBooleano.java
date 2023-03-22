public class TipoBooleano {
    
    public static void main(String args[]){
        boolean varBoolean = false;
        System.out.println("varBoolean: " + varBoolean);
        
        if (varBoolean){
            System.out.println("Bandera Verdadera");
        }
        else{
            System.out.println("Bandera Falsa");
        }
        
        var edad = 30;
        var esAdulto = edad >= 18;
        
        if (esAdulto){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");              
        }
    }    
}
