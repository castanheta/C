import java.util.*;

public class b1_1 {
    public static void main(String[] args){
        double in1, in2, result = 0;
        String op;

        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                String[] symbols = sc.nextLine().split(" ");
                in1 = Double.parseDouble(symbols[0]);
                op = symbols[1];
                in2 = Double.parseDouble(symbols[2]);

                switch(op){
                    case "+":
                        result = in1 + in2;
                        break;
                    
                    case "-":
                        result = in1 - in2;
                        break;

                    case "*":
                        result = in1 * in2;
                        break;

                    case "/":
                        result = in1 / in2;
                        break;
                    
                    default:
                        System.err.println("Invalid operator");
                }

                System.out.println("Result: " + result);
            
            } catch(NumberFormatException e) {
                System.out.println("Operators must be a number");
                sc.close();
            } catch(ArrayIndexOutOfBoundsException e){
                System.err.println("Incorrect number of inputs <num> <operator> <num>");
                sc.close();
            }
        } 
    }
}