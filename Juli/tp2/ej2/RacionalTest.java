

public class RacionalTest {
    public static void main(String[] args) {
        racional r1 = new racional(5, 4);
        racional r2 = new racional(3, 8);

        System.out.println(r1); 
        System.out.println(r2);

        System.out.println(r1.getNumerador());
        System.out.println(r1.getDenominador());

        r1.setNumerador(3);

        System.out.println(r1);
    }
}