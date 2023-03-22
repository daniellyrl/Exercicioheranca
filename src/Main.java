import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();

        System.out.println("Digite 1 para professor e 2 para aluno");
        int escolha = sc.nextInt();
        switch (escolha){
            case 1:
                System.out.println("Digite o seu nome: ");
                p1.setNome(sc.next());
                System.out.println("Qual a sua idade: ");
                p1.setIdade(sc.nextInt());
                System.out.println("Qual a sua especialização: ");
                p1.setEspecialização(sc.next());
                System.out.println("Qual o seu salário: ");
                p1.setSalario(sc.nextDouble());

                System.out.println("Você quer exibir os dados? ");
                int r = sc.nextInt();
                if (r == 1){
                    System.out.println("Nome: " + p1.getNome() +
                            "\nIdade: " + p1.getIdade() + "Especialização: " + p1.getEspecialização() +
                            "\nSalário: " + p1.getSalario());
                }else{
                    System.out.println("Obrigada");
                }
                break;

            case 2:
                System.out.println("Digite o seu nome: ");
                a1.setNome(sc.next());
                System.out.println("Qual a sua idade: ");
                a1.setIdade(sc.nextInt());
                System.out.println("Qual foi a sua primeira nota? ");
                a1.setNota1(sc.nextDouble());
                System.out.println("Qual a sua segunda nota: ");
                a1.setNota2(sc.nextDouble());
                a1.calculamedia();
                System.out.println("Sua média é: " + a1.getMedia());
                System.out.println("Você quer exibir os dados? ");
                int r2 = sc.nextInt();
                if (r2 == 1){
                    System.out.println("Nome: " + a1.getNome() +
                            "\nIdade: " + a1.getIdade() + "Nota 1: " + a1.getNota1() +
                            "\nNota 2: " + a1.getNota2() + "Média: " + a1.getMedia()) ;
                }else{
                    System.out.println("Obrigada");
                }
                break;
        }
    }
}
