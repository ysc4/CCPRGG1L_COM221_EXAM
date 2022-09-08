public class Student {
    String surname;
    String firstName;
    String middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

public void sayMyStudentNumber() {
    System.out.println("Student Number: " + studentNumber);
}
public void sayMyEmailAddress() {
    System.out.println("Email Address: " + studentEmailAddress);
}
public void amIAwesome() {
    System.out.println("Am I awesome?: " + iAmAwesome);
}

public Student (String sur, String firstN, String middleI, String dOB, int studNum, String studEmailAdd, boolean awesome){
    surname = sur;
    firstName = firstN;
    middleInitial = middleI;
    dateOfBirth = dOB;
    studentNumber = studNum;
    studentEmailAddress = studEmailAdd;
    iAmAwesome = awesome;
}

}
