package medium;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        int i;

        String fatorialString = JOptionPane.showInputDialog("Digite um número: ");
        int fatorial = Integer.parseInt(fatorialString);

        i = fatorial;

        while (i>1) {
            fatorial = fatorial*(i-1);
            i--;
        }

        System.out.println("O fatorial do número digitado é: " +fatorial);

    }
}
