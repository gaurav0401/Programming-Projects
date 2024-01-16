import java.util.Scanner;

public class WebsiteCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name;
        System.out.println("Enter website name with its domain:");
        name=input.next();
        if (name.endsWith(".com")){
            System.out.println("Its a commercial website");

        }
        else if (name.endsWith(".org")){
            System.out.println("Its a organisation website");

        }
        else if (name.endsWith(".gov")){
            System.out.println("Its a government website");

        }
    }
}
