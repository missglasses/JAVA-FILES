//APRIL 20 2021
public class Main {
    public static void main(String[] args) {
        
        String Emp_name = "Kim Chui";     
        int Emp_number = 14344;          
        String Emp_status = "Regular";
        String Dept = "Accounting";
        int Day_worked = 22;
        double Daily_rate = 300.18;       
        double GP;                       
        double Less_tax = 270.00;
        double SSS = 120.00;
        double CA = 450.00;
        double Net_pay;                   
        
    
        GP = Day_worked * Daily_rate;    
        Net_pay = GP - (Less_tax + SSS + CA); 
        
        
        System.out.println("Employee name: " + Emp_name);
        System.out.println("Employee no.: " + Emp_number);
        System.out.println("Employee status: " + Emp_status);
        System.out.println("Department: " + Dept);
        System.out.println("Day worked: " + Day_worked);
        System.out.println("Daily rate: " + Daily_rate);
        System.out.println("Gross pay: " + GP);
        System.out.println("Less tax: " + Less_tax);
        System.out.println("SSS: " + SSS);
        System.out.println("CA: " + CA);
        System.out.println("Net pay: " + Net_pay);
    }
}
