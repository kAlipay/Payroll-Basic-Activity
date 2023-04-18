/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payrollbasicactivity;

/**
 *
 * @author 63955
 */
public class Payrollbasicactivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Clyde Richard Abelanio";
        double grosspay = 25000.00;
        // for Tax
        double holdingtax = 0.15;
        double totaltax = holdingtax * grosspay;
        // for sss
        double ssscontribution = 0.0363;
        double totalssscontribution = ssscontribution * grosspay;
        // for medicare
        double medicarecontribution = 0.0125;
        double totalmedicarecontribution = medicarecontribution * grosspay;
                
        double pagibigcontribution = 100;
        //over all total
        double overalltotal = grosspay - pagibigcontribution - totalmedicarecontribution - totalssscontribution - totaltax;
        
        System.out.println(" Employee Name:         " + name);
        System.out.println(" Gross Pay    :         " + grosspay);
        System.out.println("***********************************");
        System.out.println("Deduction                   Amount");
        System.out.println("Holding Tax               " + totaltax);
        System.out.println("SSS Contribution          " + totalssscontribution);
        System.out.println("Medicare                  " + totalmedicarecontribution);
        System.out.println("Pag ibig Contribution     " + pagibigcontribution); 
        System.out.println("***********************************");
        System.out.println("Net Pay                   " + overalltotal); 
        
    }
    
}
