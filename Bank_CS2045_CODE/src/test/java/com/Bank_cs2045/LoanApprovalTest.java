package com.Bank_cs2045;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanApprovalTest {

    // =========================
    // NHÓM INVALID INPUT
    // =========================

    @Test
    void TC_01() {
        assertEquals("Invalid Input",
                LoanApproval.loanDecision(17, 50.0, 700, 'C'));
    }

    @Test
    void TC_02() {
        assertEquals("Invalid Input",
                LoanApproval.loanDecision(66, 50.0, 700, 'C'));
    }

    @Test
    void TC_03() {
        assertEquals("Invalid Input",
                LoanApproval.loanDecision(30, 4.9, 700, 'C'));
    }

    @Test
    void TC_04() {
        assertEquals("Invalid Input",
                LoanApproval.loanDecision(30, 500.1, 700, 'C'));
    }

    @Test
    void TC_05() {
        assertEquals("Invalid Input",
                LoanApproval.loanDecision(30, 50.0, 299, 'C'));
    }

    @Test
    void TC_06() {
        assertEquals("Invalid Input",
                LoanApproval.loanDecision(30, 50.0, 851, 'C'));
    }

    @Test
    void TC_07() {
        assertEquals("Invalid Input",
                LoanApproval.loanDecision(30, 50.0, 700, 'X'));
    }

    // =========================
    // NHÓM LOGIC NGHIỆP VỤ
    // =========================

    @Test
    void TC_08() {
        assertEquals("REJECT",
                LoanApproval.loanDecision(30, 100.0, 450, 'C'));
    }

    @Test
    void TC_09() {
        assertEquals("REJECT",
                LoanApproval.loanDecision(30, 10.0, 750, 'F'));
    }

    @Test
    void TC_10() {
        assertEquals("REJECT",
                LoanApproval.loanDecision(30, 10.0, 600, 'C'));
    }

    @Test
    void TC_11() {
        assertEquals("MANUAL REVIEW",
                LoanApproval.loanDecision(30, 10.0, 750, 'C'));
    }

    @Test
    void TC_12() {
        assertEquals("APPROVE",
                LoanApproval.loanDecision(30, 20.0, 650, 'C'));
    }

    @Test
    void TC_13() {
        assertEquals("MANUAL REVIEW",
                LoanApproval.loanDecision(30, 20.0, 650, 'F'));
    }

    // =========================
    // NHÓM GIÁ TRỊ BIÊN
    // =========================

    @Test
    void TC_14() {
        assertEquals("APPROVE",
                LoanApproval.loanDecision(18, 15.0, 701, 'C'));
    }

    @Test
    void TC_15() {
        assertEquals("APPROVE",
                LoanApproval.loanDecision(65, 500.0, 850, 'C'));
    }
}