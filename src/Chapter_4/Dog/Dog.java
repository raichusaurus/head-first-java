package Chapter_4.Dog;

public class Dog {

    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void bark() {
        bark(1);
    }

    void bark(int numBarks) {

        String barkSound;

        if (size > 60) {
            barkSound = "Wooof! Wooof!";
        }
        else if (size > 14) {
            barkSound = "Ruff! Ruff!";
        }
        else {
            barkSound = "Yip! Yip!";
        }

        while (numBarks > 0) {
            System.out.println(barkSound);
            numBarks--;
        }
    }
}
