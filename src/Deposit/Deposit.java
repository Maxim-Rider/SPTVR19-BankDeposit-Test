/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deposit;

import java.util.Scanner;

/**
 *
 * @author Comp
 */
/**
 * 
 */

 
public class Deposit {
 
    public double Persent(double persent) {
        double currentContribution = 1000;
        double finalContribution = 1100;

        boolean isOkValuePercent = persent > 0 && persent <= 25;
        if (!isOkValuePercent) {
            return 0;
        }
        int countMonths = 0;
        while (currentContribution < finalContribution) {
            currentContribution *= 1 + persent / 100;
            countMonths = ++countMonths;
        }
            return countMonths;
        }
    
    private static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
    double currentContribution = 1000;
    double finalContribution = 1100;
 
    System.out.print("Введите процент:");
    double persent = scanner.nextDouble();
 
    boolean isOkValuePercent = persent > 0 && persent <= 25;
    if (!isOkValuePercent) {
        return;
    }
 
    int countMonths = 0;
    while (currentContribution < finalContribution) {
        currentContribution *= 1 + persent / 100;
        System.out.println("Через " + ++countMonths + " месяц" + " - " + currentContribution);
    }
 
    System.out.println("Через " + countMonths + " месяц ваш взнос будет > " + finalContribution
                + " и составит = " + currentContribution);
    }
    
    
}
    

