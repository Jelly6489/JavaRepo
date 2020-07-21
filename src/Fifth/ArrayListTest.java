package Fifth;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // String 타입의 리스트 생성
        // list = []
        ArrayList<String> list = new ArrayList<String>();

        // list.add()는 Python의 append와 동일하다.
        list.add("Milk");
        list.add("grape");
        list.add("apple");
        // 특정 위치에 요소를 넣고 있음
        // 원래 있던 녀석들은 뒤 쪽으로 밀려남
        list.add(1, "butter");
        list.add(2, "strawberry");
        // 특정 위치에 있는 요소를 제거한다.
        list.remove(3);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));;
        }
    }
}


