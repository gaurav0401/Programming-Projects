import java.util.Scanner;

public class TaxCalc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int salary;
        double tax=0;
        System.out.println("Enter salary:");
        salary=input.nextInt();
        if (salary<=250000){
            System.out.println("You dont have to pay tax");
        }
        else if (salary>250000&&salary<=500000) {
            tax=tax+0.05*(salary-250000);
            System.out.println("You have to pay :"+tax);

        }
        else if (salary>500000&&salary<=1000000) {
            tax=tax+0.05*(500000-250000);
            tax=tax+0.2*(salary-500000);
            System.out.println("You have to pay :"+tax);

        }
        else  {
            tax=tax+0.05*(500000-250000);
            tax=tax+0.2*(1000000-500000);
            tax=tax+0.3*(salary-1000000);
            System.out.println("You have to pay :"+tax);

        }
    }
}
