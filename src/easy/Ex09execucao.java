package easy;

public class Ex09execucao {
    public static void main(String[] args) {
        Exercicio09 exercicio09 = new Exercicio09();
        int[] vetorTabuada = exercicio09.calcularTabuada(10);
        exibirVetor(vetorTabuada);
    }

    public static void exibirVetor(int[] vetorTabuada) {
        int i = 0;

        while(i<vetorTabuada.length){
            System.out.println(vetorTabuada[i]); 
            i++;
        }     
    }
}
