public class Main {
    public static void main(String[] args){
        //Variables
        //Always have a good name.  This is a basic concept of data
        //abstraction
        int numberHotdogs;
        double hotdogPrice = 2.5;
        numberHotdogs = 5;
        double taxRate = 1.12;
        double totalPrice;
        totalPrice = numberHotdogs * hotdogPrice * taxRate;
        System.out.println("You owe: $" + totalPrice );
        //Reference Data
        String name = "Paul Zaremba";
        int nameIndex = name.indexOf(" ");
        String firstName = name.substring(0,nameIndex);
        String lastname = name.substring(nameIndex + 1);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastname);
        System.out.println("THIS IS NEW");

    }
}
