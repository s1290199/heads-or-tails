import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class HorT {
    public static void main(String[] args){
        Random rand = new Random();
        int hc = 0, tc = 0;

        System.out.println("Who are you?");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println("Hello,"+str+"!");

        
        System.out.println("Tossing a coin...");
        for(int i = 1 ; i < 4 ; i++){
            System.out.print("Raund"+i+":");
            double r = rand.nextDouble();
            if(Math.round(r)==0){
                System.out.println("Heads");
                hc++;
            }
            else{
               System.out.println("Tails");
                tc++;
            }
        }
        System.out.println("Heads:"+hc+",Tails"+tc);
    }
}