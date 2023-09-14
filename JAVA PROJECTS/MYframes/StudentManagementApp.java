package MYframes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}

public class StudentManagementApp {
    private StudentManagementSystem sms;
    private JFrame frame;
    private DefaultListModel<String> studentListModel;
    private JList<String> studentList;
    private JTextArea studentDetails;

    public StudentManagementApp() {
        sms = new StudentManagementSystem();

        frame = new JFrame("Student Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        studentListModel = new DefaultListModel<>();
        studentList = new JList<>(studentListModel);
        frame.add(new JScrollPane(studentList), BorderLayout.WEST);

        studentDetails = new JTextArea();
        studentDetails.setEditable(false);
        frame.add(new JScrollPane(studentDetails), BorderLayout.CENTER);

        JButton addButton = new JButton("Add Student");
        frame.add(addButton, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog(frame, "Enter student name:");
                if (name != null && !name.trim().isEmpty()) {
                    int age = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter student age:"));
                    int nextId = studentListModel.size() + 1;
                    Student student = new Student(nextId, name, age);
                    sms.addStudent(student);
                    studentListModel.addElement(student.getName());
                }
            }
        });

        studentList.addListSelectionListener(e -> {
            int selectedIndex = studentList.getSelectedIndex();
            if (selectedIndex >= 0) {
                Student selectedStudent = sms.getAllStudents().get(selectedIndex);
                studentDetails.setText("Student ID: " + selectedStudent.getId() +
                        "\nStudent Name: " + selectedStudent.getName() +
                        "\nStudent Age: " + selectedStudent.getAge());
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentManagementApp());
    }
}
