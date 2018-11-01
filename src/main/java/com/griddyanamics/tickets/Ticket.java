package com.griddyanamics.tickets;

import com.google.common.primitives.Ints;

public class Ticket {
    public static boolean isLucky(String ticket) {
        if (ticket == null || Ints.tryParse(ticket) == null || Ints.tryParse(ticket) < 0 || ticket.length() != 6) {
            throw new IllegalArgumentException("Illegal ticket: " + ticket);
        }
        return sumString(ticket.substring(3)) == sumString(ticket.substring(0, 3));
    }

    private static int sumString(String s) {
        return s.chars().map(a -> Character.getNumericValue(a)).sum();
    }

}
