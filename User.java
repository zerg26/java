import java.util.*;

public abstract class User implements DateConversion{
    private String name;
    private Date birthday;
    private int ID;

    public User(String name, String birthday, int ID){
        this.name = name;
        this.birthday = this.convertDate(birthday);
        this.ID = ID;
    }

public String getName() {
    return name;
}
public void setName(String name) {
    this.name=name;
}
public Date getBirthday() {
    return birthday;
}
public void setBirthday(String birthday) {
    this.birthday = this.convertDate(birthday);
}

public Date convertDate(String date) {
    int month = Integer.parseInt(date.substring(0,2));
    int day = Integer.parseInt(date.substring(3,5));
    int year = Integer.parseInt(date.substring(6,9));
    Date d = new Date(month, day, year);
    return d;

}

}
