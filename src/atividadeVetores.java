import java.util.Scanner;

public class atividadeVetores {
        public static void main(String[] args){
            int[] idade = new int[10];

            for(i=0; i<=10; i++){
                Scanner sc = new Scanner(System.in);
                System.out.println("DIGITE A "+ i +"º IDADE: ");
                idade[i] = sc.nextInt();
            }
        }
}
