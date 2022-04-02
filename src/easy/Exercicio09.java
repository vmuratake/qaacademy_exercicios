package easy;

public class Exercicio09 {
    public int[] calcularTabuada(int numDigitado) {

        int[] vetorTabuada = new int[10];
        int i=1;

        while(i<=10){
            vetorTabuada[i -1]  = numDigitado*i;
            i++;
        } 
        return vetorTabuada;   
    }

}
