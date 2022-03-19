package medium;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        int anterior=0, i=1;



        while (i<=5) {

            String numDigString = JOptionPane.showInputDialog("Qual o número  digitado? ");
            int numDig = Integer.parseInt(numDigString);

            
            if (numDig < anterior || i==1) {
                anterior = numDig;
            }
        i++;    
        }

        System.out.println("O menor número digitado é: " +anterior);
    }
}
