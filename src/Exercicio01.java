 
public class Exercicio01 {

    public String[] exibirVetor() {
        String [] vetorImparPar = new String[101];
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                vetorImparPar[i] = "O número: " +i+ " é par";
            } else {
                vetorImparPar[i] = "O número: " +i+ " é impar";
            }
            i++;
        }

        return vetorImparPar;
    }
}
