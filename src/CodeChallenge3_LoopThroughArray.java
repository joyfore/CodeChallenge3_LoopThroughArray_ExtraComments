class CodeChallenge3_LoopThroughArray {
    public static void main(String[] args) {

    /*
    Create an array. Print how many indexes (or items) it has.
    String[] Y = {":)", ":|", ":(", ">:("};
    System.out.println(Y[0]);
    System.out.println(Y[1]);
    System.out.println(Y[2]);
    System.out.println(Y[3]);
    */

    /*
    The question is not asking to print the contents of array.
    Use array length method.
    -ok
    Review https://www.w3schools.com/java/java_arrays.asp
    */

        String[] Y = {":)", ":|", ":(", ">:("};
        System.out.println(String.format("The size of array is %d.", Y.length));
    }
}