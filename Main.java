import java.util.*;
public class Main{
    public static void main(String[] args) {
        ArrayList<User> schoolList = generateUsers();
        
        for(int i = 0; i < schoolList.size(); i++){
            System.out.println("User " + (i+1) + " : " + schoolList.get(i));
        }

    }

    public static ArrayList<User> generateUsers(){
        
        Student s1 = new Student("Will Russo", "11/28/2001", 87321, "Senior");
        Student s2 = new Student("Taoler Swiffer", "04/08/1989", 53722, "Super Duper Senior");
        Student s3 = new Student("Harrier Potman", "09/14/2004", 284332, "Freshman");
        
        ArrayList<String> s4List = new ArrayList<String>();
        s4List.add("Advanced Mechanical Enginerring");
        s4List.add("How to burn money");
        s4List.add("Emotions 101");
        
        Student s4 = new Student("Tonio Steak", "04/08/2003", 53722, "Freshman", s4List);


        ArrayList<User> t1List = new ArrayList<User>();
        t1List.add(s2);
        t1List.add(s3);
        t1List.add(s4);

        Teacher t1 = new Teacher("Dr Adam Whaley", "09/04/1993", 37821, "Assistant Teaching Professor", t1List);

        ArrayList<User> t2List = new ArrayList<User>();
        t2List.add(s1);

        Teacher t2 = new Teacher("Dr Naddia Najjar", "02/18/1990", 783824, "Assistant Teaching Professor & Director of the ICC", t2List);
        
        Teacher t3 = new Teacher("Dr Anne-Kathrin Kronberg  ", "10/13/1991", 8326492, "Assistant Professor");
        
        ArrayList<User> schoolList = new ArrayList<>();

        schoolList.add(s1);
        schoolList.add(s2);
        schoolList.add(s3);
        schoolList.add(s4);
        schoolList.add(t1);
        schoolList.add(t2);
        schoolList.add(t3);

        return schoolList;
    }
}