package board_teacher.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {
    private PostRepository postRepository = new PostRepository();
    private PostView postView = new PostView();

    Scanner sc = new Scanner(System.in);
    int lastestId = 4;

    public PostController() {
        Post test1 = new Post(1, "자바 aa", "내용없음", currentDateTime(), 0);
        Post test2 = new Post(2, "자바 aab", "내용없음", currentDateTime(), 0);
        Post test3 = new Post(3, "자바 b", "내용없음", currentDateTime(), 0);

        postRepository.save(test1);
        postRepository.save(test2);
        postRepository.save(test3);
    }

    public void detail() {
        System.out.print("상세보기 할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호 입니다.");
            return;
        }

        // post.setHit(post.getHit() + 1);
        post.increaseHit();

        postView.printPostDetail(post);
    }

    public void list() {
        postView.printPostList(postRepository.getPosts());
    }

    public void search() {
        System.out.print("검색 키워드  : ");
        String keyword = sc.nextLine();

        ArrayList<Post> searchList = postRepository.getPostByKeyword(keyword);
        if (searchList.isEmpty()) {
            System.out.println("없는 게시물 입니다.");
        } else {
            postView.printPostList(searchList);
        }

    }


    public void delete() {
        System.out.print("삭제할 게시물 번호");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
            return; // 아래 코드 건너뛰기
        }

        postRepository.remove(post);
        System.out.println("삭제이 완료되었습니다.");
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostById(targetId);

        if (post == null) {
            System.out.println("없는 게시물입니다.");
            return;
        }

        System.out.print("수정할 제목 : ");
        String newTitle = sc.nextLine();
        System.out.print("수정할 내용 : ");
        String newBody = sc.nextLine();

        post.setTitle(newTitle);
        post.setTitle(newBody);

        System.out.println("수정이 완료되었습니다.");
    }

    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine();


        Post post = new Post(lastestId, title, body, currentDateTime(), 0);
//                post.setTitle(title);
//                post.setBody(body);

        postRepository.save(post);
        System.out.println("게시물이 등록되었습니다.");
        lastestId++;
    }

    public String currentDateTime() {
        // 현재 날짜와 시간 가져오기
        LocalDateTime currentDateTime = LocalDateTime.now();

        // 원하는 포맷 지정하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");

        // 포맷 적용하여 출력하기
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }
}
