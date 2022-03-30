
package semana4practicaEjercicio1;

import java.util.Scanner;



public class SalarioMain {
    public static void main(String[] args) {
        double salario1 = 0.0;
        double salario2 = 0.0;
        double salario3 = 0.0;
        CalcularSalarioTrabajador salario = new CalcularSalarioTrabajador();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite las horas Trabjadas :");
        salario.setHorasTrabajadas(leer.nextDouble());
        System.out.println("Introduzca el pago por hora :");
        salario.setPagoHora(leer.nextDouble());
        System.out.println("*********************************");
        salario.CalcularSalarioTrabajador();
        
        salario1 = salario.CalcularSalarioTrabajador();
        salario2 = salario.Renta(salario);
        salario3 =salario.SalarioLiquido(salario);
        System.out.println("El salario bruto es: $"+salario1);
        System.out.println("El monto de la retencion aplicada es : $"+salario2);
        System.out.println("El salario liquido es: $"+salario3);
        
        
    }
}
