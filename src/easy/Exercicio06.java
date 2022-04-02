package easy;

public class Exercicio06 {
    public String retornaMedia(double nota1, double nota2) {

        double media = ((nota1+nota2)/2);

        if (media > 5){
            return "Aprovado";
        }
         
        if (media < 5){
            return "Reprovado";
        }

        if (media == 5){
            return "Exame";
        }

        return "Não foi possivel calcular sua média.";
    }    
}

