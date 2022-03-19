package easy;

import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        
        int soma, i=1;

        String numdigitadoString = JOptionPane.showInputDialog("Digite um valor: ");
        int numDigitado = Integer.parseInt(numdigitadoString);

        soma = numDigitado;

        while (i<=100){
            soma = soma + 2;
            System.out.println(soma);
            i++;
        }

    }
    
}
