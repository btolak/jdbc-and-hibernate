package pl.sda.orange2.myOwnJDBC;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstConnect {
    public static void main(String[] args) {

        try {
            var h2connection = DriverManager.getConnection(H2Con.DB_URL, H2Con.USER, H2Con.PASSWORD);
            System.out.println("got connection " + (h2connection != null));
            Statement statement= h2connection.createStatement();
            final ResultSet resultSet= statement.executeQuery( "Select * from bookRepository");
            while(resultSet.next()){
                System.out.println("ID: "+resultSet.getInt(1));
                System.out.println("Title: "+resultSet.getString(2));
                System.out.println("Author: "+resultSet.getString(3));
                System.out.println("PublicationYear: "+resultSet.getInt(4));
            }
        } catch (SQLException e) {

            System.out.println("got exception" + e);
            e.printStackTrace();
        }
    }
}

