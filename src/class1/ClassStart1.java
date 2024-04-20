package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String [] studentNames = {"학생1" , "학생2", "학생3", "학생4"};
        int [] studentAges = {15, 16, 17, 20};
        int [] studentGrades = {90, 80, 70, 60};
        for (int i = 0; i < studentNames.length; i++){
            System.out.println("이름:" + studentNames[i]+ " 나이:"+ studentAges[i]+ " 성적:"+ studentGrades[i]);
        }

        /*
        한계가 있음..
        배열을 사용해서 코드 변경을 최소화하는데는 성공했지만, 한 학생의 데이터가
        studentAges[],studentGrades[], studentNames[]라는 3개의 배열에 나누어져 있다.
        따라서 데이터를 변경할 때 매우 조심해서 작업해야 한다.
        예를 들어서 학생 2의 데이터를 제거하려면 각각의 배열마다 학생2의 요소를 정확하게 찾아서 제거 해주어야 한다
         */

    }
}
