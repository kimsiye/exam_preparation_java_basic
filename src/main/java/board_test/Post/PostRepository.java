package board_test.Post;

import java.util.ArrayList;

public class PostRepository {
    private ArrayList<Post> posts = new ArrayList<>();

    public void save(Post post) {
        posts.add(post);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void delete(Post post) {
        posts.remove(post);
    }

    public ArrayList<Post> searchPosts(String searchKeyword) {
        ArrayList<Post> searchPosts = new ArrayList<>();
        for (Post post : posts) {
            if (post.getTitle().contains(searchKeyword)) {
                searchPosts.add(post);
            }
        }
        return searchPosts;
    }

    public Post findPostById(int SelNum) {

        for (Post post : posts) {
            if (post.getId() == SelNum) {
                return post;
            }
        }
        return null;
    }
}
