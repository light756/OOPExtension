package plan.attack.OOPExtensionTest4;

public class Test {
    public static void main(String[] args) {
        //测试各个类
        BachelorStudent s1 = new BachelorStudent("张三", 18, 1);
        s1.life();
        s1.study();
        MasterStudent s2 = new MasterStudent("王五", 20, 2);
        s2.life();
        s2.study();
        CommonTeacher t1 = new CommonTeacher("赵六", 30, "历史");
        t1.teach();
        t1.life();
        ProfessionTeacher t2 = new ProfessionTeacher("专一", 40);
        t2.teach();
        t2.life();
        System.out.println("专一的学科为："+t2.subject);
        t2.setSubject("历史");
        System.out.println("专一的学科为："+t2.getSubject());
    }
}
