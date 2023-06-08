/**
 * This program contains the student,
 * class. Referenced from video.
 *
 * @author  Sarah Andrew
 * @version 1.0
 *
 * @since 2023-02-05.
 */

public class student {
    // Creating fields.
    String _firstName;
    String _lastName;
    String _midInt;
    int _grade;
    boolean _iep = false;
  
    // Create constructors.
    public void Student(String firstName, String lastName, 
            String midInt, int grade, boolean IEP) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._midInt = midInt;
        this._grade = grade;
        this._iep = IEP;
    }

    // Create another constructors. 
    public void studNoMid(String firstName, String lastName,
            int grade, boolean IEP) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._grade = grade;
        this._iep = IEP;
    }
    
    // Method for printing student name.
    public void print() {
        // Declare variable.
        String name = _firstName + " ";
        String userIEP;
        
        // If student does not has mid int.
        if (!_midInt.isEmpty()) {
            name = name + _midInt + " ";
        }

        // If statement if student has IEP.
        if (_iep) {
            userIEP = "has iep";
        } else {
            userIEP = "does not have iep";
        }

        // Display name finalized.
        System.out.println(name + " is in grade " + _grade
            + " and " + userIEP + ".");
    }
}
