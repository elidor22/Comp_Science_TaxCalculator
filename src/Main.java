import java.util.Scanner;

public class Main {
    public static float user_Income;
    public static int fiscal_Status;

    public static void main(String[] args) {



        System.out.println("Hello World!");
        Main main = new Main();
        main.test();
    }


    static void test(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fiscal status");
        fiscal_Status = sc.nextInt();
        System.out.println("Enter your income");
        user_Income=sc.nextFloat();

        Income_Controller controller = new Income_Controller();
        Tax_Calculator_BackBone backend = new Tax_Calculator_BackBone();
        backend.income = user_Income;

        System.out.println("You have to pay: "+backend.to_Pay+"$");

    }
}
