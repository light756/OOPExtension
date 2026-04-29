package plan.attack.OOPExtensionTest4;

public class ProfessionTeacher extends Teacher{
    public ProfessionTeacher() {
    }

    public ProfessionTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    public ProfessionTeacher(String name, int age) {
        super(name, age);
    }

    //专业教师——重写教学的方法
    @Override
    public void teach() {
        System.out.println("专业教师进行专业教学");
    }

}
