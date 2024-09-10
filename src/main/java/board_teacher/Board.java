package board_teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Post> posts = new ArrayList<>();

        int lastestId = 1;

        while (true) {
            System.out.print("명령어 : "); // 입력 표시
            String commend = sc.nextLine();

            if (commend.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (commend.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String body = sc.nextLine();

                Post post = new Post(lastestId, title, body);
//                post.setTitle(title);
//                post.setBody(body);

                posts.add(post);
                System.out.println("게시물이 등록되었습니다.");
                lastestId++;

            } else if (commend.equals("list")) {
                System.out.println("==============");
                for (Post post : posts) {
                    System.out.printf("번호 : %d \n", post.getId());
                    System.out.printf("제목 : %s \n", post.getTitle());
                    //System.out.printf("내용 : %s \n", post.getBody());
                    System.out.println("==============");
                }
            } else if (commend.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());

                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        System.out.print("수정할 제목 : ");
                        String newTitle = sc.nextLine();
                        System.out.print("수정할 내용 : ");
                        String newBody = sc.nextLine();

                        post.setTitle(newTitle);
                        post.setTitle(newBody);

                        System.out.println("수정이 완료되었습니다.");
                        break; // 수정이 되면 멈춤 (같은 번호일때만 진행됨)
                    }
                }

//                if (targetIdx < 0 || targetIdx >= posts.size()) {
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue;
//                }


            } else if (commend.equals("delete")) {
                System.out.print("삭제할 게시물 번호");
                int targetId = Integer.parseInt(sc.nextLine());

                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        posts.remove(post); // 객체 자체 삭제
                        System.out.println("수정이 완료되었습니다.");
                        break; // 수정이 되면 멈춤 (같은 번호일때만 진행됨)
                    }
                }
            }

        }


    }

    public static Post findPostById(ArrayList<Post> posts){
        int targetId = Integer.parseInt(sc.nextLine());
        for (Post post : posts) {
            if (post.getId() == targetId) {
                return post;
            }
        }
            return null;
    }
    // return이 메서드를 종료: return 키워드는 메서드를 종료하고 값을 반환합니다.
    // 따라서 for 루프 내에서 일치하는 Post 객체를 찾으면 return post가 호출되고,
    // 메서드가 종료됩니다.
    //
    // 불필요한 코드: 만약 일치하는 게시물을 찾지 못한 경우,
    // for 루프가 끝나게 되면 그 자체로 이미 found가 false임을 의미합니다.
    // 따라서 굳이 if (!found) 조건을 검사할 필요 없이, 바로 return null;을 하면 됩니다.
}
