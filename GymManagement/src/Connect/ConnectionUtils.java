/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import java.sql.*;

/**
 *
 * @author Hindu
 */
public class ConnectionUtils {

    public static Connection getOracleConnection() throws SQLException, ClassNotFoundException {
        return ConnectionOracle.getDBConnection();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("Đang kết nối ...");

        Connection conn = ConnectionUtils.getOracleConnection();

        System.out.println("Kết nối đến " + conn);

        System.out.println("Kết nối thành công");
    }
}
