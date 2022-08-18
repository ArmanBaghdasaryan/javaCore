package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynArray = new DynamicArray();

        dynArray.add(7);
        dynArray.add(9);
        dynArray.add(710);
        dynArray.add(78);
        dynArray.add(72);
        dynArray.add(90);
        dynArray.add(55);
        dynArray.add(47);
        dynArray.add(13);
        dynArray.add(72);
        dynArray.add(77);
        dynArray.add(74);
        dynArray.add(23);
        dynArray.add(99);


        dynArray.add(2, 10);

        dynArray.delete(1);

        System.out.println(dynArray.isEmpty());
        System.out.println(dynArray.getByIndex(0));
        System.out.println(dynArray.getFirstIndexByValue(99));
        dynArray.set(10, 3);
        dynArray.print();


    }
}
