package me.seakeer.sharing.design.pattern.a00creational.a03abstractfactory.jdk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * AbstractFactoryPatternJdk;
 *
 * @author Seakeer;
 * @date 2020-12-01;
 * @see java.sql.Statement                   --> IProduct        1_A   抽象产品;
 * @see java.sql.Struct                      --> IProduct        1_B   抽象产品;
 * @see com.mysql.cj.jdbc.StatementImpl      --> ConcreteProduct 2_A_1 具体产品;
 * @see ...                                  --> ConcreteProduct 2_A_2 具体产品;
 * @see javax.sql.rowset.serial.SerialStruct --> ConcreteProduct 2_B_1 具体产品;
 * @see ...                                  --> ConcreteProduct 2_B_2 具体产品;
 * @see java.sql.Connection                  --> IFactory        3     抽象工厂;
 * @see com.mysql.cj.jdbc.ConnectionImpl     --> ConcreteFactory 4_A   具体工厂;
 * @see ...                                  --> ConcreteFactory 4_B   具体工厂;
 */
public class AbstractFactoryPatternJdk {

    public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String MYSQL_URL = "jdbc:mysql://localhost:3306/seakeer_user";
    public static final String MYSQL_USERNAME = "root";
    public static final String MYSQL_PWD = "root";
    public static final String SQL = "SELECT user_name from t_user WHERE user_id = 99";

    public static void main(String[] args) {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PWD)) {
            Statement statement = connection.createStatement();
            statement.execute(SQL);
            //connection.createStruct();
        } catch (SQLException e) {
            System.out.println("Problem getting connection" + e);
        }
    }
}
