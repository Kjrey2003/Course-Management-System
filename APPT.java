import java.util.*;
import java.io.*;

public class APPT {
}
class Java {
    public static void main(String[] args) throws Exception{
        APPT appt = new APPT();
        Scanner sc = new Scanner(System.in);
        appt.dataAdd();
        boolean flag = true;
        while(flag = true)
        {
            new ProcessBuilder("cmd", "/c", "cls"). inheritIO().start().waitFor();

            System.out.println(".......................................");
            System.out.println("\t\t | Welcome to the Teacher and Student Appointment Booking |");
            System.out.println(".......................................\n\n");
            System.out.println("\n1. Teacher \t 2. Student \t 3. Admin \t 4. Exit");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    appt.teacher();
                    flag = true;
                    break;
                    case 2;
                    appt.student();
                        flag = true;
                        break;
                        case 3;

                        appt.admin();
                        flag = true;
                        break;
                default:
                    System.exit(0);
            }

        }

    }
}
