package dominio;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Matematicas {
    public static int suma(int n) {
        return Stream.iterate(0, x -> x + 1).limit(n + 1).reduce(0, (x, y) -> x + y);
    }

    public static int multiplicacion(int n) {
        return Stream.iterate(1, x -> x + 1).limit(n).reduce(1, (x, y) -> x * y);
    }

    public static int potencia(int n, int m) {

        return Stream.iterate(1, x -> x + 1).limit(m).reduce(1, (x, y) -> x * n);
    }

    public static int sumaLista(int[] lista) {
        return Stream.iterate(0, i -> i + 1).limit(lista.length).map(i -> lista[i]).reduce(0, (a, b) -> a + b);
    }

    public static double media(int[] lista) {
        return Stream.iterate(0, i -> i + 1).limit(lista.length).map(i -> lista[i]).reduce(0, (x, y) -> (x + y)) / lista.length;
    }

    public static double alcuadrado(int[] lista) {
        return Stream.iterate(0, x -> x + 1).limit(lista.length).map(n -> lista[n]).reduce(0, (x, y) -> x + y * y);
    }

    public static int sumaPares(int n) {
        return Stream.iterate(0, x -> x + 1).limit(n + 1).filter(x -> x % 2 == 0).reduce(0, (x, y) -> x + y);
    }

    public static int sumaListaPares(int[] lista) {
        return Stream.iterate(0, x -> x + 1).limit(lista.length).map(x -> lista[x]).filter(x -> x % 2 == 0).reduce(0, (x, y) -> x + y);
    }

    public static ArrayList listaPares(int[] lista) {
        return Stream.iterate(0, x -> x + 1).limit(lista.length + 1).filter(x -> x % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList listaDePares(int n) {
        return Stream.iterate(0, x -> x + 1).limit(n + 1).filter(x -> x % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
    }

    public static int productoEscalar(int[] lista1, int[] lista2) {
        return Stream.iterate(0, i -> i + 1).limit(lista1.length).map(i -> lista1[i] * lista2[i]).reduce(0, (a, b) -> a + b);
    }

    public static int fibonacci(int n) {
        return Stream.iterate(new int[]{0, 1}, x -> new int[]{x[1], x[0] + x[1]}).limit(n).map(x -> x[0]).reduce(0, (x, y) -> x + y);
    }

    public static int fibonacci12() {
        return Stream.iterate(new int[]{0, 1}, x -> new int[]{x[1], x[0] + x[1]}).limit(12).map(x -> x[0]).reduce(0, (x, y) -> x + y);
    }

    public static int fibonacci13() {
        return Stream.iterate(new int[]{0, 1}, x -> new int[]{x[1], x[0] + x[1]}).limit(13).map(x -> x[0]).reduce(0, (x, y) -> x + y);
    }

    public static boolean relacionAurea(double x) {
        double cociente = (double) fibonacci13()/fibonacci12();
        if(Math.abs(x-cociente)<0.1){
            return true;
        }else{
            return false;
        }


    }
}
