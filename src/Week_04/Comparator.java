package Week_04;

/**
 * Created by Khrolenko on 12.03.2017.
 */
public class Comparator {
    public int compare(int a, int b){
        if (a>b) {
            return 1;
        } else if (a == b){
            return 0;
        } else {
            return -1;
        }
    }
}
