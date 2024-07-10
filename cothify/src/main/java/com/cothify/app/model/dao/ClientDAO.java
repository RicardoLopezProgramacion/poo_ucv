package com.cothify.app.model.dao;

import com.cothify.app.model.db.Database;
import com.cothify.app.model.entity.Client;
import com.cothify.app.model.entity.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

public class ClientDAO implements PersonDAO<Client> {

    @Override
    public void insert(Client c) {
        String sql = "INSERT INTO cliente (username, password) VALUES (?, ?)";

        try (Connection conn = Database.getInstance().getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, c.getUsername());
            pstmt.setString(2, c.getPassword());

            pstmt.executeUpdate();
            System.out.println("Cliente insertado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Client t) {
    }

    @Override
    public void select(Client t) {
        /* String sql = "SELECT username, password FROM cliente";

        try (Connection conn = Database.getInstance().getConnection(); 
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
                ) {
            
            while (rs.next()) {
            
            }

            pstmt.executeUpdate();
            System.out.println("Cliente insertado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    @Override
    public void update(Client c) {
        System.out.println("EN update!");
        String sql = "UPDATE cliente SET name = ?, lastname = ?, birthday = ?, username = ?, password = ? WHERE name = ? AND lastname = ?";

        try (Connection conn = Database.getInstance().getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
             
            ps.setString(1, c.getName());
            ps.setString(2, c.getLastname());
            ps.setDate(3, java.sql.Date.valueOf(c.getBirthday())); 
            ps.setString(4, c.getUsername());
            ps.setString(5, c.getPassword());
            ps.setString(6, c.getName());
            ps.setString(7, c.getLastname());

            ps.executeUpdate();
            System.out.println("Cliente actualizado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
