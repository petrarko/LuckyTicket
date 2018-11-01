package com.griddyanamics.tickets;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class TicketTest {

    @Test
    @Parameters({
            "000000",
            "123321"})
    public void isLucky(String ticket) {
        assertTrue(Ticket.isLucky(ticket));

    }


    @Test
    @Parameters({
            "000100",
            "223321"})
    public void isNotLucky(String ticket) {
        assertFalse(Ticket.isLucky(ticket));

    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters({
            "wdqwdkjqkwd",
            "123"})
    public void isLuckyNegative(String ticket) {
        Ticket.isLucky(ticket);

    }


    @Test(expected = IllegalArgumentException.class)
    public void isLuckyNull() {
        Ticket.isLucky(null);

    }

}