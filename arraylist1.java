import java.util.ArrayList; //陣列模組
import java.util.Collections; //排序模組
import java.util.Iterator; //迭代器

public class arraylist1{
    public static void main(String[] args) {
        //新增Array的object
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Honda");

        for (String i:cars){
            System.out.println(i);
        }
        //排序 sorting
        Collections.sort(cars);
        System.out.println(cars);

        //反向排序
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println(cars);

        // Get the iterator ***注意左右大小寫不同***
        Iterator<String> C = cars.iterator(); 
        // Loop through a collection
        while (C.hasNext())
            System.out.println(C.next() + " 單獨抓出來");
    }


}