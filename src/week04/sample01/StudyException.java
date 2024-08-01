package src.week04.sample01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        //try ~ catch ~ finally 구문 사용해야 위험하다고 선언한 것을 사용할 수 있다.

        try {
            // 일단 실행
            ourClass.thisMethodIsDangerous();
        }catch(OurBadException e) {
            System.out.println(e.getMessage());
        }finally{
            //무조건 이칸은 거친다
            System.out.println("우리는 방금 예외를 처리했습니다. 정상처리되든, 예외사항이 발생하든 여기를 거쳐요!");
        }


    }
}
