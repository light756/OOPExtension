package plan.attack.OOPExtensionTest1;

public class ElectronicDevice {
    //本次实验旨在进行电子设备类的继承实验
    //同时，测试就近原则和super关键字
    public String name;
    public int price;
    public void turnOn() {
        System.out.println("开机");
    }
    public void show() {
        System.out.println("名称：" + name + " 价格：" + price);
    }
}
