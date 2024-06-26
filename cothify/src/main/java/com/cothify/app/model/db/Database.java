package com.cothify.app.model.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    // atributos privados
    private Connection conn = null;
    private static Database instance = null;

    private Database() {
    }

    public Connection getConnection() {
        try {
            conn = DriverManager.getConnection("", "", "");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            disconnection();
        }
        return conn;
    }

    public void disconnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
            }
        }
    }

    public static Database getInstance() {
        return instance = instance == null ? new Database() : instance;
    }

}
