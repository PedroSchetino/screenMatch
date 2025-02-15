import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        // POR BOAS PRATICAS, INCIA-SE A VARIAVEL COM VALOR 0
        double mediaAvaliacao = 0;
        double nota;

        /* SINTAXE DO LOOP FOR:
           int = 0 - iterador cujo a variavel inicia com 0
           i < 3 - variavel i se repete 3 vezes (a partir do 0, ex: 0, 1, 2 = 3)
           i++ - contador: de quanto em quanto a var incrementa. ex:
           i++ nesse caso vai subir de 1 em 1, começa do 0, depois 1, 2 e assim por diante.
         */

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliacão para o filme: ");
            nota = leitura.nextDouble();
            /* OTIMIZAR SINTAXE MEDIA AVALIACAO:
               a variavel mediaAvaliacao recebe o que ja tinha (3 notas digitadas) + nota, segue:
               mediaAvaliacao = mediaAvaliacao + nota;
               em vez de repetir a variavel "mediaAvaliacao", colocamos apenas o sinal de + antes do =
               essa sinataxe adota o mesmo contexto do i++ (somando de 1 em 1)
             */
            mediaAvaliacao += nota;
        }
        System.out.printf("Média de avaliações: %.1f", mediaAvaliacao / 3);
    }
}
