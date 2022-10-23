public class Main {

    public static void main(String[] args) {
        int counter = 0;

        // write your code here
        for (Secret status:Secret.values()
             )
        {
            String str = status.toString();
            if (str.startsWith("STAR"))
                counter++;
        }


        System.out.println(counter);
    }
}

/*
enum Secret {
    STAR, CRASH, START, // ...
}
*/
