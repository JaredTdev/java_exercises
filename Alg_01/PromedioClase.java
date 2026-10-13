import java.util.Scanner;

public class PromedioClase {
    public static void main(String[] args) {
        // Crea objeto Scanner para obetener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        // Fase de inicializacion
        int total = 0; // inicializa la suma de calificaciones introducidas por el usuario
        int contadorCalificaciones = 1; // inicializa # de calificacion a introducir a continuacion

        // la fase de procesamiento usa la repeticion controlada por contador
        while (contadorCalificaciones <= 10) { // itera 10 veces
            System.out.print("Escriba la calificacion: "); // Indicador
            int calificacion = entrada.nextInt(); // recibe siguiente calificacion de entrada

            total = total + calificacion; // suma calificacion al total
            contadorCalificaciones = contadorCalificaciones + 1; // incrementa el contador en 1
        }

        int promedio = total / 10; // la division de neteros produce resultado entero

        // muestra el total y el promedio de la calificaciones
        System.out.printf("%nEl total de las calificaciones es %d%n", total);
        System.out.printf("El promedio de la clase es %d%n", promedio);
    }
}
