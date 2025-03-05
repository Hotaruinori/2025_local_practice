import java.util.HashMap;


public class hashmap1 {
    public static void main(String[] args) {
        //創造物件 包含兩個字串
        HashMap<String, String> x = new HashMap<String, String>();
        //使用put()來新增item
        x.put("哆啦", "銅鑼燒");
        x.put("賴功德", "垃圾");
        x.put("胖虎", "球棒");

        System.out.println(x);
        //使用get()
        System.out.println(x.get("哆啦") + "A_A");

        //loop thorugh Print keys and values
        for (String i : x.keySet()){
            System.out.println("key" + i + "value" + x.get(i));
        }
        main2();     
    }

    public static void main2() {
        HashMap<String, Integer> y = new HashMap<String, Integer>();
        y.put("王", 33);
        y.put("陳", 53);
        y.put("黃", 23);
        System.out.println(y + "不同類型搭配測試");
        

    }
        
}

