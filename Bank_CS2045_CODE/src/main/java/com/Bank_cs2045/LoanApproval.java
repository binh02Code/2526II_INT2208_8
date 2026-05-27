package com.Bank_cs2045;

/**
 * Hello world!
 *
 */
public class LoanApproval {

    public static String loanDecision(int age, double income,
                                      int creditScore, char employment) {

        // Kiểm tra age
        if (age < 18 || age > 65) {
            return "Invalid Input";
        }

        // Kiểm tra income
        if (income < 5.0 || income > 500.0) {
            return "Invalid Input";
        }

        // Kiểm tra credit score
        if (creditScore < 300 || creditScore > 850) {
            return "Invalid Input";
        }

        // Kiểm tra employment
        if (employment != 'C' && employment != 'F') {
            return "Invalid Input";
        }

        // Phân loại risk
        String risk;

        if (creditScore >= 300 && creditScore <= 500) {
            risk = "High";
        } else if (creditScore >= 501 && creditScore <= 700) {
            risk = "Medium";
        } else {
            risk = "Low";
        }

        // Rule 1
        if (risk.equals("High")) {
            return "REJECT";
        }

        // Rule 2 và Rule 3
        if (income < 15.0) {

            if (employment == 'F' || risk.equals("Medium")) {
                return "REJECT";
            }

            // Rule 4
            return "MANUAL REVIEW";
        }

        // Rule 5
        if (employment == 'F') {
            return "MANUAL REVIEW";
        }

        // Rule 6
        return "APPROVE";
    }
}