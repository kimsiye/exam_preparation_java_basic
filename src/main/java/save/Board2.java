package save;

public class Board2 {

//    static ArrayList<Post> posts = new ArrayList<>();
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int lastestId = 1;
//
//        while (true) {
//            System.out.print("명령어 : "); // 입력 표시
//            String commend = sc.nextLine();
//
//            if (commend.equals("exit")) {
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            } else if (commend.equals("add")) {
//                System.out.print("게시물 제목을 입력해주세요 : ");
//                String title = sc.nextLine();
//                System.out.print("게시물 내용을 입력해주세요 : ");
//                String body = sc.nextLine();
//
//                Post post = new Post(lastestId, title, body);
////                post.setTitle(title);
////                post.setBody(body);
//
//                posts.add(post);
//                System.out.println("게시물이 등록되었습니다.");
//                lastestId++;
//
//            } else if (commend.equals("list")) {
//                System.out.println("==============");
//                for (Post post : posts) {
//                    System.out.printf("번호 : %d \n", post.getId());
//                    System.out.printf("제목 : %s \n", post.getTitle());
//                    //System.out.printf("내용 : %s \n", post.getBody());
//                    System.out.println("==============");
//                }
//            } else if (commend.equals("update")) {
//                System.out.print("수정할 게시물 번호 : ");
//                int targetId = Integer.parseInt(sc.nextLine());
//
//                Post post = findPostById(targetId);
//
//                if (post == null) {
//                    System.out.println("없는 게시물입니다.");
//                    continue;
//                }
//
//                System.out.print("수정할 제목 : ");
//                String newTitle = sc.nextLine();
//                System.out.print("수정할 내용 : ");
//                String newBody = sc.nextLine();
//
//                post.setTitle(newTitle);
//                post.setTitle(newBody);
//
//                System.out.println("수정이 완료되었습니다.");
//
////                for (Post post : posts) {
////                    if (post.getId() == targetId) {
////                        System.out.print("수정할 제목 : ");
////                        String newTitle = sc.nextLine();
////                        System.out.print("수정할 내용 : ");
////                        String newBody = sc.nextLine();
////
////                        post.setTitle(newTitle);
////                        post.setTitle(newBody);
////
////                        System.out.println("수정이 완료되었습니다.");
////                        break; // 수정이 되면 멈춤 (같은 번호일때만 진행됨)
////                    }
////                }
//
////                if (targetIdx < 0 || targetIdx >= posts.size()) {
////                    System.out.println("없는 게시물 번호입니다.");
////                    continue;
////                }
//
//
//            } else if (commend.equals("delete")) {
//                System.out.print("삭제할 게시물 번호");
//                int targetId = Integer.parseInt(sc.nextLine());
//
//                Post post = findPostById(targetId);
//
//                if (post == null) {
//                    System.out.println("없는 게시물 번호입니다.");
//                    continue; // 아래 코드 건너뛰기
//                }
//
//                posts.remove(post);
//                System.out.println("삭제이 완료되었습니다.");
//
//
////                for (Post post : posts) {
////                    if (post.getId() == targetId) {
////                        posts.remove(post); // 객체 자체 삭제
////                        System.out.println("수정이 완료되었습니다.");
////                        break; // 수정이 되면 멈춤 (같은 번호일때만 진행됨)
////                    }
////                }
//            }
//
//        }
//
//
//    }
//
//    public static Post findPostById(int id) {
//        for (Post post : posts) {
//            if (post.getId() == id) {
//                return post;//return을 만나면 매서드는 그 즉시 종료
//            }
//        }
//        return null; // null은 없다라는 의미
//    }

}
