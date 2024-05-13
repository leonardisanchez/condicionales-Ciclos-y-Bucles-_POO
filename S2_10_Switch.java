/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S02_10;

/**
 *
 * @author USUARIO
 */
public class S2_10_Switch {

    public static void main(String[] args) {
        int day = 3;
        String dayName;

        // Switch: Asignar un nombre al día de la semana
        dayName = switch (day) {
            case 1 ->
                "Lunes";
            case 2 ->
                "Martes";
            case 3 ->
                "Miércoles";
            case 4 ->
                "Jueves";
            case 5 ->
                "Viernes";
            default ->
                "Fin de semana";
        };

        System.out.println("Hoy es " + dayName); // Imprime el nombre del día
    }
}
