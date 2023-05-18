public class Main {
    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(1, "hai");
        Student student2 = new Student(2, "tai");
        Student student3 = new Student(3, "phong");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}