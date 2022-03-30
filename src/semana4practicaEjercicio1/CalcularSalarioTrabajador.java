/*Calcular el salario de un trabajador en base a los siguientes criterios.
a) Se debe pedir por teclado el número de horas trabajadas en el mes (HT) y el pago por hora (PH). Trabajar con número
reales para ambos casos. 
Evaluar las horas trabajas según lo siguiente:
b) Si las horas trabajadas son menores o iguales a 40, se considera que el empleado no ha realizado horas
extras en el mes. 
c) Si las horas trabajadas son mayores a 40 y menores o iguales a 48, se considera que el empleado ha
realizado horas extras que se le pagan al doble del pago de una hora normal. Haciendo para este caso un total
de 8 horas pagadas como máximo al doble.
d) Si las horas trabajadas exceden de 48, se considera que el empleado ha realizado horas extras que se le
pagan al doble y al triple del pago de una hora normal, Haciendo un total de 8 horas extras pagadas al doble y
las que excedan de 8 se pagan al triple del pago de una hora normal
e) Se debe aplicar el descuento de la retención (RENTA) del 10% al salario bruto.
f) Se debe imprimir en pantalla el nombre del empleado, salario bruto (sin renta), salario líquido (con renta) y
finalmente el monto de la retención aplicada.*/
package semana4practicaEjercicio1;

public class CalcularSalarioTrabajador {
    double HorasTrabajadas, PagoHora;

    public CalcularSalarioTrabajador() {
    }

    public CalcularSalarioTrabajador(double HorasTrabajadas, double PagoHora) {
        this.HorasTrabajadas = HorasTrabajadas;
        this.PagoHora = PagoHora;
    }

    public double getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(double HorasTrabajadas) {
        this.HorasTrabajadas = HorasTrabajadas;
    }

    public double getPagoHora() {
        return PagoHora;
    }

    public void setPagoHora(double PagoHora) {
        this.PagoHora = PagoHora;
    }
    
    double CalcularSalarioTrabajador(){
        double salario = 0;
        double HorasDos;
        double HorasTres;
        
        if (this.HorasTrabajadas <=40){
            salario = this.HorasTrabajadas * this.PagoHora;
            return salario;
        } else if (this.HorasTrabajadas > 40 && this.HorasTrabajadas < 48){
            HorasDos = this.HorasTrabajadas - 40;
            salario = (40 * this.PagoHora) + (HorasDos * this.PagoHora * 2);
            return salario;
        } else if (this.HorasTrabajadas > 48){
            HorasTres = this.HorasTrabajadas - 48;
            salario = (40 * this.PagoHora) + (8 * this.PagoHora * 2) +(HorasTres * this.PagoHora * 3);
            return salario;
        }
            return salario;
    }
    
    double Renta(CalcularSalarioTrabajador salario){
        double R;
        salario.CalcularSalarioTrabajador();
        R = salario.CalcularSalarioTrabajador() * 10;
        return R;
    }
    
    double SalarioLiquido(CalcularSalarioTrabajador Sliquido){
        double Salarioliquido;
        
        Salarioliquido =Sliquido.CalcularSalarioTrabajador() - Sliquido.Renta(Sliquido);
        return Salarioliquido;
    }
}
