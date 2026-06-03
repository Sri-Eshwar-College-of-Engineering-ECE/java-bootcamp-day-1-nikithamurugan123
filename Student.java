public class Student {
    String name = "jai";
    String rollNo = "118";
    
    public void display() {
        String college = "vel Engineering College";
        System.out.println("Name: " + name + "  Roll No: "+ rollNo + "  College: " + college);
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}