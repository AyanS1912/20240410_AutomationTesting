package Selenium_Testing;

public class AccessSpeciifer {
    // Public variable can be accessed from anywhere
    public int publicVariable = 10;
    
    // Private variable can only be accessed within this class
    private int privateVariable = 20;
    
    // Protected variable can be accessed within this class and its subclasses
    protected int protectedVariable = 30;
    
    // Default (package-private) access variable can be accessed within the same package
    int defaultVariable = 40;

    // Public method can be accessed from anywhere
    public void display() {
        System.out.println("Public variable: " + publicVariable);
        System.out.println("Private variable: " + privateVariable);
        System.out.println("Protected variable: " + protectedVariable);
        System.out.println("Default variable: " + defaultVariable);
    }
    
    public static void main(String[] args) {
    	AccessSpeciifer example = new AccessSpeciifer();

        // Accessing public variable and method from anywhere
        System.out.println("Accessing public variable: " + example.publicVariable);
        example.display();

        // Private variable and method cannot be accessed from outside the class
//         System.out.println("Accessing private variable: " + example.privateVariable);
//         example.display();

        // Protected variable is not accessible from outside the package
//         System.out.println("Accessing protected variable: " + example.protectedVariable);
//         example.display();
        
        // Default variable is accessible only within the same package
//         System.out.println("Accessing default variable: " + example.defaultVariable);
//         example.display();
    }
}

