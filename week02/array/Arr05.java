package week02.array;

public class Arr05 {
    public static void main(String[] args) {
        // 문자(char) , 문자열 구분(String)
        //String = char[]

        //기본형 변수 vs 참조형 변수
        //기본형 변수는 소문자로 시작한다. 반면 참조형 변수는 대문자로 시작한다
        //Wrapper class에서 기본형 변수를 감싸줄때는 앞자리 대문자이다 int => Integer
        //기본형 변수는 값 자체를 저장, 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 저장함(주소형 변수)

        //char < String 훨씬 더많이 씀
        //String의 기능이 훨 많음
        //Wrapper class와도 상당히 비슷 => 기본형 변수가 가지고 있는 기능이 제한 => 다양한 기능을 제공하는 Wrapper로 감싸면서 추가기능을 더함

String str = "ABCD";
//length
        int strLength = str.length();
        System.out.println(strLength);

        //charAt(int index)
        char strChar = str.charAt(1);
        System.out.println(strChar);

        //substring(int fromIdx, int toIdx)
        String strSub = str.substring(0,3);
        System.out.println(strSub);

// equals(String str)
        String newStr = "ABCE";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        //toCharArray() = String => char[]
        char[] strCharArray = str.toCharArray();

        // 반대로 char[] = String => char
        char[] charArray = {'A','B','C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);

    }
}
