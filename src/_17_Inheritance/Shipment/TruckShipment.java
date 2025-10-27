package _17_Inheritance.Shipment;

public class TruckShipment extends Shipment {
    public TruckShipment(String from, String to) {
        super(from, to);
    }

    @Override
    public int calcFee(int weight, int dis) {
        if (weight < 0) {
            weight = 0;
        }
        if (dis < 0) {
            dis = 0;
        }
        int fee = 5000 + (weight * 40) + (dis * 30);
        return fee;
    }
}
