package CoinToss;
import javax.sound.midi.Soundbank;
import java.util.*;
public class CoinToss {
    public static void main(String[] args) throws InterruptedException {
        Scanner cin = new Scanner(System.in);

        System.out.println("**TOSS A COIN**");

        String think = " ";
        System.out.print("Think of Head or Tail(type H/T): " );
        think = cin.nextLine();
        System.out.println();
        System.out.print("Tossing a coin");

        //delay and print dots...
        for (int i = 0; i < 3; i++) {
            Thread.sleep(750); // Delay for 1 second
            System.out.print(".");
        }

        System.out.println();
        System.out.print("Coin is in the air");

        for (int i = 0; i < 3; i++) {
            Thread.sleep(750); // Delay for 1 second
            System.out.print(".");
        }
        System.out.println();
        Thread.sleep(1000);

        System.out.println("Coin is in your hand");

//        Thread.sleep(1500);
        System.out.println();
//


        Random random = new Random();
        boolean isHead = random.nextBoolean();


        if(isHead){
            Thread.sleep(1500);
            System.out.println("***It's a HEAD***");
        }
        else{
            Thread.sleep(1500);
            System.out.println("***It's a TAIL***");
        }

    }


}
