
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Exercicio:
            Faca um programa que leia 4 notas e faz a media das mesmas.
            Caso o aluno atinge 7+  = Aprovado
            Caso contrario = Em recuperacao
            Leia valor da nota da recuperacao = caso seja maior que 7 aprovado. Se nao reprovado.
         */
        List<Float> notaAluno = new ArrayList<>();
        float soma = 0;
        Scanner read = new Scanner(System.in);
        for (int i = 0; i <= 3; i++){
            System.out.print("NOTA " + (i + 1) + " : ");
            notaAluno.add(read.nextFloat());
            soma += notaAluno.get(i);
        }
        Float media = soma / notaAluno.size();
        if (media >= 7){
            System.out.println("Parabens Aprovado: " + media);

        }
        else {
            System.out.println("RECUPERACAO VALOR NOTA: " + media );
            System.out.print("NOTA POS RECUPERACAO: ");
            float notaRecuperacao = read.nextFloat();
            if (notaRecuperacao >= 7){
                System.out.println("Parabens Aprovado: " + notaRecuperacao);
            }
            else{
                System.out.print("REPROVADO: " + notaRecuperacao);
            }
        }

    }
}