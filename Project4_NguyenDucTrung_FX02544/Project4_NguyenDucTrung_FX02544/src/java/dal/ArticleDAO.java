package dal;

import db.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Article;

public class ArticleDAO extends BaseDAO<Article> {

    public Article get(int id, String username) {
        String query = "SELECT * FROM dbo.Article a\n"
                + "WHERE a.username = ?\n"
                + "AND a.ID = ?";
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            conn = SQLConnection.getConnection();
            pre = conn.prepareCall(query);
            pre.setInt(2, id);
            pre.setString(1, username);
            rs = pre.executeQuery();
            while (rs.next()) {
                int pid = rs.getInt(1);
                String title = rs.getString(2);
                String content = rs.getString(3);
                Timestamp time = rs.getTimestamp(4);
                String usr = rs.getString(5);
                return new Article(id, title, content, time);
            }
        } catch (SQLException ex) {

        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (pre != null) {
                try {
                    pre.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    public List<Article> getAllArticles() {
        String query = "SELECT a.id,a.Title,a.Content,a.[Time],a.username\n"
                + "FROM dbo.Article a";
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        List<Article> articles = new LinkedList<>();
        try {
            conn = SQLConnection.getConnection();
            pre = conn.prepareCall(query);
            rs = pre.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                String content = rs.getString(3);
                Timestamp time = rs.getTimestamp(4);
                String usr = rs.getString(5);
                Article a = new Article(id, title, content, time);
                a.setAuthor(usr);
                articles.add(a);
            }
        } catch (SQLException ex) {

        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (pre != null) {
                try {
                    pre.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return articles;
    }

    public List<Article> getArticles(String username) {
        String query = "SELECT * FROM dbo.Article a\n"
                + "WHERE a.username = ?";
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        List<Article> articles = new LinkedList<>();
        try {
            conn = SQLConnection.getConnection();
            pre = conn.prepareCall(query);
            pre.setString(1, username);
            rs = pre.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String title = rs.getString(2);
                String content = rs.getString(3);
                Timestamp time = rs.getTimestamp(4);
                String usr = rs.getString(5);
                articles.add(new Article(id, title, content, time));
            }
        } catch (SQLException ex) {

        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (pre != null) {
                try {
                    pre.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return articles;
    }

    public void Update(String title, String content, String article, Integer id) {
        Connection conn = null;
        PreparedStatement pre = null;
        String query = "UPDATE dbo.Article\n"
                + "SET \n"
                + "Title = ?,\n"
                + "Content = ?\n"
                + "WHERE username = ?\n"
                + "AND ID = ?";
        try {
            conn = SQLConnection.getConnection();
            pre = conn.prepareCall(query);
            pre.setString(1, title);
            pre.setString(2, content);
            pre.setString(3, article);
            pre.setInt(4, id);
            pre.executeUpdate();
        } catch (SQLException ex) {

        } finally {
            if (pre != null) {
                try {
                    pre.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void AddNewArticle(String title, String content, String article) {
        Connection conn = null;
        PreparedStatement pre = null;
        String query = "INSERT INTO dbo.Article\n"
                + "VALUES (?,?,GETDATE(),?);";
        try {
            conn = SQLConnection.getConnection();
            pre = conn.prepareCall(query);
            pre.setString(1, title);
            pre.setString(2, content);
            pre.setString(3, article);
            pre.executeUpdate();
        } catch (SQLException ex) {

        } finally {
            if (pre != null) {
                try {
                    pre.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public Article get(int id) {
         String query = "SELECT * FROM dbo.Article a\n"
                + "WHERE a.ID = ?";
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            conn = SQLConnection.getConnection();
            pre = conn.prepareCall(query);
            pre.setInt(1, id);
            rs = pre.executeQuery();
            while (rs.next()) {
                int pid = rs.getInt(1);
                String title = rs.getString(2);
                String content = rs.getString(3);
                Timestamp time = rs.getTimestamp(4);
                String usr = rs.getString(5);
                Article a = new Article(id, title, content, time);
                a.setAuthor(usr);
                return a;
            }
        } catch (SQLException ex) {

        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (pre != null) {
                try {
                    pre.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

}
