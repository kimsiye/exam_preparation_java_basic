package board_teacher;

import board_teacher.Post.PostController;

import java.util.Scanner;

public class BoardApp {
    PostController postController = new PostController();

    Scanner sc = new Scanner(System.in);


    public BoardApp() {

    }

    public void run() {

        while (true) {
            System.out.print("명령어 : "); // 입력 표시
            String commend = sc.nextLine();

            if (commend.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (commend.equals("add")) {
                postController.add();

            } else if (commend.equals("list")) {
                postController.list();

            } else if (commend.equals("update")) {
                postController.update();

            } else if (commend.equals("delete")) {
                postController.delete();

            } else if (commend.equals("detail")) {
                postController.detail();

            } else if (commend.equals("search")) {
                postController.search();
            }


        }

    }


}
