
package Semana4PracticaEjer2;


public class empleado extends edificio {
    String nombre, direccionEm, AreaT, CargoD, direccionED, Emp;
    long Codigo;
    int edad;
    double sueldo, salarioF;
    int dd;
    int mm;
    int an;
    int fecha;
    boolean tipoDC;
    double tipo;
    

    public empleado() {
    }

    public empleado(String nombre, String direccionEm, String AreaT, String CargoD, String direccionED, long Codigo, int edad, double sueldo, double salarioF, int dd,int mm, int an,int fecha, boolean tipoDC, double tipo, String Emp) {
        this.nombre = nombre;
        this.direccionEm = direccionEm;
        this.AreaT = AreaT;
        this.CargoD = CargoD;
        this.direccionED = direccionED;
        this.Codigo = Codigo;
        this.edad = edad;
        this.sueldo = sueldo;
        this.salarioF = salarioF;
        this.fecha = fecha;
        this.tipoDC = tipoDC;
        this.tipo = tipo;
        this.Emp = Emp;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionEm() {
        return direccionEm;
    }

    public void setDireccionEm(String direccionEm) {
        this.direccionEm = direccionEm;
    }

    public String getAreaT() {
        return AreaT;
    }

    public void setAreaT(String AreaT) {
        this.AreaT = AreaT;
    }

    public String getCargoD() {
        return CargoD;
    }

    public void setCargoD(String CargoD) {
        this.CargoD = CargoD;
    }

    public String getDireccionED() {
        return direccionED;
    }

    public void setDireccionED(String direccionED) {
        this.direccionED = direccionED;
    }

    public long getCodigo() {
        return Codigo;
    }

    public void setCodigo(long Codigo) {
        this.Codigo = Codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSalarioF() {
        return salarioF;
    }

    public void setSalarioF(double salarioF) {
        this.salarioF = salarioF;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }
    

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public boolean isTipoDC() {
        return tipoDC;
    }

    public void setTipoDC(boolean tipoDC) {
        this.tipoDC = tipoDC;
    }

    public double getTipo() {
        return tipo;
    }

    public void setTipo(double tipo) {
        this.tipo = tipo;
    }

    public String getEmp() {
        return Emp;
    }

    public void setEmp(String Emp) {
        this.Emp = Emp;
    }

    String DatosP(empleado h) {
        
        String Informacion = "";
        Informacion += "El nombre es :" + nombre + "\n";
        Informacion += "El codigo del empleado es :" + Codigo + "\n";
        Informacion += "La edad del empleado es :" + edad + "\n";
        Informacion += "La direccion del empleado es :" + direccionEm + "\n";
        Informacion += "El area de trabajo es :" + AreaT + "\n";
        Informacion += "El cargo a desempeñar es :" + CargoD + "\n";
        Informacion += "La fecha que ingreso el empleado es:" + dd + "/" + mm + "/" + an + "\n";
        Informacion += "El sueldo base es : $" + sueldo + "\n";
        Informacion += "El salario liquido del empleado es: $" + h.Descuentos(h);

        return Informacion;
    }

    double Descuentos(empleado h) {

        double salarioF;
        double afp;
        double iss;
        double renta;

        if (this.tipo == 1) {
            renta = (sueldo * 0.1);
            afp = (sueldo * 0.725);
            iss = (sueldo * 0.13);
            salarioF = (sueldo - (afp - iss - renta));

            return salarioF;
        } else if (this.tipo == 1) {
            System.out.println("El empleado es permanente");

        } else if (this.tipo == 2) {
            renta = (sueldo * 0.1);
            salarioF = (sueldo - renta);
            System.out.println("El empleado es de servicio");

            return salarioF;
        }
        return this.tipo;
    }

    double TE() {
         double Empld = this.tipo;

        if (Empld == 1) {
            
            System.out.println("El empleado es permanente");
            
            return Empld;

        }else{
            System.out.println("El empleado es de servicio");
            
        }
        return Empld;
    }
}
