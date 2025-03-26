public class racional{

    private int numerador;
    private int denominador;

    public racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador; 
    }

    public int getNumerador(){
        return numerador;
    }

    public void setNumerador(int numerador){
        this.numerador = numerador;
    }

    public int getDenominador(){
        return denominador;
    }      

    public void setDenominador(int denominador){
        this.denominador = denominador;
    }

    public String toString(){
        return "racional [numerador="+numerador+"denominador="+denominador+"]";
    }
}