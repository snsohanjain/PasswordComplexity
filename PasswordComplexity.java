import java.util.Scanner;

public class PasswordComplexity {

    public static boolean isPasswordComplex(String password) {

        if (password.length() < 6) {
            return false;
        }
        boolean hasLowerCaseLatter = false;
        boolean hasUpperCaseLatter = false;
        boolean hasNumber = false;
        for (int i = 0; i < password.length() || (!hasLowerCaseLatter && !hasUpperCaseLatter && !hasNumber); i++) {
            char current = password.charAt(i);
            if (Character.isDigit(current)){
                hasNumber = true;
            }else if (Character.isUpperCase(current)){
                hasUpperCaseLatter = true;
            }else if (Character.isLowerCase(current)){
                hasLowerCaseLatter = true;
            }

        }return  hasNumber && hasLowerCaseLatter && hasUpperCaseLatter;
    }

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a password: ");
       String userInput = scanner.nextLine();
       System.out.println("Is the password complex? " +
               isPasswordComplex(userInput));
    }
}
