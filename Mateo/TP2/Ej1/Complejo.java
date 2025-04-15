package Mateo.TP2.Ej1;

public class Complejo {

    private double real;
    private double imaginario;

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complejo sumar(Complejo otro) {
        return new Complejo(this.real + otro.real, this.imaginario + otro.imaginario);
    }

    public Complejo restar(Complejo otro) {
        return new Complejo(this.real - otro.real, this.imaginario - otro.imaginario);
    }

    public Complejo multiplicar(Complejo otro) {
        double real = this.real * otro.real - this.imaginario * otro.imaginario;
        double imaginario = this.real * otro.imaginario + this.imaginario * otro.real;
        return new Complejo(real, imaginario);
    }

    public Complejo dividir(Complejo otro) {
        double denominador = otro.real * otro.real + otro.imaginario * otro.imaginario;
        double real = (this.real * otro.real + this.imaginario * otro.imaginario) / denominador;
        double imaginario = (this.imaginario * otro.real - this.real * otro.imaginario) / denominador;
        return new Complejo(real, imaginario);
    }

    public Complejo dividirEscalar(double escalar) {
        return new Complejo(this.real / escalar, this.imaginario / escalar);
    }

    @Override
    public String toString() {
        String signo = (imaginario >= 0) ? " + " : " - ";
        return real + signo + Math.abs(imaginario) + "i";
    }
}
