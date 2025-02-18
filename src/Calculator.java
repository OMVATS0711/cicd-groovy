public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator <add/sub> <num1> <num2>");
            return;
        }

        String operation = args[0];
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        if (operation.equalsIgnoreCase("add")) {
            result = num1 + num2;
            System.out.println("Addition Result: " + result);
        } else if (operation.equalsIgnoreCase("sub")) {
            result = num1 - num2;
            System.out.println("Subtraction Result: " + result);
        } else {
            System.out.println("Invalid operation! Use 'add' or 'sub'.");
        }
    }
}
