package plan.attack.OOPExtensionTest2;

public class SecondGenerationPhone extends FirstGenerationPhone{
    //测试方法的重载
    @Override
    public void call() {
        //super.call();
        System.out.println("手机可以进行视频通话——二代功能");
    }
}
