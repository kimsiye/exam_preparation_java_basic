package board_me;

public class Post {
    private int index;
    private String title;
    private String content;
    private String formateNow;
    private int view = 1;

    public Post(int index, String title, String content, String formateNow) {
        this.index = index;
        this.title = title;
        this.content = content;
        this.formateNow = formateNow;
    }

    // getter setter

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = this.view+view ;
    }

    public String getFormateNow() {
        return formateNow;
    }

    public void setFormateNow(String formateNow) {
        this.formateNow = formateNow;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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
