package barricada_ejercicio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Leer correo, contraseña y edad
     

        // Validación (barricada)
        String correo = ValidadorUsuario.validarCorreo(entradaCorreo);
        String contrasena = ValidadorUsuario.validarContrasena(entradaContrasena);
        Integer edad = ValidadorUsuario.validarEdad(entradaEdad);

        // Guardar datos en objeto usuario en caso que todos los datos sean válidos
        // de lo contrario indicar mensaje de error 
   
    }
}
