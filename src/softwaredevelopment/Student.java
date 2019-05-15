/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwaredevelopment;

/**
 *
 * @author kartik gill
 */
public class Student {
    private String name;
    private int studentId;
    

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Student(String n) {
        this.name=n;
    }

    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}
