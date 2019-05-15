import java.util.Scanner;

public class TimGiaTriMax {
    public static void main(String[] args) {
        System.out.println("The application finds the largest value in the array.");
        System.out.println("Tim gia tri lon nhat trong mang.");
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap do dai cua mang: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Do dai cua mang khong vuot qua 20");
            }
        }
        while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " vao mang : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Danh sach phan tu trong mang la : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println();
        System.out.println("Phan tu co gia tri lon nhat cua mang array la: " + max);
        System.out.println("Co vi tri trong mang array la :" + index);


    }
}

