package com.Ercilla;

public class helloWorld {
    public static void main (String[] args) {
        mensaje msg = new mensaje();
        String nombre = msg.solicitarDatos("escribe tu nombre: ");
        String apellido = msg.solicitarDatos("escribe tu apellido: ");
        Persona p1 = new Persona(nombre, apellido);
        msg.saludar(p1);
    }
}
