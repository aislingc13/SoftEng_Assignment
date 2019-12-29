package nuigalway.app;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private LocalDate DOB;
    private int ID;
    private String username;
    private ArrayList<Programme> programCourses = new ArrayList<Programme>();
    private ArrayList<Module> modules = new ArrayList<Module>();

    public Student(String name, int age, LocalDate DOB, int ID) {

        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
    }

    public String getUsername() {
        this.username = name + age;
        return username;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDOB() {
        return this.DOB;
    }
    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public int getID() {
        return this.ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Programme> getCourses() {
        return this.programCourses;
    }
    public void setCourses(ArrayList<Programme> courses) {
        this.programCourses = courses;
    }

    public ArrayList<Module> getModules() {
        return this.modules;
    }
    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

}
