import java.util.*;
public class Project2 {
    public static void main(String args[]){
        int marks=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("GRADE CALCULATOR");
        System.out.println("How many subjects?");
        int n=sc.nextInt();
        System.out.println();
        System.out.println("Enter the marks in each subject separately");
        int mark[] = new int[n];
        for(int i=0;i<n;i++){
            mark[i]=sc.nextInt();
            marks=marks+mark[i];
        }
        int avg=(marks/n);
        System.out.println("Your Percentage "+avg);
        if(avg>90){
            System.out.println("A Grade - Great, Keep it up");
        }
        else if(avg>80){
            System.out.println("B Grade - Good ");
        }
        else if(avg>70){
            System.out.println("C Grade - You can do it, But some focus is needed ");
        }
        else if(avg>60){
            System.out.println("D Grade - Work little hard to reach good grade");
        }
        else{
            System.out.println("Fail - Its good time to learn from your mistake and gain knowledge");
        }


    }
}
