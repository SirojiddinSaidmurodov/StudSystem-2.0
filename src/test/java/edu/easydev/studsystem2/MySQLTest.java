package edu.easydev.studsystem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySQLTest {
    @Test
    public void testConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            System.out.println(ex.toString());
            fail("MySQL driver is not connected");
        }
    }
}