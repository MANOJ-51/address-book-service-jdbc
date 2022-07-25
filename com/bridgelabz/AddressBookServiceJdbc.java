package com.bridgelabz;

import java.sql.*;

public class AddressBookServiceJdbc {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Service Jdbc");

        try {
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/address_book_service", "root", "Manoj@451");
            System.out.println("connection successful");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from address_book");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + "|" + resultSet.getString(2) + "|" + resultSet.getString(3) + "|" +
                        resultSet.getString(4) + "|" + resultSet.getString(5) + "|" + resultSet.getInt(6) + "|" + resultSet.getInt(7) +
                        "|" + resultSet.getString(8) + "|" + resultSet.getString(9));
            }
            connection.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
