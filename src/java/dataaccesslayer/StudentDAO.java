/* Student Name:Lei Zhao, Yu Song, Zhicheng He
 * Student Number:041086365, 041086226, 040873597
 * Course & Section #: 23F_CST8288_023
 * Declaration: This is our own original work and is free from Plagiarism.
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dataaccesslayer;

import java.util.List;
import transferobject.Student;

/**
 * Interface for accessing and manipulating Student data.
 */
public interface StudentDAO {
    
    /**
     * Retrieves the ID of a student from the database.
     *
     * @param student The Student object whose ID is to be retrieved.
     * @return The ID of the student.
     */
    int getStudentID(Student student);
    
    /**
     * Retrieves a list of all students from the database.
     *
     * @return A list of Student objects.
     */
    List<Student> getAllStudents();
}
