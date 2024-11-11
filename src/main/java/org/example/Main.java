package org.example;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * метод для получения прямоугольника из заданных параметров символа, ширины и длины
 */
public class Main {
    public static void main(String[] args) {
        Param param = getParams();
        getRectangle(param);
    }

    /**
     * метод для получения параметров символа, ширины и длины от пользователя
     * @return экземпляр класса Param  с необходимыми параметрами
     */
    public static Param getParams() {

        String symbol = getSymbol();
        int width = getParamOfWidth();
        int height = getParamOfHeight();
        Param param = new Param(symbol, width, height);
        return param;
    }

    /**
     * метод полученпия параметра символа
     * @return символ для отрисовки прямоугольника
     */
    public static String getSymbol() {
        System.out.println("Enter the symbol:");
        Scanner scan = new Scanner(System.in);
        String symbol = scan.nextLine();
        return symbol;
    }

    /**
     * метод получения параметра ширины от пользователя
     * @return параметр ширины будущего прямоугольника
     */
    public static int getParamOfWidth() {
        System.out.println("Enter the width:");
        Scanner scan1 = new Scanner(System.in);
        int width = scan1.nextInt();
        return width;
    }

    /**
     * метод получения параметра длины от пользователя
     * @return параметр длины будущего прямоугольника
     */
    public static int getParamOfHeight() {
        System.out.println("Enter the height:");
        Scanner scan2 = new Scanner(System.in);
        int height = scan2.nextInt();
        return height;
    }

    /**
     * метод отрисовки прямоугольника
     * @param param-экземпляр класса Param  с полученными от пользователя необходимыми параметрами символа, ширины и длины
     */
    public static void getRectangle(Param param) {
        String symbol = param.getSymbol();
        int width = param.getWidth();
        int height = param.getHeight();
        String horizontalLineOfRectangle = getWidth(symbol, width);
        String verticalLineOfRectangle = getHeight(symbol, width, height);
        System.out.println(horizontalLineOfRectangle + "\n" + verticalLineOfRectangle + "\n" + horizontalLineOfRectangle);
    }

    /**
     * метод получения горизонтальной линии прямоугольника
     * @param symbol - символ
     * @param width - ширина
     * @return строку горизонтальной линии прямоугольника
     */
    public static String getWidth(String symbol, int width) {
        String widthInDisplay = "";
        for (int i = 1; i <= width; i++) {
            widthInDisplay = widthInDisplay + symbol;// получаем строку ширины с наращиванием символов
        }
        return widthInDisplay;
    }

    /**
     * метод получения вертикальной линии прямоугольника
     * @param symbol - символ
     * @param width-ширина
     * @param height - длина
     * @return строку вертикальной линии прямоугольника(совокупность нескольких строк)
     */
    public static String getHeight(String symbol, int width, int height) {
        String hightInDisplay = "";
        String tempWeight = getWidth(symbol, width);
        String stringForHeihgt = getStringForHeihgt(tempWeight, symbol);
        for (int i = 1; i <= (height - 2); i++) {           //цикл для вывода строки для высоты (height-2) количество раз
            hightInDisplay = hightInDisplay + stringForHeihgt;
            if (i != (height - 2)) {
                hightInDisplay = hightInDisplay + "\n";
            }
        }
        return hightInDisplay;
    }

    /**
     * получение одной строки для совокупности строк для вывода длины прямоугольника
     * @param tempWidth-строка ширины
     * @param symbol-символ
     * @return одну строку для совокупности строк длины прямоугольника
     */
    public static String getStringForHeihgt(String tempWidth, String symbol) {
        String cutStringForHeight = tempWidth.substring(1, tempWidth.length() - 1);
        String midWidthWithSpace = cutStringForHeight.replaceAll(symbol, " ");
        String stringForHeihgt = symbol + midWidthWithSpace + symbol;
        return stringForHeihgt;
    }
}
