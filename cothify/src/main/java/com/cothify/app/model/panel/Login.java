package com.cothify.app.model.panel;

import com.cothify.app.model.panel.AccountInterface;
import com.cothify.app.model.db.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login implements AccountInterface {

    private Database instance = Database.getInstance();
    private PreparedStatement ps;
    private ResultSet rs;

    public Login() {
    }

    @Override
    public boolean login(String username, String password) {

        /*try {
            ps = instance.getConnection().prepareStatement("SELECT username, password FROM Login");

            while (rs.next()) {
                if (username.equals(rs.getString("user")) && password.equals(rs.getString("password"))) {
                    return true;
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }*/

        return true;
    }

    @Override
    public void register() {
    }

}
