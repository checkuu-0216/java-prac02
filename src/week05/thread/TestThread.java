package src.week05.thread;

public class TestThread extends Thread {
    @Override
    public void run() {
        //실제 우리가 thread에서 수행할 작업 적기
//        System.out.println("테스트입니다!");
for(int i=0; i<100;i++){
    System.out.print("*");
}

    }
}
