package Claswork_1.ua;

public class Audition {
    public boolean dataType(String string) { // I MUST DO THIS CORRECTLY

        if (string.matches(".*\\d.*")) { // I DO THIS INCORRECTLY
            return true;                       //
        }
        System.out.println("Error.");
        System.out.println("Please input number.");
        return false;
    }
}
