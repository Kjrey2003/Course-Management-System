import javax.swing.*;

import java.io.*;
import java.text.*;

public class IDK {
    public static void main(String[] args) throws IOException {
        AddWork turtle = new AddWork();
        turtle.Frame();

         //Intro();
      // EmployeeInfo();

    }

    public static void Intro() {

        JFrame frame = new JFrame("Employee Management System");
        JTable j;

        String[] columnNames = { "Name", "Subject" };

        j = new JTable(Table(), columnNames);
        j.setBounds(30, 40, 500, 300);

        JButton b = new JButton("More Info");
        b.setBounds(50, 100, 95, 30);
        frame.add(b);
       
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        frame.add(sp);
        // Frame Size
        frame.setSize(500, 200);
        // Frame Visible = true
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setLayout(null);
        

    }

   
    public static String[][] Table() {

        String[][] Employees = {
                { "Dr Joe", "Computer Science" },
                { "Dr Jha", "Biology" },
                { "Dr Stewart", "English" } };

        return Employees;

    }

    public static void EmployeeInfo() {
        JFrame frame2 = new JFrame("Employee Information");
        JTable j2;
        Payroll pay = new Payroll();
        Payroll pay1 = new Payroll();
        Payroll pay2 = new Payroll();

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(600, 600);
        frame2.setVisible(true);
        frame2.setLayout(null);

        pay.setEmployee("Dr Joe");
        pay.setHours(45);
        pay.setPay(200.32);
       
        

        pay1.setEmployee("Dr Jha");
        pay1.setHours(54);
        pay1.setPay(250);
        String[][] Dr_Jha = {
                { "54" },
                { "250" },
                { pay1.grossPay() }

        };

        pay2.setEmployee("Dr Stewart");
        pay2.setHours(45);
        pay2.setPay(150);

        String[][] Dr_Stewart = {
                { "45" },
                { "150" },
                { pay2.grossPay() },
        };
        System.out.println(pay2.grossPay());


        String[][] Employee_Info = {
            {"Dr Joe", "Dr Jha", "Dr Stewart"},
            { "45", "54", "45" },
            { "200.32" , "250", "150" },
            {  pay.grossPay(), pay1.grossPay(), pay2.grossPay() } 
        };

        String[] columnNames = { "Hourly Pay", "Hours worked", "Gross Pay" };

        j2 = new JTable(Employee_Info, columnNames);
        j2.setBounds(30, 40, 500, 300);
        frame2.add(j2);

     
        JScrollPane sp = new JScrollPane(j2);
        frame2.add(sp);
        
        

    }
}
