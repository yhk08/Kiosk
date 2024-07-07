package src;

public class Menu {
    private String name;
    private String comment;

    public Menu(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public void Show(){
        System.out.printf("%-15s | %s\n", name, comment);
    }
}
