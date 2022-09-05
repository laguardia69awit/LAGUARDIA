public class App {
    public static void main(String[] args) {
   
        // Create a Student Class

        // Properties

        // object - stu
        // surname
        // firstName
        // middleInitial
        // dateOfBirth
        //studentNumber
        //studentEmailAddress
        //iAmAwesome

        // object - stu
        // surname - Laguardia
        // firstName - Luis Gabriel
        // middleInitial - H
        // dateOfBirth - 05/04/04
        //studentNumber - 2022104583
        //studentEmailAddress - laguardialh@students.national-u.edu.ph
        //iAmAwesome - true

        Student stu = new Student();

        stu.surname = "Laguardia";
        stu.firstName = "Luis Gabriel";
        stu.middleInitial = 'H';
        stu.dateOfBirth = "05/04/04";
        stu.studentNumber = 2022104583;
        stu.studentEmailAddress = "laguardialh@students.national-u.edu.ph";
        stu.iAmAwesome = true;
        stu.sayMystudentNumber();
        stu.sayMyemailAddress();
        stu.sayiAmAwesome();

}
}
