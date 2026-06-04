public class Students {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name  );
         System.out.println( "rollno:"+ rollNo);
    }

    public static void main(String[] args) {
        Students student1 = new Students();
        student1.name = "Abhi";
        student1.rollNo = 4;

        Students student2 = new Students();
        student2.name = "Jai";
        student2.rollNo = 20;

        student1.display();
        student2.display();
        System.out.println();
    }
}