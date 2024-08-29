/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapair;

import java.util.List;

/**
 *
 * @author juan_
 */
public class Persona {
    private String dato1; // Nombre o EPS
    private String dato2; // Edad o fecha de nacimiento

    public Persona(String dato1, String dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public String getDato1() {
        return dato1;
    }

    public void setDato1(String dato1) {
        this.dato1 = dato1;
    }

    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }

    @Override
    public String toString() {
        return "(" + dato1 + ", " + dato2 + ")";
    }
}