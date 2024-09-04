//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
class Myclass{
    public static void main(String[]args){
        Scanner myObj = new Scanner(System.in);
        //inputs
        System.out.print("enter first number: ");
        int n1=myObj.nextInt();
        
        System.out.print("enter second mumber: ");
        int n2=myObj.nextInt();
        
        System.out.print("enter third mumber: ");
        int n3=myObj.nextInt();
        
        System.out.print("enter fourth mumber: ");
        int n4=myObj.nextInt();
        
        //sum
        int sum=0;
        sum = n1+n2+n3+n4;
        
        double doubleSum = (double) sum;  //convert sum to a double
        double avg=0;
        avg = doubleSum/4;
        
        System.out.println("The sum is "+sum);
        System.out.print("The average is "+avg);

        
        
    }
}


//Paste console output below:
/*
enter first number: 433
enter second mumber: 232
enter third mumber: 112
enter fourth mumber: 344
The sum is 1121
The average is 280.25

*/
