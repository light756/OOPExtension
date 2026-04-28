package plan.attack.OOPExtensionTest3;

public class test {
    public static void main(String[] args) {
        Phone p1=new Phone();
        //给p1各个成员变量赋值
        p1.name="手机1";
        p1.brand="三星";
        p1.price=999;
        System.out.println("手机1的名称是："+p1.name+"，手机1的品牌是："+p1.brand+"，手机1的原来价格是："+p1.price);
        System.out.println("手机1的打折价格是："+p1.discountPrice());
        Phone p2=new Phone();
        p2.name="手机2";
        p2.brand="华为";
        p2.price=5999;
        System.out.println("手机2的名称是："+p2.name+"，手机2的品牌是："+p2.brand+"，手机2的原来价格是："+p2.price);
        System.out.println("手机2的打折价格是："+p2.discountPrice());
        PC p3=new PC();
        p3.name="电脑1";
        p3.brand="戴尔";
        p3.price=5999;
        System.out.println("电脑1的名称是："+p3.name+"，电脑1的品牌是："+p3.brand+"，电脑1的原来价格是："+p3.price);
        System.out.println("电脑1的打折价格是："+p3.discountPrice());
    }
}
