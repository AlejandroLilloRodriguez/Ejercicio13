package aplicacion;
import java.util.Scanner;
import dominio.Matematicas;

public class Principal {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce un numero entero");
        int n = sc.nextInt();
        int[] lista ={1,2,3,4,5,6,7,8,9,10};
                double media=Matematicas.media(lista);
                double alcuadrado=Matematicas.media(lista);
                double varianza=(alcuadrado/lista.length)-media*media;
                double desviaciontipica=Math.sqrt(varianza);
        System.out.println("la suma de los numeros enteros desde 0 hasta " + n + " es " + Matematicas.suma(n));
        System.out.println("la multiplicacion de los numeros enteros desde 1 hasta " + n + " es " + Matematicas.multiplicacion(n));
        System.out.print("introduce un numero entero");
        int m = sc.nextInt();
        System.out.println("la potencia de " + n + " elevado a " + m + " es " + Matematicas.potencia(n, m));
        System.out.println("la suma de los elementos de la lista es " + Matematicas.sumaLista(lista));
        System.out.println("la media de los elementos de la lista es " + Matematicas.media(lista));
        System.out.println("la desviaion tipica de los elementos de la lista es " + desviaciontipica);
        System.out.println("la suma de los numeros pares desde 0 hasta " + n + " es " + Matematicas.sumaPares(n));
        System.out.println("la suma de los numeros pares de la lista es " + Matematicas.sumaListaPares(lista));
        System.out.println("la lista de numeros pares de la lista es " + Matematicas.listaPares(lista));
        System.out.println("la lista de numeros pares desde 0 hasta " + n + " es " + Matematicas.listaDePares(n));
        System.out.println("el producto escalar de la lista 1 y la lista 2 es " + Matematicas.productoEscalar(lista, lista));
        System.out.println("el numero de fibonacci de " + n + " es " + Matematicas.fibonacci(n));
        System.out.print("introduce un numero entero");
        int x=sc.nextInt();
        System.out.println("la relacion aurea entre dos numeros es " + Matematicas.relacionAurea((1+Math.sqrt(5))/2));

        }

}
