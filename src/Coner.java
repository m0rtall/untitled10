import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Vadim on 07.10.2019.
 */
public class Coner {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerConfigurationException, ClassNotFoundException, SQLException {

        String userName = "root";
        String password = "8093401";
        String connectionURL = "jdbc:mysql://localhost:3306/test?useSSL=false";
        try
                (Connection connection = DriverManager.getConnection(connectionURL, userName, password);
                 Statement statement = connection.createStatement()) {
            Class.forName("com.mysql.jdbc.Driver");

            statement.executeUpdate("DELETE FROM books where id=1");
            statement.executeUpdate("DELETE FROM books where id=2");
            statement.executeUpdate("DELETE FROM books where id=3");
            statement.executeUpdate("DELETE FROM books where id=4");
            statement.executeUpdate("insert INTO books VALUES (1,'Hunter') ");
            statement.executeUpdate("INSERT INTO books VALUES (2,'War Craft') ");
            statement.executeUpdate("INSERT INTO books VALUES (3,'War and peace') ");
            statement.executeUpdate("INSERT INTO books VALUES (4,'Rainbow') ");


            statement.executeUpdate("INSERT INTO stock VALUES (1,20)");
            statement.executeUpdate("INSERT INTO stock VALUES (2,26)");
            statement.executeUpdate("INSERT INTO stock VALUES (3,42)");
            statement.executeUpdate("INSERT INTO stock VALUES (4,5)");
            statement.executeUpdate("SELECT * FROM books LEFT JOIN stock ON books.id = stock.id)");


        }


    }
}

