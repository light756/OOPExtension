package plan.attack.OOPExtensionTest4;

public class MasterStudent extends Student{
    public MasterStudent() {
    }

    public MasterStudent(String name, int age) {
        super(name, age);
    }

    public MasterStudent(String name, int age, int grade) {
        super(name, age, grade);
    }

    //硕士生——学习方法重写、生活方法重写
    @Override
    public void study() {
        System.out.println("学习——硕士生");
    }
    @Override
    public void life() {
        System.out.println("生活——硕士生");
    }
}
