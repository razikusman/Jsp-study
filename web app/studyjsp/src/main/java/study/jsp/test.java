/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study.jsp;

/**
 *
 * @author UsmanSPC
 */
public class test {

    private int test_id;
    private int student_id;
    private String student_name;
    private int test_marks;
    
    public test(int test_id, int student_id, String student_name, int test_marks) {
        this.test_id = test_id;
        this.student_id = student_id;
        this.student_name = student_name;
        this.test_marks = test_marks;
    }
    

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getTest_marks() {
        return test_marks;
    }

    public void setTest_marks(int test_marks) {
        this.test_marks = test_marks;
    }

    

    
    
    
}
