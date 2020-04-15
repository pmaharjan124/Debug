import java.util.Scanner;

class Debug {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = sc.nextLine();


        System.out.println("Enter your age: ");
        int age = sc.nextInt();


        System.out.println("Enter your dob: ");
        double dob = sc.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("DOB: " + dob);





       // System.out.println("Enter your DOB year: "+int);
       // int dob = sc.nextInt();
       // System.out.println("Enter your DOB year: "+ dob);

       // System.out.println("Summary: " + "Your name is: " + name + "\n" + "Your age is: " + age + "\n" + "Your birth year is: " + dob);
    }
}