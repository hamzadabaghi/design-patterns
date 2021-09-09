package pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private final List<EditorState> history = new ArrayList<>();

    public void push(EditorState e) {
        history.add(e);
    }

    public EditorState pop() {
        var lastIndex = history.size() - 1;
        var lastItem = history.get(lastIndex);
        history.remove(lastIndex);
        return lastItem;
    }


}
