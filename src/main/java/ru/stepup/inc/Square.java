package ru.stepup.inc;

public class Square {
    private Point topLeftPoint;
    private int sideLenght;

    public Square(int x, int y, int sideLenght) {
        if (x >= 0 && y >= 0 && sideLenght > 0) {
            this.topLeftPoint = new Point(x, y);
            this.sideLenght = sideLenght;
        } else {
            throw new IllegalArgumentException("Значение должно быть больше нуля");
        }
    }

    public Point getTopLeftPoint() {
        return new Point(topLeftPoint.getX(), topLeftPoint.getY());
    }

    public void setTopLeftPoint(int x, int y) {
        if (x >= 0 && y >= 0) {
            this.topLeftPoint = new Point(x, y);
        } else {
            throw new IllegalArgumentException("Значение должно быть больше нуля");
        }
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
