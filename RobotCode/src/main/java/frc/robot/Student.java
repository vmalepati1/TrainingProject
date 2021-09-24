package frc.robot;

public class Student {

    private String firstName;
    private String lastName;
    private int id;

    public Student(String f, String l, int id){
        this.firstName = f;
        this.lastName = l;
        this.id = id;
    }
    public String getName(){
        return firstName + "" + lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getId(){
        return id;
    }

}
