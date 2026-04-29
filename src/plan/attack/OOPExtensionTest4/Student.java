package plan.attack.OOPExtensionTest4;

public class Student extends Person{
    //学生通用特性——年级
    //通用方法——学习
    int grade=0; //学生通用特性——年级

    public Student() {
        System.out.println("无参构造启用中——学生通用");
    }
    public Student(String name, int age) {
        super(name, age);
        System.out.println("有参构造启用中(年级缺省)——学生通用");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
        System.out.println("有参构造启用中——学生通用");
    }
    public void study() {
        System.out.println("学习——学生通用");
    }
}
