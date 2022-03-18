package main.java.repositories;

// MODELS
import main.java.models.Clients;

// SQL
import java.sql.ResultSet;
import java.sql.SQLException;

// DATABASE
import main.java.DBUtil;

import java.util.ArrayList;

public final class ClientRepository {
    public static ArrayList<Clients> getAll() {
        ArrayList<Clients> data = new ArrayList<>();
        try {
            ResultSet rs = DBUtil.getConnection()
                                .createStatement()
                                .executeQuery("SELECT * FROM CLIENTE");

            while (rs.next()) {
                data.add(new Clients(
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)
                ));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }
}
