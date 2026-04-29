package plan.attack.OOPExtensionTest4;

public class Teacher extends Person{
    //教师通用属性
    //学科
    String subject="未知";
    //教师通用构造
    public Teacher() {
        System.out.println("无参构造启用中——教师通用");
    }
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("有参构造启用中——教师通用");
    }
    public Teacher(String name, int age) {
        super(name, age);
        System.out.println("有参构造启用中(学科缺省)——教师通用");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //教师通用行为
    public void teach() {
        System.out.println("教课——通用");
    }
}
