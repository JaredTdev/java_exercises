import java.util.Scanner;

public class Tienda {

	public static void main(String[] args) {
		double ventas[]=new double[10];
		Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese las 30 ventas del mes: ");
            for(int i=0; i<ventas.length;i++) // i=0 i comienza en cero
            {
                System.out.println("Venta "+(i+1));
                ventas[i]=sc.nextDouble();
            }
            int k=0;
            int total=0;
            System.out.println("Ventas mayores o igual a $2000");
            while (k<10) {
                if (ventas[k]>=2000) {
                    System.out.println("$" + ventas[k]);
                    total++;
                }
                k++;
            }
            
			System.out.println("El total de ventas mayores a 2000 es: "+total);
	}

}