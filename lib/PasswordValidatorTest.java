package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 "+pw+" Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 "+pw+" FAILED: Expected INVALID but got " + result1);
        }
         // Test Case 2 : รหัสผ่านทั้งหมดเป็นตัวเล็กจะ WEAK
         pw = "abcdefghij";
        PasswordStrength result2 = PasswordValidator.validate("abcdefghij");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 2 "+pw+" Passed: All password is INVALID.");
        } else {
            System.out.println("Test Case 2 "+pw+" FAILED: Expected INVALID but got " + result2);
        }
        // Test Case 3: รหัสผ่านทั้งหมดเป็นตัวใหญ่ ตัวเล็ก จะเป็น MEDIUM
        pw = "Chew";
        PasswordStrength result3 = PasswordValidator.validate("Ce039");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 3 "+pw+" Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 3 "+pw+" FAILED: Expected INVALID but got " + result3);
        }
        // Test Case 4: รหัสผ่านทั้งหมดเป็นตัวใหญ่ ตัวเล็ก ตัวเลข ตัวอักขระจะเป็น STRONG
        pw = "Ce#039";
        PasswordStrength result4 = PasswordValidator.validate("!@#$%^&*()_+");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 4 "+pw+" Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 4 "+pw+" FAILED: Expected INVALID but got " + result4);
        }
        System.out.println("---------------------------------");
    }
}
