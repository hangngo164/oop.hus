package oop.Hw2.ex2;
import java.util.Scanner;
public class NestedLoopsExercise {
    public static void main(String[] args) {
        testSquarePattern();
        testCheckerPattern();
        testTimeTable();
        testTriangularPattern();
        testBoxPattern();
        testHillPattern();
    }

    // SquarePattern
    // Dùng vòng lặp for
    public static void squarePatternUsingFor(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    // Dùng vòng lặp while
    public static void squarePatternUsingWhile(int n) {
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                System.out.print("# ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void testSquarePattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Size must be a positive integer.");
            return;
        }
        System.out.println("Using for-loop:");
        squarePatternUsingFor(size);
        System.out.println("Using while-loop:");
        squarePatternUsingWhile(size);
    }

    // CheckerPattern
    public static void checkerPattern(int n) {
        for (int row = 1; row <= n; row++) {
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void testCheckerPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Size must be positive integer.");
            return;
        }
        checkerPattern(size);
    }

    // TimeTable
    public static void timeTable(int n) {
        // In hàng tiêu đề
        System.out.printf("%4s |", "*");
        for (int col = 1; col <= n; col++) {
            System.out.printf("%4s ", col);
        }
        System.out.println();
        // In dòng phân cách
        System.out.print("-----");
        for (int col = 1; col <= n; col++) {
            System.out.print("-----");
        }
        System.out.println();
        // In nội dung bảng
        for (int row = 1; row <= n; row++) {
            System.out.printf("%4d |", row);
            for (int col = 1; col <= n; col++) {
                System.out.printf("%4d ", row * col);
            }
            System.out.println();
        }
    }

    public static void testTimeTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("The size must be positive integer.");
            return;
        }
        timeTable(size);
    }

    // TriangularPattern
    public static void triangularPatternA(int n) {
        System.out.println("Triangular A: ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularPatternB(int n) {
        System.out.println("Triangular B: ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularPatternC(int n) {
        System.out.println("Triangular C: ");
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print("  ");
            }
            for (int column = row; column <= n; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void triangularPatternD(int n) {
        System.out.println("Triangular D: ");
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n - row - 1; space++) {
                System.out.print("  ");
            }
            for (int column = n - row - 1; column < n; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void testTriangularPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Size must be positive integer.");
            return;
        }
        triangularPatternA(size);
        triangularPatternB(size);
        triangularPatternC(size);
        triangularPatternD(size);

    }
    // BoxPattern

    public static void boxPatternA(int size) {
        System.out.println("Box Pattern A: ");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1) {
                    System.out.print("# ");
                } else if (column == 0 || column == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternB(int size) {
        System.out.println("Box Pattern B: ");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1) {
                    System.out.print("# ");
                } else if (column == row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternC(int size) {
        System.out.println("Box Pattern C: ");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1) {
                    System.out.print("# ");
                } else if (column == size - row - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void boxPatternD(int size) {
        System.out.println("Box Pattern D: ");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1) {
                    System.out.print("# ");
                } else if (column == row || column == size - row - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void testBoxPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Size must be positive integer.");
            return;
        }

        boxPatternA(size);
        boxPatternB(size);
        boxPatternC(size);
        boxPatternD(size);
    }

    // HillPattern
    public static void hillPatternA(int size) {
        System.out.println("Hill Pattern A: ");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                int numberCharsNotEmpty = row * 2 + 1;
                int indexStart = size - row - 1;
                int indexEnd = indexStart + numberCharsNotEmpty - 1;
                System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void hillPatternB(int size) {
        System.out.println("Hill Pattern B: ");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                int numberCharsNotEmpty = size * 2 - 1 - row * 2;
                int indexStart = row;
                int indexEnd = indexStart + numberCharsNotEmpty - 1;
                System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void hillPatternC(int size) {
        System.out.println("Hill Pattern C: ");
        for (int row = 0; row < size * 2 - 1; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                if (row <= size-1) {
                    int numberCharsNotEmpty = row * 2 + 1;
                    int indexStart = size - row - 1;
                    int indexEnd = indexStart + numberCharsNotEmpty - 1;
                    System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
                } else {
                    int numberCharsNotEmpty = size * 2 - 1 - (row - size + 1) * 2;
                    int indexStart = row - size + 1;
                    int indexEnd = indexStart + numberCharsNotEmpty - 1;
                    System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
                }
            }
            System.out.println();
        }
    }
    public static void hillPatternD(int size) {
        System.out.println("Hill Pattern D: ");
        for (int row = 0; row < size * 2 - 1; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                if (row == 0 || row == size * 2 - 2) {
                    System.out.print("# ");
                } else if (row <= size-1) {
                    int numberCharsEmpty = row * 2 - 1;
                    int indexStart = size - row;
                    int indexEnd = indexStart + numberCharsEmpty - 1;
                    System.out.print((column >= indexStart && column <= indexEnd)? "  " : "# ");
                } else {
                    int numberCharsEmpty = 2 * size - 1 - (row - size + 2) * 2;
                    int indexStart = row - size + 2;
                    int indexEnd = indexStart + numberCharsEmpty - 1;
                    System.out.print((column >= indexStart && column <= indexEnd)? "  " : "# ");
                }
            }
            System.out.println();
        }
    }
    public static void testHillPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Size must be positive integer.");
            return;
        }
        hillPatternA(size);
        hillPatternB(size);
        hillPatternC(size);
        hillPatternD(size);
    }
}
