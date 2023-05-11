package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        //Empleado empleado1 = new Empleado("Juan", 5000.00);
        //System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true, "Karla", 'F', 28, "Calle del cartucho");
        Cliente cliente2 = new Cliente(new Date(), false, "Super", 'M', 12, "Calle del cartucho");
        System.out.println("cliente1 = " + cliente1);
        System.out.println("cliente2 = " + cliente2);
        
    }
}
