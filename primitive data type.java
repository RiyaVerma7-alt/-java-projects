public class PrimitiveDatatype {
    public static void main(String[] args) {
        // Declare primitive data types
        byte B;
        short S;
        int I;
        long L;
        float F;
        double D;
        char C;
        boolean bool;
       // Print default values 
        B = 0;
        S = 0;
        I = 0;
        L = 0L;
        F = 0.0f;
        D = 0.0;
        C = '*';
        bool = false;
       System.out.println("Default Values:");
        System.out.println("byte: " + B);
        System.out.println("short: " + S);
        System.out.println("int: " + I);
        System.out.println("long: " + L);
        System.out.println("float: " + F);
        System.out.println("double: " + D);
        System.out.println("char: '" + C);
        System.out.println("boolean: " + bool);
       // Assign new values
        B = 50;
        S = 32;
        I = 5;
        L = 90L;
        F = 3.14f;
        D = 100.00;
        C = 'A';
        bool = true;
       // Print assigned values
        System.out.println("\nAssigned Values:");
        System.out.println("byte: " + B);
        System.out.println("short: " + S);
        System.out.println("int: " + I);
        System.out.println("long: " + L);
        System.out.println("float: " + F);
        System.out.println("double: " + D);
        System.out.println("char: " + C);
        System.out.println("boolean: " + bool);
    }
}
