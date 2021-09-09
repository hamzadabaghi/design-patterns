package pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private final List<Object> history = new ArrayList<>();

    public void push(Object e) {
        history.add(e);
    }

    public Object pop() {
        var lastIndex = history.size() - 1;
        var lastItem = history.get(lastIndex);
        history.remove(lastIndex);
        return lastItem;
    }


}
