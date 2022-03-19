package medium;

import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        String[] vetorAluno = new String[5];
        int[] vetorNumeroAluno = new int[5];
        int i=0;
        
        while (i<=4) {
            vetorAluno[i] = JOptionPane.showInputDialog("Nome do Aluno: ");
            vetorNumeroAluno[i] = Integer.parseInt(JOptionPane.showInputDialog("Número do Aluno: "));
            i++;
        }
        
        i=0;

        while (i<=4) {
            System.out.println(vetorAluno[i]);
            System.out.println(vetorNumeroAluno[i]);
            i++;
        }
        
    }
}
