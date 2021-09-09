package pattern.memento;

public class Main {

    public static void main(String[] args) {

        Editor editor = new Editor();
        var history = new History();

        /* each time you add an item , you save the state*/
        editor.setContent("a");
        history.push(editor.createState());
        System.out.println(editor);

        /* test another time */
        editor.setContent("b");
        history.push(editor.createState());
        System.out.println(editor);


        /* restore */
        editor.setContent("c");
        editor.restore(history.pop());
        System.out.println("after restoring " + editor);
    }
}
