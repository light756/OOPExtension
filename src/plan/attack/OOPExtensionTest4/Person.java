package plan.attack.OOPExtensionTest4;

public class Person {
    //学生-教师信息管理实验
    //人类——通用属性
    private String name;
    private int age;
    //有参-无参构造
    public Person() {
        System.out.println("无参构造启用中——人类通用");
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造启用中——人类通用");
    }
    //设置

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //通用生命行为
    public void life() {
        System.out.println("活着——通用");
    }

}
