
package Semana4PracticaEjer2;

public class edificio {
    String ubicacion, nombre;
    int Cdepartamentos, Cdepisos;

    public edificio() {
    }

    public edificio(String ubicacion, String nombre, int Cdepartamentos, int Cdepisos) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.Cdepartamentos = Cdepartamentos;
        this.Cdepisos = Cdepisos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCdepartamentos() {
        return Cdepartamentos;
    }

    public void setCdepartamentos(int Cdepartamentos) {
        this.Cdepartamentos = Cdepartamentos;
    }

    public int getCdepisos() {
        return Cdepisos;
    }

    public void setCdepisos(int Cdepisos) {
        this.Cdepisos = Cdepisos;
    }
    String DatosE (){
       String Info = "";
       
       Info += "La ubicación del Edificio es: Santiago Nonuaco, La Paz, El Salvador" + "\n";
       Info += "El nombre del Departamento es: A" + "\n";
       Info += "La cantidad de Departamentos que alberga son: 1" + "\n"; 
       Info += "La cantidad de pisos son: 10" + "\n";
       
       return Info;
       
    }
}
