package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름:" + student1Name+ " 나이:"+ student1Age+ " 성적:"+ student1Grade);
        System.out.println("이름:" + student2Name+ " 나이:"+ student2Age+ " 성적:"+ student2Grade);

        /*
        학생 2명을 다루어야 하기 때문에 각각 다른 변수를 사용했다.
        이 코드의 문제는 학생이 늘어날 때 마다 변수를 추가로
        선언해야 하고, 또 출력하는 코드도 추가해야 한다.
        이런 문제를 어떻게 해결할 수 있을까? 앞서 배운 배열을 사용하면 문제를 해결할 수 있다
         */
    }
}
