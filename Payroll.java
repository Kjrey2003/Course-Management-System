import java.text.*;
import java.io.*;
import java.io.IOException;
public class Payroll  {
   private int hours;
   private String employee;
   private double payRate;
   private double finalPay;
   File myFile = new File("Payroll.txt");
   
    
   public void fileWrite(double pay) throws IOException{
     
   FileWriter payroll = new FileWriter(myFile, true);
    payroll.write(Double.toString(pay));
   BufferedWriter outStream = new BufferedWriter(new FileWriter("encoded.txt", true));
    payroll.close();
   
   


   }
   

   


   public void setemployee(String employeeName){
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

    public String getEmployee(){
        return employee;
    }

    public int getHours(){
        return hours;
    }

    public double getPayRate(){
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

public void grossPay() throws IOException{
    DecimalFormat df = new DecimalFormat("0.00");

    double hr = getHours();
    double rate = getPayRate();

    double gp  = hr * rate;

    fileWrite(gp);

        

    }


}


