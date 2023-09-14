public class nestedFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// ------------------------------------
// public class Triangle {
//     public static void main(String[] args) {
//         int rows = 5;
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//     OUTPUT
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

// ____________________________________________
// public class PyramidStarPattern {
//     public static void main(String[] args) {
//         int rows = 5;
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= rows - i; j++) {
//                 System.out.print("  ");
//             }
//             for (int k = 1; k <= 2 * i - 1; k++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// OUTPUT
//         * 
//       * * * 
//     * * * * * 
//   * * * * * * * 
// * * * * * * * * * 
