public class ArrayCalc {

    public static int length_1 = 4;
    public static int length_2 = 4;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String[][] array = {
                {"1", "1", "1"}, {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}, {"1", "1", "1", "1"}
        };

        System.out.println("Summ all correct elements " + MyWork(array));
    }

    public static int MyWork(String[][] array) {

        int summ = 0;
        if (array.length != length_1)
            GenerateError("Error income array length");

        int index_1 = 0;

        for (String[] a : array) {
            summ += SummElement(a, index_1);
            index_1++;

        }
        return summ;
    }

    public static int ConvertElement(String a, int index_1, int index_2) {
        try {
            return Integer.valueOf(a);
        } catch (Exception e) {

            try {
                throw new MyArrayDataException("Bug income data in " + index_1
                        + " " + index_2);
            } catch (MyArrayDataException e1) {

                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
        return 0;
    }

    public static int SummElement(String[] a, int index_1) {
        if (a.length != length_2)
            GenerateError("Error income array length");

        int summ = 0;
        int index_2 = 0;

        for (String el : a) {
            summ += ConvertElement(el, index_1, index_2);
            index_2++;
        }
        return summ;
    }
    public static void GenerateError(String msg) {

        try {
            throw new MyArraySizeException(msg);

        } catch (MyArraySizeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}