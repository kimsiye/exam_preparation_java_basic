package board_test;

import board_test.Post.PostController;

import java.util.Scanner;

public class TxtBoardSummary {
    PostController postController = new PostController();

    public void run() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("기능 : exit, add, list, update, delete, detail, search");
            System.out.print("명령어 : ");
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
