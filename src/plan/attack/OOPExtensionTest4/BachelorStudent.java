package plan.attack.OOPExtensionTest4;

public class BachelorStudent extends Student{
    public BachelorStudent() {
    }

    public BachelorStudent(String name, int age) {
        super(name, age);
    }

    public BachelorStudent(String name, int age, int grade) {
        super(name, age, grade);
    }
    //重写学习这一方法

    @Override
    public void study() {
        System.out.println("本科学习");
    }
}
