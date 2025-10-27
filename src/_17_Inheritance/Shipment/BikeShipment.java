package _17_Inheritance.Shipment;

public class BikeShipment extends  Shipment{
    public BikeShipment(String from, String to) {
        super(from, to);
    }
    @Override
    public int calcFee(int weight, int dis){
        if (weight <0){
            weight = 0;
        }
        if (dis < 0){
            dis = 0;
        }
        int fee = 2000+ (weight * 20) +(dis * 20);
                return fee;
    }
}
