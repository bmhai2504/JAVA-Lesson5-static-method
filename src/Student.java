public class Student {
    private int rollno;
    private String name;
    private static String college = "TruongDoi";
    public Student(){

    }
    public Student (int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    static void change(){
        college = "CodeGym";
    }
    public String toString() {
        return "Student{" +
                "rollno = " + rollno +
                ", name = " + name  + ", college = " + college +
                "}";
    }
}
