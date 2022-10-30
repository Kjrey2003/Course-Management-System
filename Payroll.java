import java.io.*;
public class Payroll  {
   private int hours;
   private String employee;
   private double payRate;
   private double finalPay;
   File myFile = new File("Payroll.txt");
   
    //method to write the payroll data into a file, not completed yet
   public void fileWrite(double pay) throws IOException{
     
   FileWriter payroll = new FileWriter(myFile, true);
    payroll.write(Double.toString(pay));
  // BufferedWriter outStream = new BufferedWriter(new FileWriter("encoded.txt", true));
    payroll.close();
   
}
   
//setters
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

    //getters
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
//does the calculation and adds the data to the file
public void grossPay() throws IOException{
  double hr = getHours();
    double rate = getPayRate();

    double gp  = hr * rate;

    fileWrite(gp);

        

    }


}


