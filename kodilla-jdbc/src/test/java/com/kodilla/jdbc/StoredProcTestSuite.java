package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {

    @Test
    void testUpdateBestsellers() throws SQLException {

        int howMany = 0;

        DbManager dbManager = DbManager.getInstance();

        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER = false";

        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER = true";

        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateBestsellers()";

        statement2.execute(sqlProcedureCall);
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(2, howMany);
        rs.close();

        statement.close();
        statement2.close();
    }
}
