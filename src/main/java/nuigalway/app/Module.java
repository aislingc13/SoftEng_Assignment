package nuigalway.app;
import java.util.ArrayList;

import java.util.ArrayList;

public class Module {

    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Programme> programCourses = new ArrayList<Programme>();

    public Module(String name) {

        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Programme> getCourses() {
        return this.programCourses;
    }
    public void setCourses(ArrayList<Programme> programCourses) {
        this.programCourses = programCourses;
    }

}
