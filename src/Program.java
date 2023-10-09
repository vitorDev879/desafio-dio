import java.util.Scanner;

public class Program {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        String nivel;

        for (int i = 0; i < 1; i++) {
            System.out.println("Digite o nome do Herói: ");
            String nome = sc.next();
            System.out.println("Digite a quantidade de XP: ");
            int xp = sc.nextInt();


            if (xp < 1000) {
                nivel = "Ferro";
            } else if (xp >= 1001 && xp <= 2000) {
                nivel = "Bronze";
            } else if (xp >= 2001 && xp <= 5000) {
                nivel = "Prata";
            } else if (xp >= 6001 && xp <= 7000) {
                nivel = "Ouro";
            } else if (xp >= 7001 && xp <= 8000) {
                nivel = "Platina";
            } else if (xp >= 8001 && xp <= 9000) {
                nivel = "Ascendente"; 
            } else if (xp >= 9001 && xp <= 10000) {
                nivel = "Imortal";
            } else  {
                nivel = "Radiante";
            }
            System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);
        }

    }
}
