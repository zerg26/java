import java.util.*;

public class Teacher extends User{
    private String jobTitle;
    private ArrayList<User> advisees;

    public Teacher(String name, String birthday, int ID, String jobTitle, ArrayList<User> advisees){
        super(name, birthday, ID);
        this.jobTitle = jobTitle;
        this.advisees = advisees;
    }



}
