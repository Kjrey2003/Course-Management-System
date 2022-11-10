//Functions Student login= Login page/Login credentials from text file in source file with txt file.
//Instructor login = Login page/login credentials from text file in source file with txt file.
//Instructor feedback/appointment/random dates/messages/zoomlink
//Administration = Login page/login credentials from text file in source file with txt file. Account creation
// Manage employees payroll
//String[] names = { "Bill", "Susan", "Steven", "Jean" }/n;/n formats the array output
//String[] names = { "Bill", "Susan", "Steven", "Jean" }/n;


public class PROJECT {
    public static void main(String[] args) {

        // Student login
        int[] passwords = {103331234, 923123456, 721679890, 445898789, 332098789, 123567654, 435345543, 566345543, 388098890};
        System.out.println(passwords[0]);

        String[] Student = {"doug", "catherine", "hosea", "hotep", "piget", "elektra", "anthony", "jake", "rob", "doug"};
        Student[1] = "catherine";
        System.out.print(Student[9]);

        // Instructor Login
        int[] instructorLog = {231123456, 123456789, 908789675,364709234, 789465897, 432645789, 243564234, 234756876, 678456375};
        System.out.println(instructorLog[0]);

        String[] Professor = {" Francois", "Edwards", "Conrad", "Latashia", "Johnathan", "Martha", "John", "Mark", "Frank "};
        Professor[0] = "Francois";
        System.out.println(Professor[0]);


        //Payroll information
        int[] Payroll = {33000, 45000, 34000, 89000, 34500, 23000, 56000, 45000, 67000};
        System.out.println(Payroll[0]);

        String[] PayrollA = {" Francois", "Edwards", "Conrad", "Latashia", "Johnathan", "Martha", "John", "Mark", "Frank "};
        PayrollA[0] = "Francois";
        System.out.println(PayrollA[0]);




    }
}
