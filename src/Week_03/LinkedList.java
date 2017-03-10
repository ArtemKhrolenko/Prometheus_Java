package Week_03;

/**
 * Created by Khrolenko on 10.03.2017.
 */
public class LinkedList {

    private Node nodeFirst;
    private Node nodeLast;
    private int count;


    /* Конструктор без аргументів */
    public LinkedList() {


    }

    /* Додати елемент в кінець списку */
    public void add(Integer data) {
        Node elem = new Node();
        elem.setData(data);
        if (nodeFirst == null){
            nodeFirst = elem;
            nodeLast = elem;
        }
        else {
            nodeLast.setNext(elem);
            nodeLast = elem;
        }
        this.count++;

    }

    /* Отримати елемент по індексу, повертає null якщо такий елемент недоступний */
    public Integer get(int index) {

        Node getElem = nodeFirst;
        if (index >= this.count || index < 0) return null;
        else{
            for (int i = 0; i < index; i++){
                getElem = getElem.getNext();
            }
        }
        return getElem.getData();
    }

    /* Вилучення елементу за індексом, повертає true у разі успіху або false в іншому випадку */
    public boolean delete(int index) {
        Node prev = null;
        Node current = nodeFirst;

        if (index < this.count && index >= 0){
            for (int i = 0; i < index; i++) {
                prev = current;
                current = current.getNext();
            }

            // Узел в середине или в конце.
            if (prev != null) {
                prev.setNext(current.getNext());

                // Если в конце, то меняем _tail.
                if (current.getNext() == null) {
                    nodeLast = prev;
                }
            }
            else //в начале списка
            {
                nodeFirst = nodeFirst.getNext();

                // Список теперь пустой?
                if (nodeFirst == null){
                    nodeLast = null;
                }
            }
            this.count--;
            return true;
        }
        return false;
    }

    /*Поверта розмір списку: якщо елементів в списку нема то повертає 0 (нуль)*/
    public int size() {
        return this.count;
    }

}
