public class HolaMundo {
    public static void main(String args []){
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Cesar Augusto Delgado Alvarado";        
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 ="Nuevo mensaje";
        System.out.println("Mi variable de cadena 2 es: " + miVariableCadena2);
        
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        var áVariable = 10;
        
        System.out.println(miVariable);
        System.out.println(_miVariable);
        System.out.println($miVariable);
        System.out.println(áVariable);
        
        var usuario = "Cesar";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("Union = " + union);
        
        var i = 3;
        var j = 4;
        System.out.println(i + j);
        System.out.println(usuario + i + j + usuario);
        System.out.println(usuario + ( i + j )+ usuario);
    }    
}
