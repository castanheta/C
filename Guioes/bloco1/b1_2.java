import java.util.*;

public class b1_2 {
    static HashMap<String, Double> var = new HashMap<String, Double>(); 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double res;
        try {
            while(sc.hasNextLine()) {
                String[] symbols = sc.nextLine().split(" ");
                
                if(symbols.length >= 3 && symbols[1].equals("=")){
                    var.put(symbols[0], value(symbols[2]));

                }else if(symbols.length == 1){
                    System.out.println(value(symbols[0]));

                }else if(symbols.length == 3){
                    double in1 = value(symbols[0]);
                    double in2 = value(symbols[2]);

                    switch(symbols[1]) {
                        case "+": 
                            res = in1 + in2;
                            System.out.println(res);
                            break;

                        case "-":
                            res = in1 - in2;
                            System.out.println(res);
                            break;

                        case "*":
                            res = in1 * in2;
                            System.out.println(res);
                            break;
                        
                        case "/":
                            res = in1 / in2;
                            System.out.println(res);
                            break;
                        default:
                            throw new Exception("Invalid operation");
                        }
                }
            }
        } catch(NumberFormatException e) {
            System.out.println("Operators must be a number");
            sc.close();
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Incorrect number of inputs <num> <operator> <num>");
            sc.close();
        }
    }

    static double value(String s) throws Exception {
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            try { 
                return var.get(s);
            } catch (Exception er) {
                throw new Exception("Variable not found");
            }
        }
    }
}