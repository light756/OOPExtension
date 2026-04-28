package plan.attack.OOPExtensionTest3;

public class SmartDevices {
    //一个实验——这是一个智能设备促销逻辑类，下辖手机类、电脑类
    //智能设备共同特性——名称、品牌、价格
    public String name;
    public String brand;
    public double price;
    //全体智能设备打折策略：1000元以下，无折扣；1000-5000元，打9折；5000-10000元，打8折，万元以上7折
    public double discountPrice(){
        if(this.price<1000){
            return this.price;
        }
        else if(this.price>=1000&&this.price<5000){
            return this.price*0.9;
        }
        else if(this.price>=5000&&this.price<10000){
            return this.price*0.8;
        }
        else{
            return this.price*0.7;
        }
    }
}
