import java.sql.SQLOutput;
import java.util.SimpleTimeZone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Persona {
    //atributos de la clase

    private String nombre;
    private String apellido;
    private int documentoIdentidad;
    private int añoNacimiento;
    private String lugarNacimiento;
    private char genero;


    // Constructor para inicializar los atributos

    Persona(String nombre, String apellido, int documentoIdentidad, int añoNacimiento,String lugarNacimiento,char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.genero = genero;

    }

    void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + documentoIdentidad);
        System.out.println("Año de nacimiento: " + añoNacimiento);
        System.out.println("Lugar de nacimiento: "+ lugarNacimiento);
        System.out.println("Genero: "+ genero);
    }
}



