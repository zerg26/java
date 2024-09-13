import java.util.*;

public class Student extends User{
    private String year; //Freshman, Sophomore, Junior, Senior
    private ArrayList<String> classList;


    public Student(String name, String birthday, int ID, String year){
        super(name, birthday, ID);
        this.year = year;
        this.classList = new ArrayList<String>();
    }

    //Overload the constructor for the class to accept a classList when creating a user
}
