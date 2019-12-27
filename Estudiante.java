package modelo;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Arrays;

public class Estudiante {

    //atributos encapsulado
    private String nombre;
    private String apellido;
    private String codigo;
    private Curso Curso1;
    private Curso Curso2;
    private Curso Curso3;
    private Curso Curso4;
    private Curso Curso5;
    private Curso[] cursos;


    public Estudiante(String nombre, String apellido, String codigo) {

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public Curso getCurso1() {
        return Curso1;
    }

    public Curso getCurso2() {
        return Curso2;
    }

    public Curso getCurso3() {
        return Curso3;
    }

    public Curso getCurso4() {
        return Curso4;
    }

    public Curso getCurso5() {
        return Curso5;
    }


    public boolean asignarCurso(Curso curso) {


        return false;
    }

    public double CalcularPromedio()//me calcula el promedio de la materia
    {

        return 0;
    }

    public boolean pensumIncluyeCurso(String codigoCurso) {

    return true;
    }

    public boolean EstudianteEstaPrueba() {


        return true;

    }

    public boolean tieneCursosCompletos(String codigoCurso) {
        return false;
    }

    public Curso BuscarCurso(String codigoCurso) {

        return null;

    }

}