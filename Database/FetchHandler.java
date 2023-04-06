package Database;

import java.sql.*;

Class FetchHandler{

    Connection frontEndConn;

    frontEndConn = application layer api connection
    statement = frontEndConn.createStatement();
    ResultSet results = statement.execute(Relevant Query);

    //get method, return results of query
    public ResultSet Get(){

        return results; 
    }

    //post method, return true or false if successful or not
    public boolean Post(){

        if(results succsesful){
            return true;
        }
        else{
            return false;
        }
    }

    //put method, return true or false if successful or not
    public boolean Put(){

        if(results succsesful){
            return true;
        }
        else{
            return false;
        }
    }

    //delete method, return true or false if successful or not
    public boolean Delete(){

        if (results succseful){
            return true;
        }
        else{
            return false;
        }
    }


}