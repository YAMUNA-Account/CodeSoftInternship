import java.util.*;
public class Project4 {
    private static int res,r=0;
    private static int i=0,j=0;
    private static int flag=0;
    public static void main(String args[]) throws Exception {

        System.out.println("Hello!! WELCOME TO JAVA QUIZ SECTION");
        System.out.println("You will have 5 multiple choice questions based on basics of java and each question will have 10secs and at end of 5th question that final score is displayed");
        start();
    }
    static void start() throws Exception {

        while(i<5) {
            i++;
            System.out.println("Here you go with your "+i+" question");
            questions(i);
        }
        System.out.println("Your final score is "+ flag);
        if(flag>=4){
            System.out.println("Good job");
        }
        else{
            System.out.println("Better luck next time");
        }
        if(i==5){
            System.exit(0);
        }
    }
    static void questions(int num) throws Exception {
        Scanner sc= new Scanner(System.in);
        Timer timer = new Timer();
        switch (num) {

            case 1:

                System.out.println("The default value of a static integer variable of a class in Java is,");
                System.out.println("1.0                   2. 1 ");
                System.out.println("3.Garbage value       4.Null ");
                timer.schedule(task1,10*1000);
                res=sc.nextInt();
                timer.cancel();
                if(res==1){
                    flag++;
                    System.out.println("You got it");
                }
                break;
            case 2:

                System.out.println("Which of the following is not a Java features?");
                System.out.println("1.Dynamic                  2.Architecture Neutral ");
                System.out.println("3.Use of pointers          4.Object-oriented ");
                timer.schedule(task2,10*1000);
                res=sc.nextInt();
                timer.cancel();
                if(res==3){
                    flag++;
                    System.out.println("You got it");
                }
                break;
            case 3:

                System.out.println("Who invented Java Programming?");
                System.out.println("1.Guido van Rossum           2.James Gosling ");
                System.out.println("3.Dennis Richie             4.Bjarne Stroustrup");
                timer.schedule(task3,10*1000);
                res=sc.nextInt();
                timer.cancel();
                if(res==2){
                    flag++;
                    System.out.println("You got it");
                }
                break;
            case 4:
                System.out.println(" Which component is used to compile, debug and execute the java programs?");
                System.out.println("1.JRE             2.JIT ");
                System.out.println("3.JDK             4.JVM");
                timer.schedule(task4,10*1000);
                res=sc.nextInt();
                timer.cancel();
                if(res==3){
                    flag++;
                    System.out.println("You got it");
                }
                break;
            case 5:
                System.out.println(" Which of the following is not an OOPS concept in Java?");
                System.out.println("1.Polymorphism             2.Inheritance ");
                System.out.println("3.Encapsulation              4.Compilation");
                timer.schedule(task5,10*1000);
                res=sc.nextInt();
                timer.cancel();
                if(res==4){
                    flag++;
                    System.out.println("You got it");
                }
                break;
        }
    }
    static TimerTask task1 = new TimerTask()  {
        public void run() {
            System.out.println("Time's up! Moving to the next question.Press 0 to continue with next question");
        }
    };
    static TimerTask task2 = new TimerTask()  {
        public void run() {
            System.out.println("Time's up! Moving to the next question.Press 0 to continue with next question");
        }
    };
    static TimerTask task3 = new TimerTask()  {
        public void run() {
            System.out.println("Time's up! Moving to the next question.Press 0 to continue with next question");
        }
    };
    static TimerTask task4 = new TimerTask()  {
        public void run() {
            System.out.println("Time's up! Moving to the next question.Press 0 to continue with next question");
        }
    };
    static TimerTask task5 = new TimerTask()  {
        public void run() {
            System.out.println("Time's up! Moving to the next question.Press 0 to continue with next question");
        }
    };
}


