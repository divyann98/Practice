package Java;

public class Assignment_Q1 {

    //(--X or X--) can be taken as -1
    //(++X or X++) can be taken as 1
    //
    //Input: operations = ["--X","X++","X++"]
    //Output: 1
    public static void main(String[] args) {

        String[] operation = {"--X","X++","X++"};
        int result = 0;
        for (int i = 0; i < operation.length; i++) {

            switch (operation[i].toUpperCase()) {
                case "--X":
                    --result;
                    break;
                case "X--":
                    result--;
                    break;
                case "X++":
                    result++;
                    break;
                case "++X":
                    ++result;
                    break;
            }

        }
        System.out.println(result);
    }
}
