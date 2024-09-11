package board_test.Post;

public class Post {

    private int id;
    private String title;
    private String content;
    private String nowDateTime;
    private int view = 1;

    public Post(int id, String title, String content, String nowDateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.nowDateTime = nowDateTime;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = this.view + view;
    }

    public String getNowDateTime() {
        return nowDateTime;
    }

    public void setNowDateTime(String nowDateTime) {
        this.nowDateTime = nowDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
