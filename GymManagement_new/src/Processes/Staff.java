/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Processes;

import ConnectDB.ConnectionUtils;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hindu
 */
public class Staff {
    public int addStaff(String tenNV, String ngSinh,
            String ngDK, String GT, String diaChi, String SDT, String matKhau, 
            String tienLuong, String viTri)
            throws ClassNotFoundException, SQLException {

        int i = 0;

        Connection conn = ConnectionUtils.getOracleConnection();

        String sql_insert_staff = "INSERT INTO STAFF (staff_id, staff_name, "
                + "staff_birthday, staff_datejoin, staff_gender, staff_address, "
                + "staff_telephone, staff_password, staff_salary, staff_type) VALUES ("
                + "STAFF_SEQ.nextval, '" + tenNV + "', '" + ngSinh + "', '" + ngDK 
                + "', '" + GT + "', '" + diaChi + "', '" + SDT + "', '" + matKhau 
                + "', '" + tienLuong + "', '" + viTri + "')";

        Statement stat = conn.createStatement();
        i = stat.executeUpdate(sql_insert_staff);

        return i;
    }
    
    public int updateStaff(String tenNV, String ngSinh,
            String ngVL, String GT, String diaChi, String SDT, String tienLuong, String viTri)
            throws ClassNotFoundException, SQLException {

        int i = 0;

        Connection conn = ConnectionUtils.getOracleConnection();

        String sql_update_staff = "UPDATE STAFF SET staff_name = '" + tenNV
                + "', staff_birthday = '" + ngSinh + "', staff_datejoin'" + ngVL 
                + "', staff_gender = '" + GT + "', staff_address = '" + diaChi 
                + "', staff_telephone = '" + SDT + "', staff_salary = '" + tienLuong 
                + "', staff_type = '" + viTri + "')";

        Statement stat = conn.createStatement();
        i = stat.executeUpdate(sql_update_staff);

        return i;
    }
    
    public int deleteStaff(String tenNV, String SDT)
            throws SQLException, ClassNotFoundException {

        int i = 0;

        Connection conn = ConnectionUtils.getOracleConnection();

        String sql_delete_customer = "DELETE FROM STAFF WHERE staff_name = '" + tenNV
                + "' AND staff_telephone = '" + SDT + "')";

        Statement stat = conn.createStatement();
        i = stat.executeUpdate(sql_delete_customer);

        return i;
    }
}
