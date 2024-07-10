package com.cothify.app.model.panel;

import com.cothify.app.model.panel.AccountInterface;
import com.cothify.app.model.db.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class Login implements AccountInterface {

    private PreparedStatement ps;
    private ResultSet rs;

    public Login() {
    }

    @Override
    public boolean login(String username, String password) {
        try(Connection conn = Database.getInstance().getConnection() ) {
            ps = conn.prepareStatement("SELECT username, password FROM cliente");
            rs = ps.executeQuery();
            
            while (rs.next()) {
                if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                    return true;
                }
            }

        } catch (SQLException e) {
            System.out.println("HUBO ERROR");
        }

        return false;
    }

    @Override
    public void register() {
    }

}
