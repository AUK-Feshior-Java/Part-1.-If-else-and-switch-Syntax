import java.util.Scanner;

public class Main {
    /*




     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Demonstrate use of control statements: if/else, switch.
        int a =103;
        int b =23;
        if(a>b)
            System.out.println("a is bigger than b");
        else
            System.out.println("b is bigger than a");

        System.out.print("Enter your choice: ");
        int choice=Integer.parseInt(sc.nextLine());

        switch (choice){
            case 0:
                System.out.println("Your choice is 0");
                break;
            case 1:
                System.out.println("Your choice is 1");
                break;
            case 2:
                System.out.println("Your choice is 2");
                break;
            default:
                System.out.println("Wrong choice");
        }

    //Demonstrate relational operators: ==, !=, >, <, <=, >= inside if condition statement.
        int temp =0;

        //== >= <=
        if(temp==0){}
        else if(temp>=1){}
        else if(temp<=-1){}

        // < > ==
        if(temp>10){}
        else if(temp<10){}
        else{}

        // !=
        if(temp!=10){}

        //Compare strings using String.equals() inside if condition statement.
        String[] names = {"Vladislav","Anna","Vladislav"};
        if(names[0].equals(names[2]))
            System.out.println(names[0] +" is equal to " + names[2]);
        else
            System.out.println(names[0] +" is not equal to " + names[2]);


        if(names[1].equals(names[2]))
            System.out.println(names[1] + " is equal to " + names[2]);
        else
            System.out.println(names[1] + " is not equal to " + names[2]);

        //Demonstrate logical operators: &&, ||, ! inside if condition statement.
        for(int i=0;i<10;i++){
            for(int x=0;x<10;x++){
                if(i%2==0 && x%2==0)
                    System.out.print("*");
                else if(i%2!=0 || x%2!=0)
                    System.out.print("&");
            }
            System.out.println();
        }
        if(!true){
            System.out.println("Statement is true");
        }


        //Demonstrate using conditions with user input.
        System.out.print("Enter password: ");
        String userInput = sc.nextLine();
        if(userInput.equals("pass123"))
            System.out.println("Welcome!");
        else
            System.out.println("Wrong password");

        System.out.println("Enter first number: ");
        int fNum = Integer.parseInt(sc.nextLine());
        System.out.println("Enter second number: ");
        int sNum = Integer.parseInt(sc.nextLine());
        if(fNum==sNum)
            System.out.println("Your numbers are equal!");
        int sum = fNum+sNum;
        if(sum%2==0)
            System.out.println("Sum of your numbers is even!");
        else
            System.out.println("Sum of your numbers is odd!");

        //Demonstrate nested if/else conditionals

        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.print("-");
                if(i%10==0){
                    System.out.print("=");
                }else{
                    System.out.print("+");
                }
            }else{
                System.out.print("$");
            }
            if(i%10==0) System.out.println();
        }
    }
}