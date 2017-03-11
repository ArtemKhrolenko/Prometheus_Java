package Week_03.LinkedList;

/**
 * Created by Khrolenko on 10.03.2017.
 */
public class ListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(5);
        list.add(8);
        list.add(4);
        list.add(6);

        System.out.println("size = " + list.size());
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println(list.delete(0));

        System.out.println("size = " + list.size());

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}


