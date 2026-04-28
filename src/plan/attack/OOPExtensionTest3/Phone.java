package plan.attack.OOPExtensionTest3;

public class Phone extends SmartDevices{
    //在常规智能设备的基础上，统一再追加9折
    @Override
    public double discountPrice() {
        return super.discountPrice() * 0.9;
    }
}
