package board_teacher.Test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.age = 20;
        p1.name = "홍길동";

        p1.intro();

        setPerson(p1);
        Person p2 = getPerson(); // p2 = p (리턴한 객체의 리모컨을 담음)

        p2.intro();

        ArrayList<String> arr = new ArrayList<>();
        //arr ArrayList의 리모컨이 들어감으로 객체이다.
        // arr.add(""); // .> 객체에 접근한다는 뜻

        setArr(arr);

    }

    // main에서 arr를 넘겨받아 "apple","banana","orange" 저장
    public static void setArr(ArrayList<String> arr){
        // 배열리스트를 받음
        arr.add("apple");
        arr.add("banana");
        arr.add("orange");
    }


    // 원시타입(int String) 매개변수를 받으면 ()안에는 원시 타입에 해당하는 값을 넣어주어야함
    // (Person p)는 Post  클래스의 객체를 변수로 받음
    // > 해당 객체를 이용하여 변수와 메서드에 접근할 수 있음
    // main의 p1과 매서드의 p는 같음 리모컨이 p에도 들어간것임
    // ** int 타입을 넘기면 int로 받고 객체로 넘기면 객체로 받고 Arraylist로 받으면 Arraylist로 받음
    public static void setPerson(Person p){
        p.age = 30;
        p.name = "홍길동";
    }
    public static Person getPerson(){
        // 매서드에서 객체 생성,
        // main에서 사용할려면 객체를 리턴 시켜주면 되고
        // 리턴은 리턴할 값을 맞춰줘야하기 때문에 리턴을 클래스이름으로 주면 됨
        Person p = new Person();
        p.age = 20;
        p.name = "이순신";

        return p;
    }
}

class Person{
    int age;
    String name;
    public void intro(){
        System.out.printf("안녕하세요 저는 %d살 %s입니다.",age,name);
    }
}