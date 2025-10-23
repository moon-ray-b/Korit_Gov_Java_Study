package _16_Class.WaterBottle;
//문제
//WaterBottle 패키지 만들고
//WaterBottle클래스
//currentWater 물의 양 => 속성
//메소드 물 채우기 fill => 최대용량 1000으로 이상으로 채울 수 없음
//메소드 물 마시기 drink => 현재 용량보다 초과해서 마실 수 없음
//getter로 현재 물의 양 출력하기
//객체 생성시 빈병
public class WaterBottle {
    public int currentWater;

    public int getCurrentWater() {
        return currentWater;
    }
    public void fill(int amount){

        if (amount > 0 && currentWater + amount <= 1000){
            currentWater += amount;
            System.out.println("채운 용량: " + amount + " 현재용량: " + currentWater);
        }else {
            System.out.println("0초과의 물을 채우거나 물병의 최대치 용량을 넘어 설수 없습니다");
        }
    }
    public  void drink(int amount){
        if (amount > 0 && currentWater - amount >=0){
            currentWater -= amount;
            System.out.println("마신 용량: "+ amount + " 현제용량: " + currentWater);
        }else{
            System.out.println("0초과의 물을 마시거나 현재 물 용량보다 초과해서 마실수 없습니다.");
        }
    }
}
