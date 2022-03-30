
package Semana4PracticaEjer2;

import java.util.Scanner;


public class datosMain {
    public static void main(String[] args) {
    String DPersonales;
    double CF;
    String DatosEdificio;
    String DA;
   
    
    
    
    empleado Dempleado = new empleado();
    edificio Edificio = new edificio();
    area area = new area();
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Escriba el nombre del empleado: ");
        Dempleado.setNombre(leer.nextLine());
        System.out.println("Digite el codigo del empleado: ");
        Dempleado.setCodigo(Integer.parseInt(leer.nextLine()));
        System.out.println("Digite la edad del empleado: ");
        Dempleado.setEdad(Integer.parseInt(leer.nextLine()));
        System.out.println("Escriba la direccion del empledo: ");
        Dempleado.setDireccionEm(leer.nextLine());
        System.out.println("Escriba el area del empleado: ");
        Dempleado.setAreaT(leer.nextLine());
        System.out.println("Escriba el cargo a desempeñar: ");
        Dempleado.setCargoD(leer.nextLine());
        System.out.println("Digite el dia de ingreso: ");
        Dempleado.setDd(Integer.parseInt(leer.nextLine()));
         System.out.println("Digite el mes de ingreso: ");
        Dempleado.setMm(Integer.parseInt(leer.nextLine()));
         System.out.println("Digite el año de ingreso: ");
        Dempleado.setAn(Integer.parseInt(leer.nextLine()));
        System.out.println("Escriba el sueldo base/bruto del empleado: ");
        Dempleado.setSueldo(Double.parseDouble(leer.nextLine()));
        System.out.println("Digite el codigo de Area: ");
        area.setCarea(Integer.parseInt(leer.nextLine()));
        System.out.println("Digite el nombre del area");
        area.setnombre(leer.nextLine());
        System.out.println("Digite la cantidad de empleados: ");
        area.setCEmpleado(Integer.parseInt(leer.nextLine()));
        System.out.println("Digite la cantidad de edificios: ");
        area.setNEdificio(Integer.parseInt(leer.nextLine()));
        System.out.println("El contrato del empleado es:");
        Dempleado.setTipo(leer.nextDouble());
        
        
        System.out.println("-------------------------------------------");
        
       DPersonales = Dempleado.DatosP(Dempleado);
       System.out.println(DPersonales);
       CF = Dempleado.TE();
       System.out.println(CF);
        System.out.println("-----------Datos del edificio-----------");
       
       DatosEdificio = Edificio.DatosE();
        System.out.println(DatosEdificio);
        
        
        
        System.out.println("---------------Datos de Area-----------------");
        
        DA = area.DatosA();
        System.out.println(DA);
        
      
        
        
       
    }
    
}
