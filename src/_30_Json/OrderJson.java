package _30_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

/*
*
* */
public class OrderJson {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("orderId", "ORD123456");
        jsonObject1.addProperty("customer", "곽두팔");
        jsonObject1.addProperty("product", "에어팟 프로 2세대");
        jsonObject1.addProperty("quantity", 1);
        jsonObject1.addProperty("price", 349000);

        JsonObject address = new JsonObject();
       address.addProperty("receiver", "곽두팔");
       address.addProperty("receiver", "010-4202-4495");
       address.addProperty("receiver", "서울");
       address.addProperty("receiver", "마포구");
       address.addProperty("receiver", "04123");

       jsonObject1.add("address", address);

       Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
       //String json = gsonBulider.tojson(orderInfo);
        //System.out.println(json);

    }
}
