package HW2;

public class Main {
    public static void main(String[] args) {
        int[] arr = HW2.createArray(30);
        System.out.println("Массив: ");
        HW2.printArray(arr);
        HW2.heapSort(arr);
        System.out.println("Отсортированный массив: ");
        HW2.printArray(arr);
    }
}
