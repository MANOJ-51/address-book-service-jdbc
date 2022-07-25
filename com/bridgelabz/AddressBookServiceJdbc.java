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
            //updating contact
            // statement.executeUpdate("update address_book set first_name = 'navdeep' where phone_number=91213107");
            //altering table adding start date
            //statement.executeUpdate("alter table address_book add start_date date;");
            //inserting date into column
            //statement.executeUpdate("update address_book set start_date ='2020-01-02' where type = 'friends' or type = 'family'");
            //retrieve data
            //ResultSet resultSet = statement.executeQuery("select * from address_book");
            //data range
            //ResultSet resultSet = statement.executeQuery("select * from address_book where start_date between cast('2020-01-01' as date) and date(now());");
            //count of data by state
            ResultSet resultSet = statement.executeQuery("select count(first_name) from address_book where state = 'andhra';");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString(1) + "|" + resultSet.getString(2) + "|" + resultSet.getString(3) + "|" +
//                        resultSet.getString(4) + "|" + resultSet.getString(5) + "|" + resultSet.getInt(6) + "|" + resultSet.getInt(7) +
//                        "|" + resultSet.getString(8) + "|" + resultSet.getString(9) + "|" + resultSet.getDate(10));
//            }
            //count by state
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }
            connection.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
