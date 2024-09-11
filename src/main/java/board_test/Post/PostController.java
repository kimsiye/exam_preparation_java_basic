package board_test.Post;

import board_test.Comment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {

    private PostRepository postRepository = new PostRepository();
    private PostView postView = new PostView();
    private int memoryId = 1;
    private Scanner sc = new Scanner(System.in);


    ArrayList<Comment> comments = new ArrayList<>();

    public PostController() {
        Post test1 = new Post(memoryId, "a 안녕하세요 반갑습니다. 자바 공부중이에요.", "내용", nowDateTime());
        Post test2 = new Post(memoryId = memoryId + 1, "a 자바 질문좀 할게요~", "내용", nowDateTime());
        Post test3 = new Post(memoryId = memoryId + 1, "b 안녕하세요 반갑습니다. 정처기 따야되나요?.", "내용", nowDateTime());

        postRepository.save(test1);
        postRepository.save(test2);
        postRepository.save(test3);

        memoryId++;
    }

    public void search() {
        System.out.print("검색 키워드를 입력해주세요 : ");
        String searchKeyword = sc.nextLine();

        ArrayList<Post> searchPosts = postRepository.searchPosts(searchKeyword);
        postView.printPostList(searchPosts);
    }

    public void detail() {
        System.out.print("상세보기 할 게시물 번호 : ");
        int detailSelNum = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostById(detailSelNum);

        if (post == null) {
            System.out.println("존재하지 않는 게시물 번호입니다.");
            return;
        }

        postView.printPost(post);


        while(true){
            int memoryCommentId = 1;
            System.out.println("상세보기 기능 번호를 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
            int detailFuncSelNum = Integer.parseInt(sc.nextLine());
            if(detailFuncSelNum == 1){
                System.out.println("[댓글 기능]");
                System.out.print("댓글 내용 : ");
                String commentBody = sc.nextLine();

                Comment comment = new Comment(memoryCommentId, commentBody, nowDateTime());

                comments.add(comment);
                //memoryCommentId




            }else if(detailFuncSelNum == 2){
                System.out.println("[추천 기능]");
            }else if(detailFuncSelNum == 3){
                System.out.println("[수정 기능]");
            }else if(detailFuncSelNum == 4){
                System.out.println("[삭제 기능]");
            }else if(detailFuncSelNum == 5){
                System.out.println("목록으로 이동합니다");
                break;
            }
        }
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int deleteSelNum = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostById(deleteSelNum);

        findFailPost(post);

        postRepository.delete(post);
        System.out.printf("%d번 게시물이 삭제되었습니다.\n", deleteSelNum);
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int updateSelNum = Integer.parseInt(sc.nextLine());

        Post post = postRepository.findPostById(updateSelNum);

        findFailPost(post);

        System.out.print("제목 : ");
        String changTitle = sc.nextLine();
        System.out.print("내용 : ");
        String changContent = sc.nextLine();

        post.setTitle(changTitle);
        post.setContent(changContent);

        System.out.println("게시물이 수정되었습니다.");

    }

    public void list() {
        postView.printPostList(postRepository.getPosts());
    }

    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String content = sc.nextLine();

        Post post = new Post(memoryId, title, content, nowDateTime());

        postRepository.save(post);
        memoryId++;

        System.out.println("게시물이 등록되었습니다.");
    }


    public void findFailPost(Post post) {
        if (post == null) {
            System.out.println("없는 게시물 번호입니다.");
        }
    }

    public String nowDateTime() {
        // 현재 날짜/시간
        LocalDateTime now = LocalDateTime.now();
        // 포맷팅
        return now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
    }
}
