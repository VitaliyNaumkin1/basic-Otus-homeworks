package ru.naumkin.homeworks.homework10.Box;

public class Box {
    private int width;
    private int height;
    private String item;
    private String color;
    private boolean isBoxClosed;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getItem() {
        return item;
    }

    public Box(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.item = null;
        this.isBoxClosed = false;
    }

    public Box(int width, int height, String color, String item) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.item = item;
        this.isBoxClosed = false;
    }

    public void info() {
        System.out.println("Информация о коробке: " +
                "\nШирина: " + width +
                "\nВысота: " + height +
                "\nColor: " + color);
        if (isBoxClosed) {
            System.out.println("Коробка закрыта");
        } else {
            System.out.println("Коробка открыта");
        }

        if (item == null) {
            System.out.println("В коробке нету предметов");
        } else {
            System.out.println("В коробке лежит " + item);
        }

    }

    public void open() {
        if (isBoxClosed) {
            isBoxClosed = false;
            System.out.println("Вы открыли коробку");
        } else {
            System.out.println("Коробка уже открыта");
        }
    }

    public void close() {
        if (isBoxClosed) {
            System.out.println("Коробка уже закрыта");
        } else {
            isBoxClosed = true;
            System.out.println("Вы закрыли коробку");
        }


    }

    public void putItem(String item) {
        if (!isBoxClosed) {
            if (this.item == null) {
                this.item = item;
                System.out.println("Вы положили " + item + " в коробку");
            }
        } else {
            System.out.println("Откройте вначале коробку,что бы положить " + item);
        }
    }

    public void removeItem(String item) {
        if (!isBoxClosed) {
            if (this.item.equals(item)) {
                this.item = null;
                System.out.println("Вы выкинули " + item + " из коробки");
            } else {
                System.out.println("Вы попытались выкинуть " + item + " ,но его нету в коробке");
            }
        } else {
            System.out.println("Откройте вначале коробку");
        }
    }

}
