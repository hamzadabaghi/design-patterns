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

    public void restore(Object e){
        EditorState editorState = (EditorState) e;
        this.content = editorState.getContent();
    }

    @Override
    public String toString() {
        return  "content = " + content;
    }

    // the memento as a nested class is the best practice
    private static class EditorState {

        private final String content;
        public EditorState(String content) {
            this.content = content;
        }
        public String getContent() {
            return content;
        }

    }
}
