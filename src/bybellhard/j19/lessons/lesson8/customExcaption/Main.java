/*package bybellhard.j19.lessons.lesson8.customExcaption;

public class Main {
    public static void main(String[] args) {
        try{
            printPositiveInt(-5);
        }catch (IllegalAccessException e){
            System.err.println(e.getMessage());
        }
        printPositiveInt(-4);
    }
    private static void printPositiveInt(int value){
        if (value < 0)
                throw new IllegalArgumentException(value);
        System.out.println();

    }
}
*\