package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.BaseModel;

public abstract class BaseDAO<T> extends BaseModel {

    public abstract T get(int id);

    public BaseDAO() {

    }
    
    protected void closeConnection(Connection conn,PreparedStatement pre,ResultSet rs){
         try{
                if(rs != null){
                    rs.close();
                }
                if(pre != null){
                    pre.close();
                }
                if(conn != null){
                    conn.close();
                }
            }
            catch(SQLException ex){
                
            }
    }

}
