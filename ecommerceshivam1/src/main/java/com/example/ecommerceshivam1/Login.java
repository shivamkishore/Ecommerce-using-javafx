package com.example.ecommerceshivam1;

import java.sql.ResultSet;

public class Login {

    public Customer customerLogin(String userName, String password){
        String loginQuery = "SELECT * FROM customer WHERE email ='"+userName+"' AND password = '"+password+"' ";
        Dbconnection conn = new Dbconnection();
        ResultSet rs = conn.getQueryTable(loginQuery);
        try {
            if (rs.next()) {
                return new Customer(rs.getInt("id"), rs.getString("name"),
                        rs.getString("email"),rs.getString("mobile"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }

    public static void main(String[] args) {
        Login login = new Login();
        Customer customer = login.customerLogin("shivam47@gmail.com","shivampassword");
        System.out.println("welcome "+customer.getName());
    }
}
