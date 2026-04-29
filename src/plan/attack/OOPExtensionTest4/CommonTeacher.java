package plan.attack.OOPExtensionTest4;

public class CommonTeacher extends Teacher{
    public CommonTeacher() {
    }

    public CommonTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    public CommonTeacher(String name, int age) {
        super(name, age);
    }

    //重写教学 方法
    @Override
    public void teach() {
        System.out.println("教课——普通教师");
    }
}
