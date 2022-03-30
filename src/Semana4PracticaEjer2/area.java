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
finalmente el monto de la retención aplicada */


package Semana4PracticaEjer2;


public class area {

    void setCarea(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setnombre(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCEmpleado(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNEdificio(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String DatosA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class Area  {

    String nombre;
    int Area, Empleado, Edificio;

    public Area() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCArea() {
        return Area;
    }

    public void setCArea(int CArea) {
        this.Area = CArea;
    }

    public int getCEmpleado() {
        return Empleado;
    }

    public void setCEmpleado(int CEmpleado) {
        this.Empleado = CEmpleado;
    }

    public int getNEdificio() {
        return Edificio;
    }

    public void setNEdificio(int NEdificio) {
        this.Edificio = NEdificio;
    }
String DatosA (){
  String  Inf = "";
  Inf +="El codigo de Area es:" + Area  +"\n";
  Inf +="El nombre del Area es:" + nombre +"\n";
  Inf +="La cantidad de empleados es:" + Empleado +"\n";
  Inf +="La cantidad de edificios es: " + Edificio +"\n";
  return Inf;
}

    
}

}
