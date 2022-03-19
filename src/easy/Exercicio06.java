package easy;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {

        double media;
        
        String nota1String = JOptionPane.showInputDialog("Digite a primeira nota: ");
        int nota1 = Integer.parseInt(nota1String);

        String nota2String = JOptionPane.showInputDialog("Digite a segunda nota: ");
        int nota2 = Integer.parseInt(nota2String);

        media = ((nota1+nota2)/2);

        if (media > 5){
            System.out.println("Sua média foi: " +media+ ". Aprovado");
        }
         
        if (media < 5){
            System.out.println("Sua média foi: " +media+ ". Reprovado");
        }

        if (media == 5){
            System.out.println("Sua média foi: " +media+ ". Exame");
        }
        
    }

}

