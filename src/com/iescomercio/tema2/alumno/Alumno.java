package com.iescomercio.tema2.alumno;

/**
 *
 * @author chiqui
 */
public class Alumno {

    private String nombre;
    private int edad;
    private boolean varon;
    private int nota;

    public Alumno(String nombreEntero, int edadNueva, char sexo) {
        edad = edadNueva;
        nombre = nombreEntero;
        if ((sexo == 's') || (sexo == 'S')) {
            varon = true;
        }

        if ((sexo == 'n') || (sexo == 'N')) {
            varon = false;
        }

    }

    public Alumno(String nombreEntero, int edadNueva) {
        edad = edadNueva;
        nombre = nombreEntero;

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getVaron() {
        if (varon) {
            return "Si";
        } else {
            return "No";
        }
    }

    public int getNota() {
        return nota;
    }

    public void setNombre(String nombreNuevo) {
        nombre = nombreNuevo;
    }

    public void setEdad(int edadNueva) {
        edad = edadNueva;
    }

    public void cambiarSexo() {
        varon = !varon;
    }

    public void subirNota(int subirNotaAlumno) {
        if (subirNotaAlumno > 0 && ((nota + subirNotaAlumno) < 11)) {
            subirNotaAlumno = nota + subirNotaAlumno;
            nota = nota + subirNotaAlumno;
            System.out.println("Se a subido la nota del alumno " + subirNotaAlumno + " puntos.");
        }
        

    }

    public void subirNota() {
        if (nota < 10) {
            nota++;
        } else {
            System.out.println("No se puede subir la nota mas de 10.");
        }

    }

    public void bajarNota(int bajarNotaAlumno) {
        if (bajarNotaAlumno > 0 && (nota - bajarNotaAlumno) > (-1)) {
            bajarNotaAlumno = nota - bajarNotaAlumno;
            nota = bajarNotaAlumno;
            System.out.println("Se a bajado la nota del alumno " + bajarNotaAlumno + " puntos.");
        }
        System.out.println("No se puede bajar mas la nota de 0");
        

    }

    public void bajarNota() {
        if (nota > 0) {
            nota--;
        } else {
            System.out.println("No se puede bajar la nota mas de 0.");
        }

    }

    public void ponerNotaInjusta(){
        int notajusta = ((nombre.length()/3));
        if (notajusta < 10){
            nota = notajusta;
            
        }else{
            nota = 10;
        }
    }
    
    public void imprimirDetalles(){
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Nota: "+ getNota());
        System.out.println("Varon: "+ getVaron());
        System.out.println("Edad: "+ getEdad());
    }

}
