package plan.attack.OOPExtensionTest1;

public class test {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Android android = new Android();
        PC pc = new PC();
        android.testSuper();
        android.show();
        android.call();
        pc.show();
        pc.programming();
        pc.turnOn();
        apple.showTime();
        System.out.println("苹果手机的品牌是——"+apple.brand);
        System.out.println("现在安卓手机的品牌是——"+android.brand);
        System.out.println("看看父类");
        //测试super
        android.testSuper();
        android.brand="OPPO";
        System.out.println("现在安卓手机的品牌是——"+android.brand);
        System.out.print("看看父类： ");
        android.testSuper();
    }
}
