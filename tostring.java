import java.util.Arrays;

    //for printing actual array
    public class tostring {
        public static void main(String[] args) {
            int[] a = {5,10,7,2,8};
            System.out.println("Original array is: "+ Arrays.toString(a));

        }
    }

//public class copyOf {
//    public static void main(String[] args) {
//        int a[] = {2,4,6,8,10};
//        int[] copyArr = Arrays.copyOf(a, a.length);
//        System.out.println("Copied array: "+Arrays.toString(copyArr));
// }
//}

//public class equal {
//    public static void main(String[] args) {
//        int a[] = {2,4,6};
//        int b[] = {2,4,6};
//        boolean res = Arrays.equals(a,b);
//        System.out.println("Arrays equal: "+res);
// }
//}

//public class fill {
//    public static void main(String[] args) {
//        int a[] = new int[5];
//        Arrays.fill(a,7);
//        System.out.println("Filled array: "+Arrays.toString(a));
// }
//}

//public class sort {
//    public static void main(String[] args) {
//        int[] a = {10,6,4,8,2};
//        Arrays.sort(a);
//        System.out.println("Sorted array: "+Arrays.toString(a));
//    }
//}

//public class mismatch {
//    public static void main(String[] args) {
//        int a[] = {2,4,6,8,10};
//        int b[] = {2,4,6,8,10};
//        int mis = Arrays.mismatch(a,b);
//        System.out.println("mismatch element is: "+mis);
//    }
//}
//if no one element is mismatch answer is -1
//if more than one element is mimatch answer will be first index element of mismatching