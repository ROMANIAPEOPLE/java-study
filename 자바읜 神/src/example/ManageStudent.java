package example;

public class ManageStudent {
    public static void main(String[] args) {
        Student [] students =null;
        ManageStudent manageStudent = new ManageStudent();
//        students = manageStudent.addStudent();
//        manageStudent.printStudents(students);
        manageStudent.checkEquals();
    }
    public void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.toString());

        }
    }

    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook","Seoul","01020202020","ask@gmail.com");
        return students;
    }

    public void checkEquals() {
        Student a= new Student("Min","Seoul","010XXXXXXXX","ask@gmail.com");
        Student b= new Student("Min","Seoul","010XXXXXXXX","ask@gmail.com");

        if(a.equals(b)) {
            System.out.println("Equals");
        }else {
            System.out.println("Not Equals");
        }

    }
}
