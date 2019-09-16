package mysql.code;

import com.mysql.cj.jdbc.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySql {

    public static void main(String... args) {

        //注册驱动
        try {
            Driver driver = new Driver(); //注意Driver的是cj的包名
            DriverManager.registerDriver(driver);
            //DriverManager.getConnection()

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
