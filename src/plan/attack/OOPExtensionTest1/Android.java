package plan.attack.OOPExtensionTest1;

public class Android extends MobilePhone{
    //安卓手机，继承自移动手机类型
    //安卓手机特有功能——NFC
    public String brand;
    public void NFC(){
        System.out.println("此手机有NFC功能");
    }
    public void show(){
        System.out.println("手机品牌是："+brand);
    }
    public void testSuper(){
        System.out.println("super.name="+super.brand);
    }
}
