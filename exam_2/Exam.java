import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "POSITIVE" if the number is a positive number. 
        // print "NEGATIVE" if the number is a negative number. 
        // print "ZERO" if the number is ZERO. 
        //(10 pts)

        System.out.println("1. Positive, negative, zero");
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        
        if (number < 0) {
            System.out.println("NEGATIVE");
        }
        else if (number == 0) {
            System.out.println("ZERO");
        }
        else {
            System.out.println("POSITIVE");
        }

        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // or a composite number.
        // (10 pts)

        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();

        int div, x = 0; 
        boolean isPrime = true;
        x = lastDigit/2;

        if (lastDigit == 1 || lastDigit == 0) {
            System.out.println("NEITHER");
        }
        else {
            for (div=2; div<=x; div++){
                if (lastDigit % div == 0) {
                    System.out.println("COMPOSITE");
                    isPrime = false;
                    break;
                }
                }
            if (isPrime) {
                System.out.println("PRIME");
            }
        }

        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();

        int nameLength = firstName.length() + surName.length();
        System.out.println("The sum of the character length of your first name and surname is: " + nameLength);

        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest number.
   
        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The largest number is " + firstNumber);
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The largest number is " + secondNumber);
        }
        else {
            System.out.println("The largest number is " + thirdNumber);
        }

        // ==============================================================================

        // 5. Create a method that will print "VOWEL" if your name starts with
        // a vowel and "CONSONANT" if your name starts with a consonant.
        
        System.out.println("5. Vowel or Consonant");
        System.out.print("Enter the first character of your first name: ");
        char firstChar = scan.next().charAt(0);

        if (firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U') {
            System.out.println("VOWEL");
        }
        else {
            System.out.println("CONSONANT");
        }

        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();

        if (studentNumber == 2022101525) {
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        surName = scan.next();

        if (firstName == firstName.toUpperCase() && surName == surName.toLowerCase()) {
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();

        // If BSIT
        switch (course) {
            case "BSIT" :
            System.out.print("Enter your specialization (MWAA or MAA): ");
            String specialization1 = scan.next();
                switch (specialization1) {
                    case "MWAA" :
                    System.out.println("valid");
                    break;
                    case "MAA" :
                    System.out.println("valid");
                    break;
                    default:
                    System.out.println("invalid");
                    break;
                }
            break;
            case "BSCS":
            System.out.print("Enter your specialization (DF or ML): ");
            String specialization2 = scan.next();
                switch (specialization2) {
                    case "DF":
                    System.out.println("valid");
                    break;
                    case "ML":
                    System.out.println("valid");
                    break;
                    default:
                    System.out.println("invalid");
                    break;
                }
            break;
        }

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();

        switch (strand) {
            case "STEM":
            System.out.println("valid");
            break;
            case "ICT":
            System.out.println("valid");
            break;
            case "HUMSS":
            System.out.println("valid");
            break;
            case "HOME ECONOMICS":
            System.out.println("valid");
            break;
            case "ARTS AND DESIGN":
            System.out.println("valid");
            break;
            case "TVL MARITIME":
            System.out.println("valid");
            break;
            default:
            System.out.println("invalid");
            break;
        }

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        //(10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        if (studentEmailAddress.contains(surName.toLowerCase()) && studentEmailAddress.contains("@students.national-u.edu.ph")) {
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }

        // Close scanner
        scan.close();
        }
    }




        
     
