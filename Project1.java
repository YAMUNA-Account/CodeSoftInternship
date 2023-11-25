import java.util.Random;
import java.util.*;
public class Project1 {
    public static void main(String args[]){
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME!!!!");
        System.out.println("GUESS THE NUMBER CHALLENGE");
        System.out.println("THE RULES:"+"\n"+"Your have 3 Rounds to play."+"\n"+"For Each round you will get 5 chances to guess the number"+"\n"+"At the end of the game your score will be displayed");;
        System.out.println("HERE YOU GO...BEST OF LUCK");
        System.out.println();
        for(int i=1;i<=3;i++) {
            Random rand = new Random();
            int randGen = rand.nextInt(100);

            for(int j=1;j<=5;j++){

                int userInp = sc.nextInt();
                if(randGen==userInp){
                    System.out.println("You got it !!!");
                    flag++;
                    if(i!=3) {
                        System.out.println("Your are Done ....Start with round " + (i + 1));
                    }
                    break;
                }
                else if(randGen>userInp){
                    System.out.println("Its small...Go with some greater numbers");
                    System.out.println("Go with the next attempt");
                }
                else if(randGen<userInp){
                    System.out.println("Its large...Try out some small numbers");
                    System.out.println("Go with the next attempt");
                }
                if(j==5 && i!=3){
                    System.out.println("Your are Done for this round ....Start with round "+ (i+1));
                }

            }

        }
        if(flag>1){
            System.out.println("Hurrah!!! A great Guess and you scored "+flag+" points");
        }else {
            System.out.println("Cool...You got "+ flag+"points. Want to go one more try!!");
        }
    }
}
