import java.io.*;
import java.util.*;
public class Payroll  {
   private int hours;
   private static String employee;
   private static double payRate;
   private double finalPay;
   File myFile = new File("Payroll.txt");
   
    //method to write the payroll data into a file, not completed yet
   public void fileWrite(String pay) throws IOException{
     
   FileWriter payroll = new FileWriter(myFile, true);
   payroll.write(pay);
   payroll.write("\n");
    

  // BufferedWriter outStream = new BufferedWriter(new FileWriter("encoded.txt", true));
    payroll.close();
   
}
   
//setters
   public void setEmployee(String employeeName){
        employee = employeeName;
    }
    


    public void setHours(int hoursWorked){

            hours = hoursWorked;
    }

    public void setPay(double pay){
        payRate = pay;
    }

    public void setFinalPay(double fp){
        finalPay = fp;
    }

    //getters
    public static String getEmployee(){
        return employee;
    }

    public int getHours(){
        return hours;
    }

    public static double getPayRate(){
        return payRate;
    }

    public double getFinalPay(){
        return finalPay;
    }

    


       

    //creates a payroll constructor 
public Payroll(String n, int i){
    employee = n;
    hours = 0;
}
 
//creates a no arg payroll constructor
public Payroll(){
    employee = "";
    hours = 0;

    
}
//does the calculation and adds the data to the file
public String grossPay(){
  double hr = getHours();
    double rate = getPayRate();

    double gp  = hr * rate;

    return Double.toString(gp);
    

        

    }

    public void grossPayFile()throws IOException{
        fileWrite(grossPay());
        
    }



    File anotherFile = new File("EmployeeManage.txt");    



    public void EmplyeeReader()throws IOException{
        

        BufferedReader bf = new BufferedReader(new FileReader("Employees.txt"));

        List<String> EmployeeName = new ArrayList<String>();
            String line = bf.readLine();

        while(line != null){
            EmployeeName.add(line);
                line = bf.readLine();
        }
        bf.close();

        String[] array = EmployeeName.toArray(new String[0]);

        for (String str : array){
            System.out.println(str);

        }
        }

        public void PayrollReader() throws IOException{
           BufferedReader bfreader = new BufferedReader(new FileReader("Payroll.txt"));

           List<String> EmployeeName = new ArrayList<String>();
           String line = bfreader.readLine();

       while(line != null){
           EmployeeName.add(line);
               line = bfreader.readLine();
       }
       bfreader.close();

      // String[] array = EmployeeName.toArray(new String[0]);

      // for (String str : array){
       // System.out.println(str);
       //}

        }


}


