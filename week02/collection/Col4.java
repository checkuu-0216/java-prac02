package week02.collection;
import java.util.Queue;
import java.util.LinkedList;
public class Col4 {
    public static void main(String[] args) {
        //queue : FIFO (firstIn firstOut)
        //add , peek, poll
        //queue : 생성자가 없는 인터페이스  new로 새로 만들수 없다

        Queue<Integer> intQueue = new LinkedList<>(); //Queue를 선언하고 생성 Queue는 new 로 할 수 없어서 LinkedList 사용

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

while(!intQueue.isEmpty()){
    System.out.println(intQueue.poll());

        }
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());


    }
}
