package easy;

import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {

        int i=0;

        String numDigitadoString = JOptionPane.showInputDialog("Digite um número entre 1 a 10: ");
        int numDigitado = Integer.parseInt(numDigitadoString);

        while(i<=10){
            System.out.println("Tabuada do "+numDigitado+ " é: " + (numDigitado*i));
            i++;
        }    
    }
}
