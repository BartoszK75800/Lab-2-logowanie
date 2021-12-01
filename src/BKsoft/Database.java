package BKsoft;

import jdk.internal.jimage.ImageReaderFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Database {
    private Map DB = new HashMap();

    public void loadDB() throws FileNotFoundException {
        Scanner loginScanner = new Scanner(new File("databaseLogin.txt"));
        Scanner passwordScanner = new Scanner(new File("databasePassword.txt"));
        String liniaL, liniaP;

        while(loginScanner.hasNextLine()){
            liniaL = loginScanner.nextLine();
            liniaP = passwordScanner.nextLine();

            DB.put(liniaL, liniaP);
        }
    }

    public boolean check(String login, String password){
        if(DB.containsKey(login)==false) return false;
        if(DB.get(login).equals(password)) return true;
        else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Database database = (Database) o;

        return DB.equals(database.DB);
    }

    @Override
    public int hashCode() {
        return DB.hashCode();
    }
}
