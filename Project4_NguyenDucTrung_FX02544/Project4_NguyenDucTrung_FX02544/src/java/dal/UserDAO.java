package dal;

import db.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

public class UserDAO extends BaseDAO<User> {

    @Override
    public User get(int id) {
        return null;
    }

    public Boolean register(String username, String password, int role) {
        String query = "INSERT INTO dbo.Users\n"
                + "VALUES (?,?,?)";
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            conn = SQLConnection.getConnection();
            pre = conn.prepareCall(query);
            pre.setString(1, username);
            pre.setString(2, password);
            pre.setInt(3, role);
            return pre.executeUpdate() > 0;
        } catch (SQLException ex) {

        } finally {
            closeConnection(conn, pre, rs);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new UserDAO().isExist("a"));
    }

    public Boolean isExist(String username) {
        String query = "SELECT * FROM dbo.Users u\n"
                + "WHERE u.username = ?";
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        Boolean check = false;
        try {
            conn = SQLConnection.getConnection();
            pre = conn.prepareCall(query);
            pre.setString(1, username);
            rs = pre.executeQuery();
            if (rs.next()) {
                check = true;
            }
        } catch (SQLException ex) {

        } finally {
            closeConnection(conn, pre, rs);
        }
        return check;
    }

    public User login(String username, String password) {
        String query = "SELECT * FROM dbo.Users u\n"
                + "WHERE u.username = ? and u.password = ?";
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        User u = null;
        try {
            conn = SQLConnection.getConnection();
            pre = conn.prepareCall(query);
            pre.setString(1, username);
            pre.setString(2, password);
            rs = pre.executeQuery();
            if (rs.next()) {
                String usr = rs.getString(1);
                String psw = rs.getString(2);
                int role = rs.getInt(3);
                u = new User(usr, psw,role);
            }
        } catch (SQLException ex) {

        } finally {
            closeConnection(conn, pre, rs);
        }
        return u;
    }

}
