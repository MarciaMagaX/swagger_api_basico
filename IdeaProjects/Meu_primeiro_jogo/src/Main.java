import java.util.Random;
import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    //sorteia o número
    int numero_sorteado = random.nextInt(10);

    System.out.println("Adivinhe qual o um número de 1 a 10 \n");
    //aguarda entrada do usuário e armazena
    //em numero_escolhido
    int numero_escolhido = scanner.nextInt();

    if (numero_sorteado == numero_escolhido) {
        System.out.println("Você acertou!");

    } else {
        System.out.println("Você errou!");
        System.out.println("Pensei no número: " + numero_sorteado);
    }
}
