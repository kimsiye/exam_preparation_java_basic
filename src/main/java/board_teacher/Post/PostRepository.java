package board_teacher.Post;

import java.util.ArrayList;

public class PostRepository {


    private ArrayList<Post> posts = new ArrayList<>();

    public void save(Post post) {
        posts.add(post);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void remove(Post post) {
        posts.remove(post);
    }

    public ArrayList<Post> getPostByKeyword(String keyword) {

        ArrayList<Post> searchList = new ArrayList<>();

        for (Post post : posts) {
            if (post.getTitle().contains(keyword)) {
                searchList.add(post);
            }
        }

        return searchList;
    }

    public Post findPostById(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;//return을 만나면 매서드는 그 즉시 종료
            }
        }
        return null; // null은 없다라는 의미
    }

}
