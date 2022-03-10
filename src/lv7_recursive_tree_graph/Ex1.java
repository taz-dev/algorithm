package lv7_recursive_tree_graph;

public class Ex1 {
    //재귀함수란?
    //자기 자신을 호출하는 함수(반복문 형태)
    //매개변수를 통해 Base Condition에 도달하도록 설계(일반적으로 감소하게 설계)
    //모든 재귀함수는 이론적으로 for문이나 while문으로 구현이 가능하나, 사용자의 편의(가독성)를 위해서 사용됨
    public void DFS(int n) {
        if (n == 0) return; //함수 종료
        else {
            //스택프레임(stack frame)이란?
            //메모리의 스택영역은 함수의 매개변수, 복귀주소, 지역변수가 저장되는 영역
            //스택영역에 차례대로 저장되는 함수의 호출 정보를 스택프레임이라고 함
            //System.out.print(n + " "); //3 2 1
            DFS(n - 1);
            System.out.print(n + " "); //1 2 3
        }
    }

    public static void main(String[] args) {
        Ex1 T = new Ex1();
        T.DFS(3);
    }
}
