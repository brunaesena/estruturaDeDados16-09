import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Quantos alunos você quer cadastrar?");
        int quantidadeAlunos = leia.nextInt();

        Aluno[] vetorAlunos = new Aluno[quantidadeAlunos];
        float[] notasAluno = new float[6];

        for (int i=0; i < quantidadeAlunos; i++){
            System.out.println("--------------------------------------------");
            System.out.println("Digite as informações do aluno " + (i+1) + ": ");
            System.out.println("Nome: ");
            String nomeAluno = leia.next();
            System.out.println("Semestre: ");
            String semestreAluno = leia.next();
            System.out.println("Sala: ");
            String salaAluno = leia.next();
            System.out.println("Curso: ");
            String cursoAluno = leia.next();
            System.out.println("Digite as notas desse aluno: ");
            for (int j=0; j < 6; j++){
                System.out.println("Nota " + (j+1) + ": ");
                notasAluno[j] = leia.nextFloat();
            }
            System.out.println("Digite o endereço desse aluno: ");
            System.out.println("Rua: ");
            String ruaAluno = leia.next();
            System.out.println("Bairro: ");
            String bairroAluno = leia.next();
            System.out.println("Cidade: ");
            String cidadeAluno = leia.next();
            System.out.println("Estado: ");
            String estadoAluno = leia.next();
            System.out.println("CEP: ");
            String cepAluno = leia.next();
            Endereco enderecoAluno = new Endereco(ruaAluno,bairroAluno,cidadeAluno,estadoAluno,cepAluno);
            vetorAlunos[i] = new Aluno(nomeAluno,semestreAluno,salaAluno,cursoAluno,notasAluno,enderecoAluno);

        }

    }
}