public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

//      IF-ELSE-ELSE IF:
//        if (nota >= 7)
//            System.out.println("Aprovado");
//        else if (nota >= 5 && nota < 7)
//            System.out.println("Recuperação");
//        else
//            System.out.println("Reprovado");

//      Condição Ternária

        System.out.println(nota >= 7 ? "Aprovado" :
                nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado!");
    }
}
