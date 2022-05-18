/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Hindu
 */
public class StaffDAO {

    ArrayList<Staff> ls = new ArrayList<>();

    public int addStaff(Staff s) {
        ls.add(s);
        return 1;
    }

    public ArrayList<Staff> getAllStaffs() {
        return ls;
    }

    public int delStaff(String ID) {
        for (Staff s : ls) {
            if (s.getId().equalsIgnoreCase(ID)) {
                ls.remove(s);
                return 1;
            }
        }
        return -1;
    }

    public Staff getStaffByID(String ID) {
        for (Staff s : ls) {
            if (s.getId().equalsIgnoreCase(ID)) {
                return s;
            }
        }
        return null;
    }

    public int updateStaffByID(Staff sNew) {
        for (Staff s : ls) {
            if (s.getId().equalsIgnoreCase(sNew.getId())) {
                s.setName(sNew.getName());
                s.setBirthday(sNew.getBirthday());
                s.setGender(sNew.getGender());
                s.setAddress(sNew.getAddress());
                s.setSalary(sNew.getSalary());
                s.setTelephone(sNew.getTelephone());
                s.setRole(sNew.getRole());
                return 1;
            }
        }
        return -1;
    }

}
