package board_me;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TxtBoardSummary {

    public void txtBoardSummaryRun() {

        Scanner sc = new Scanner(System.in);
        TxtBoardDetail txtBoardDetail = new TxtBoardDetail();

        while (true) {
            System.out.println("기능 : exit, add, list, update, delete, detail, search");
            System.out.print("명령어 : ");
            String command = sc.nextLine();

            if (command.equals("exit")) {
                txtBoardDetail.exit();
                break;
            } else if (command.equals("add")) {
                txtBoardDetail.add();
            } else if (command.equals("list")) {
                txtBoardDetail.list();
            } else if (command.equals("update")) {
                txtBoardDetail.update();
            } else if (command.equals("delete")) {
                txtBoardDetail.delete();
            } else if (command.equals("detail")) {
                txtBoardDetail.detail();
            } else if (command.equals("search")) {
                txtBoardDetail.search();
            } else{
                System.out.println("명령어를 잘못 입력하셨습니다. 다시 입력해주세요. ");
            }

        }
    }
}
