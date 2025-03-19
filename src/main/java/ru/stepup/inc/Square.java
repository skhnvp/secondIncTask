package ru.stepup.inc;

public class Square {
    private Point topLeftPoint;
    private int sideLenght;

    public Square(int x, int y, int sideLenght) {
        if (sideLenght > 0) {
            this.topLeftPoint = new Point(x, y);
            this.sideLenght = sideLenght;
        } else {
            throw new IllegalArgumentException("Значение должно быть больше нуля");
        }
    }

    public Point getTopLeftPoint() {
        return new Point(topLeftPoint.getX(), topLeftPoint.getY());
    }

    public void setTopLeftPoint(Point p) {
        this.topLeftPoint = new Point(p.getX(), p.getY());
    }

    public int getSideLenght() {
        return sideLenght;
    }

    public void setSideLenght(int sideLenght) {
        if (sideLenght > 0) {
            this.sideLenght = sideLenght;
        } else {
            throw new IllegalArgumentException("Значение должно быть больше нуля");
        }
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + topLeftPoint + " со стороной " + sideLenght;
    }
}
