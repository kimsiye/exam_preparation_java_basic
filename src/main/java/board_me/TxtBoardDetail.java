package board_me;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TxtBoardDetail {
    private int countIndex = 1;
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Post> postsList = new ArrayList<>();
    private LocalDateTime now = LocalDateTime.now();
    private String formateNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));

    TxtBoardDetail() {
        Post test1 = new Post(countIndex, "안녕하세요 반갑습니다. java 공부중이에요.", "내용모름", formateNow);
        Post test2 = new Post(countIndex = countIndex + 1, "java 질문좀 할게요~", "내용모름", formateNow);
        Post test3 = new Post(countIndex = countIndex + 1, "a 정처기 따야되나요?", "내용모름", formateNow);

        postsList.add(test1);
        postsList.add(test2);
        postsList.add(test3);
    }


    public void exit() {
        System.out.println("프로그램을 종료합니다.");

    }

    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String content = sc.nextLine();

        Post postObject = new Post(countIndex, title, content, formateNow);
//                postObject.setIndex(countIndex);
//                postObject.setTitle(title);
//                postObject.setContent(content);
//                postObject.setFormateNow(formateNow);

        postsList.add(postObject);

        countIndex++;

        System.out.println("게시물이 등록되었습니다.");
    }

    public void list() {
        for (Post posts : postsList) {
            System.out.println("======================");
            System.out.printf("번호 : %d\n", posts.getIndex());
            System.out.printf("제목 : %s\n", posts.getTitle());
            //System.out.printf("내용 : %s\n", posts.getContent());
        }
        System.out.println("======================");


        //a
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int updateSelNum = Integer.parseInt(sc.nextLine());
        boolean found = false;
        for (Post posts : postsList) {
            if (posts.getIndex() == updateSelNum) {
                System.out.print("제목 : ");
                String updateChangeTitle = sc.nextLine();
                System.out.print("내용 : ");
                String updateChangeContent = sc.nextLine();

                posts.setTitle(updateChangeTitle);
                posts.setTitle(updateChangeContent);

                found = true;
            }
        }
        if (!found) {
            System.out.println("없는 게시물 번호 입니다.");
        }//b
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int deleteSelNum = Integer.parseInt(sc.nextLine());
        boolean found = false;
        for (Post posts : postsList) {
            if (posts.getIndex() == deleteSelNum) {
                postsList.remove(posts);
                found = true;
            }
        }
        if (!found) {
            System.out.println("없는 게시물 번호입니다.");
        }//b
    }

    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int detailSelNum = Integer.parseInt(sc.nextLine());
        boolean found = false;
        for (Post posts : postsList) {
            if (posts.getIndex() == detailSelNum) {
                System.out.println("======================");
                System.out.printf("번호 : %d\n", posts.getIndex());
                System.out.printf("제목 : %s\n", posts.getTitle());
                System.out.printf("내용 : %s\n", posts.getContent());
                System.out.printf("등록날짜 : %s\n", posts.getFormateNow());
                System.out.printf("조회수 : %d\n", posts.getView());
                System.out.println("======================");
                posts.setView(1);
                found = true;
            }
        }
        if (!found) {
            System.out.println("존재하지 않는 게시물 번호입니다.");
        }
        //a`
    }

    public void search() {
        System.out.print("검색키워드를 입력해주세요 : ");
        String searchString = sc.nextLine();
        boolean found = false;
        for (Post posts : postsList) {
            if (posts.getTitle().contains(searchString)) {
                System.out.println("======================");
                System.out.printf("번호 : %d\n", posts.getIndex());
                System.out.printf("제목 : %s\n", posts.getTitle());
                found = true;
            }
        }
        System.out.println("======================");
        if (!found) {
            System.out.println("검색결과가 없습니다.");
        }
    }//a

    //공통점이 보이지만 조금씩 다른 부분들을 어떻게 메서드 하나로 만들어서 응용해야할 지 모르겠음
    //Post mvc를 어떻게 나눠야 하는지 모르겠음


}

