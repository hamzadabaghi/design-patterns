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
        System.out.println(editor);

        try {
            editor.restore(history.pop());
            editor.restore(history.pop());
            editor.restore(history.pop());
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("There is no other states left");
        }
        System.out.println("after restoring " + editor);
    }
}
