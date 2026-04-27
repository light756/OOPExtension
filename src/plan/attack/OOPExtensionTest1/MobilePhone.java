package plan.attack.OOPExtensionTest1;

public class MobilePhone extends ElectronicDevice {
    //手机是电子设备的子类
    //一个手机特有的属性
    //一个手机特有的方法
    public String brand="未知";
    //计划——测试就近原则：当未设定安卓或苹果的手机品牌名字时，对象的brand==“未知”

    public void call(){
        System.out.println("手机在打电话");
    }

}
