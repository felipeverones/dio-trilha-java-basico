// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;

        float pi = 3.14F;
        long numeroGrande = 239472348927L;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto; //consigo passar um short pra um int, mas...
        short numeroCurto2 = (short) numeroNormal; // pra passar um int pra um short tenho q fazer o cast
    }
}