package pattern.memento;

public class Editor {
    private String content;

    public String getContent() {
        return content;
    }
    public void setContent(String content){
        this.content=content;
    }

    public EditorState createState() {
      return new EditorState(content);
    }

    public void restore(EditorState e){
        content = e.getContent();
    }

    @Override
    public String toString() {
        return  "content = " + content;
    }
}
