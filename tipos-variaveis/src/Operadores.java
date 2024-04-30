public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);
        String nomeCompletoMaior = nomeCompleto.concat(" É DEMAIS");
        System.out.println(nomeCompletoMaior);

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        //a partir do momento que detecta caracteres, faz concatenação

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        //como aqui estava em parênteses, fez a soma primeiro;


        int numero = 5;
        System.out.println(- numero); //sout + TAB ou ENTER para completar

        //usar equals para comparar objetos e strings(que tbm são objetos)
    }
}
