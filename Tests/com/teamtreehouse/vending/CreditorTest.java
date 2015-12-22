package com.teamtreehouse.vending;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Steve on 21/12/2015.
 */
public class CreditorTest {

    @Test
    public void addingFundsIncrementsAvailableFunds() throws Exception {
        Creditor creditor = new Creditor();
        creditor.addFunds(25);
        creditor.addFunds(25);
        assertEquals(50, creditor.getAvailableFunds());
    }

    @Test
    public void refundingReturnsAllAvailableFunds(){
        Creditor creditor = new Creditor();
        creditor.addFunds(10);
        int refund = creditor.refund();
        assertEquals(10, refund);
        assertEquals(0, creditor.getAvailableFunds());
    }
}