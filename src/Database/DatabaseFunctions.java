package Database;

import java.util.UUID;

public class DatabaseFunctions {


    public static String enquote(String s){
        return "'"+s+"'";
    }

  public static String createUserAccount(String userName,String password){

        int id = (int)(Math.random()*10000)%10000;
        return "INSERT INTO person (PersonID,Name) VALUES ("+id+","+enquote(userName)+")";
    }

    public static String listItems(){
        return "SELECT * FROM item";
    }
}