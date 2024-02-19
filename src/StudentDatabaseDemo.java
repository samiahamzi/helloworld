public class StudentDatabaseDemo {
    public static void main(String[] args) {

        String[] listTest = {"Sami", "Rasmus", "Oskar", "Salem", "Lucas"};
        StudentDatabase test = new StudentDatabase(listTest);


        System.out.println(test.IsStudentEnrolled("Sami"));
        test.addNames("abe");
        test.getNewStudentList();

    }
}
