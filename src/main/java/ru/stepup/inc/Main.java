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
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}