package Ej7;
public class SquareCubeTable {
    public static void main(String[] args) {
        System.out.println("Numero\tCuadrado\tCubo");
        for (int i = 0; i <= 10; i++){
            System.out.println(i+ "\t" + (i * i) + "\t" + (i * i * i));
        }
    }
}
