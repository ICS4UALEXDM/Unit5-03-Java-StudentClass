import java.io.IOException;
import java.io.FileWriter;
class Student {
    // defining fields
    String _firstName;
    String _middleInitial = "";
    String _lastName;
    int _grade;
    boolean _iep;

    // Student object constructor for students with a middle initial
    public Student(String firstName, String middleInitial, String lastName, int grade, boolean iep) {
        this._firstName = firstName;
        this._middleInitial = middleInitial;
        this._lastName = lastName;
        this._grade = grade;
        this._iep = iep;
    }
    // this is the constructor for students without a middle initial
    public Student(String firstName, String lastName, int grade, boolean iep) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._grade = grade;
        this._iep = iep;
    }
    // This is the print method that returns a String that was built based off
    // the student that called it. Uses a ternary operator
    public String print() {
        if (this._middleInitial.isEmpty()) {
            return this._firstName + " "
                    + this._middleInitial + " " + this._lastName + " Grade: "
                    + Integer.toString(this._grade) + " IEP: " + Boolean.toString(this._iep);
        } else {
            return this._firstName + " " + this._lastName + " Grade: "
                    + Integer.toString(this._grade) + " IEP: " + Boolean.toString(this._iep);
        }
    }
    
    
}
