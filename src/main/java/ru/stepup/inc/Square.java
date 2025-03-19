package ru.stepup.inc;

public class Square {
    private Point topLeftPoint;
    private int sideLenght;

    public Square(int x, int y, int sideLenght) {
        this.topLeftPoint = new Point(x, y);
        this.sideLenght = sideLenght;
    }

    public Point getTopLeftPoint() {
        return new Point(topLeftPoint.getX(), topLeftPoint.getY());
    }

    public void setTopLeftPoint(int x, int y) {
        this.topLeftPoint = new Point(x, y);
    }

    public int getSideLenght() {
        return sideLenght;
    }

    public void setSideLenght(int sideLenght) {
        this.sideLenght = sideLenght;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + topLeftPoint + " со стороной " + sideLenght;
    }
}
