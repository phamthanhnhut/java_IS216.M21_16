/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Processes;

import ConnectDB.ConnectionUtils;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Hindu
 */
public class Customer {

    public int addCustomer(String tenKH, String ngSinh,
            String GT, String ngDK, String diaChi, String SDT)
            throws ClassNotFoundException, SQLException {

        int i = 0;

        Connection conn = ConnectionUtils.getOracleConnection();

        String sql_insert_customer = "INSERT INTO CUSTOMER (cus_id, cus_name, "
                + "cus_birthday, cus_gender, cus_datejoin, "
                + "cus_address, cus_telephone)" + "VALUES ("
                + "CUSTOMER_SEQ.nextval, '" + tenKH + "', '" + ngSinh + "', '" + GT + "', '" + ngDK + "', '"
                + diaChi + "', '" + SDT + "')";

        Statement stat = conn.createStatement();
        i = stat.executeUpdate(sql_insert_customer);

        return i;
    }

    public int updateCustomer(String tenKH, String ngSinh,
            String GT, String ngDK, String diaChi, String SDT)
            throws ClassNotFoundException, SQLException {

        int i = 0;

        Connection conn = ConnectionUtils.getOracleConnection();

        String sql_update_customer = "UPDATE CUSTOMER SET cus_name = '" + tenKH
                + "', cus_birthday = '" + ngSinh + "', cus_gender = '" + GT + "', '"
                + ngDK + "', '" + diaChi + "', '" + SDT + "')";

        Statement stat = conn.createStatement();
        i = stat.executeUpdate(sql_update_customer);

        return i;
    }

    public int deleteCustomer(String tenKH, String SDT)
            throws SQLException, ClassNotFoundException {

        int i = 0;

        Connection conn = ConnectionUtils.getOracleConnection();

        String sql_delete_customer = "DELETE FROM CUSTOMER WHERE cus_name = '" + tenKH
                + "' AND cus_telephone = '" + SDT + "')";

        Statement stat = conn.createStatement();
        i = stat.executeUpdate(sql_delete_customer);

        return i;
    }

}
