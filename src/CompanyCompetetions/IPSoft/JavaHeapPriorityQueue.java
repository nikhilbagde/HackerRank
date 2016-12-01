package CompanyCompetetions.IPSoft;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Nikhi on 12/1/2016.
 */
public class JavaHeapPriorityQueue {
    public static void main(String[] args) {
         PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return -1;
                }else if(o1<o2){
                    return 1;
                }
                return 0;
            }
        });

        pq.add(3);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());



    }

}
