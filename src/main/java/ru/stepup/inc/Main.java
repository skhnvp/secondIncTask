package ru.stepup.inc;

/*
Создайте класс Квадрат (Square). Квадрат описывается следующими характеристиками:

Координата левого верхнего угла по Х: целое число
Координата левого верхнего угла по Y: целое число
Длина стороны: целое число (sideLength)
Создается путем указания координаты x и y левого верхнего угла и размера стороны
Может быть приведен к строке вида “Квадрат в точке T со стороной N”, где N – длина стороны, а T – результат приведения к строке верхнего левого угла (toString)

Состояние квадрата можно изменить в любой момент
Длина стороны обязана быть всегда положительной
Вместо координат X и Y можно (но не обязательно) использовать класс Точка из задачи 1 (точка координат).

Задача считается решенной корректно, если выполняются требования инкапсуляции.
*/


public class Main {
    public static void main(String[] args) {
        Square s = new Square(1,3,5);
        System.out.println(s);

        s.setSideLenght(3);
        System.out.println(s);

        s.setTopLeftPoint(4,5);
        System.out.println(s);

        try {
            s.setTopLeftPoint(-1,-1);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        s.setTopLeftPoint(1,1);
        System.out.println(s);

    }
}