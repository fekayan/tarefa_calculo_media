
public class Main {
    public static void main(String[] args) {

        calculoMedia();
    }

    private static void calculoMedia() {
        int nota1 = 10;
        int nota2 = 8;
        int nota3 = 6;
        int nota4 = 9;

        int notafinal = (nota1 + nota2 + nota3 + nota4) / 4;

        if (notafinal >= 6) {
        System.out.println("A média do aluno é: \n" + notafinal + "\nParabéns, ele está aprovado!!");
    } else {
                System.out.println("A média do aluno é: \n" + notafinal + "\nParabéns, ele está aprovado!!");
    }
}
}



