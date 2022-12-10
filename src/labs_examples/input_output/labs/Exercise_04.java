package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.BiFunction;

/**
 * Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 * package, create a new application that will parse a custom CSV file that you created and map each line of the
 * csv to a custom POJO that you create.
 * <p>
 * Then add that object to an arraylist. After you have mapped each row of the csv to objects
 * and added each object to an arraylist, print out each object using the objects custom toString() method.
 * <p>
 * Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 */

class ParseCSV {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student> students = new ArrayList<>();
        String csvPath = "src/labs_examples/input_output/files/students.csv";
        
        try(BufferedReader br = new BufferedReader(new FileReader(csvPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("line::" + line);
                String[] values = line.split(",");
                students.add(mapValuesToStudentObject(values));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Student student:students) {
            System.out.println(student.toString());
        }
    }

    private static Student mapValuesToStudentObject(String[] values) {
        Student student = new Student();
        student.setId(Integer.parseInt(values[0]));
        student.setFirstName(values[1]);
        student.setLastName(values[2]);
        student.setGpa(Double.parseDouble(values[3]));

        return student;
    }
}

class Student {
    private int id;
    private String firstName;
    private String lastName;
    private double gpa;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}