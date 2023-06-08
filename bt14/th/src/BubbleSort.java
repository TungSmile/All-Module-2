public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list){
        boolean needNextPass = true; //? méo hiểu cho vào làm gì;
        for (int i = 1; i < list.length&& needNextPass ; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true; // dùng để check cho vòng lặp sau nếu done thì thôi méo phải chạy
                }
            }
        }
    }
}

