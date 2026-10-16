package com.Ercilla;

public class helloWorld {
    public static void main (String[] args) {
        mensaje msg = new mensaje();
        String nombre = msg.solicitarDatos("escribe tu nombre: ");
        msg.saludar(nombre);
    }
}
