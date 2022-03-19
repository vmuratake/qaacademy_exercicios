package easy;

import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {

        String numString = JOptionPane.showInputDialog("Digite o número que será calculado: ");
        int num = Integer.parseInt(numString);
        System.out.println("O dobro do número " +num + " é: " +num*2);

    }
    
}
