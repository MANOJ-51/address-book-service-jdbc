package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AddressBookServiceJdbc {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Service Jdbc");

        try {
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/address_book_service", "root", "Manoj@451");
            System.out.println("connection successful");
            connection.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
