import java.util.Scanner;

public class IPv4Converter {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        for (;;) {
            //Hexabase 16 is implemented here
            System.out.println("---------------------------------------------------------------");
            System.out.println("Hexadecimal base 16 and exponentiation is already implemented");
            int hexabase = 16;


            //1st octet
            System.out.println("---------------------------------------------------------------");
            System.out.println("1st octets");

            System.out.print("Enter hexadecimal number: ");
            String hexInput = input.next();
            int hexnum = Integer.parseInt(hexInput, 16);

            //Exponentiation (^1) is implemented here
            int result = (int) Math.pow(hexabase, 1) * hexnum;

            System.out.println("The result is " + result);
            int hexabase1 = 16;

            System.out.print("Enter hexadecimal number: ");
            String hexInput1 = input.next();
            int hexnum1 = Integer.parseInt(hexInput1, 16);
            //Exponentiation (^0) is implemented here
            int result1 = (int) Math.pow(hexabase, 0) * hexnum1;

            System.out.println("The result is " + result1);
            int sum = result + result1;


            //2nd octet
            System.out.println("---------------------------------------------");
            System.out.println("2nd octets");
            int hexabase2 = 16;

            System.out.print("Enter hexadecimal number: ");
            String hexInput2 = input.next();
            int hexnum2 = Integer.parseInt(hexInput2, 16);
            //Exponentiation (^1) is implemented here
            int result2 = (int) Math.pow(hexabase2, 1) * hexnum2;

            System.out.println("The result is " + result2);
            int hexabase3 = 16;

            System.out.print("Enter hexadecimal number: ");
            String hexInput3 = input.next();
            int hexnum3 = Integer.parseInt(hexInput3, 16);
            //Exponentiation (^0) is implemented here
            int result3 = (int) Math.pow(hexabase3, 0) * hexnum3;

            System.out.println("The result is " + result3);
            int sum1 = result2 + result3;


            //3rd octet
            System.out.println("---------------------------------------------");
            System.out.println("3rd octets");
            int hexabase4 = 16;

            System.out.print("Enter hexadecimal number: ");
            String hexInput4 = input.next();
            int hexnum4 = Integer.parseInt(hexInput4, 16);
            //Exponentiation (^1) is implemented here
            int result4 = (int) Math.pow(hexabase4, 1) * hexnum4;

            System.out.println("The result is " + result4);
            int hexabase5 = 16;

            System.out.print("Enter hexadecimal number: ");
            String hexInput5 = input.next();
            int hexnum5 = Integer.parseInt(hexInput5, 16);
            //Exponentiation (^0) is implemented here
            int result5 = (int) Math.pow(hexabase5, 0) * hexnum5;

            System.out.println("The result is " + result5);
            int sum2 = result4 + result5;


            //4th octet
            System.out.println("---------------------------------------------");
            System.out.println("4th octets");
            int hexabase6 = 16;

            System.out.print("Enter hexadecimal number: ");
            String hexInput6 = input.next();
            int hexnum6 = Integer.parseInt(hexInput6, 16);
            //Exponentiation (^1) is implemented here
            int result6 = (int) Math.pow(hexabase6, 1) * hexnum6;

            System.out.println("The result is " + result6);
            int hexabase7 = 16;

            System.out.print("Enter hexadecimal number: ");
            String hexInput7 = input.next();
            int hexnum7 = Integer.parseInt(hexInput7, 16);
            //Exponentiation (^0) is implemented here
            int result7 = (int) Math.pow(hexabase7, 0) * hexnum7;

            System.out.println("The result is " + result7);
            int sum3 = result6 + result7;


            //Display result in IP address format
            System.out.println("-------------------------------------");
            System.out.println("The IP address is " + sum + "." + sum1 + "." + sum2 + "." + sum3);
            System.out.println("-------------------------------------");


            System.out.print("Input any number to CONTINUE and 0 to END: ");
            int end=0|input.nextInt();

            if(end==0){
                System.out.println("Program terminated.");
                break;
            }
        }

    }
}
