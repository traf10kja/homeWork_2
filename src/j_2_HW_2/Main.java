package j_2_HW_2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"3", "89", "1", "4"},
                {"8", "9", "12", "47"},
                {"13", "33", "61", "5"},
                {"7", "8", "2", "9"}
        };

        try {
            System.out.println(checkArray(arr));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getLine() + " " + e.getColumn());
            System.out.println(arr[e.getLine()][e.getColumn()]);
        }


    }

    static int checkArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4)
                throw new MyArraySizeException();
        }


        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    check += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("cell " + i + " " + j, i, j);
                }

            }

        }
        return check;

    }
}
