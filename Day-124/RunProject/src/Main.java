import run.Runner;

public class Main {
    
    public static void main(String[] args) {

       Runner runner1 = new Runner();
       runner1.setName("John");
       runner1.setDistance(45.23);

        Runner runner2 = new Runner();
        runner2.setName("King");
        runner2.setDistance(54.23);

        Runner runner3 = new Runner();
        runner3.setName("David");
        runner3.setDistance(49.23);

        String longestRunner = Runner.getLongestRunner();
        System.out.println(longestRunner);

        Runner runner4 = new Runner();
        runner4.setName("Warner");
        runner4.setDistance(78);

        Runner runner5 = new Runner();
        runner5.setName("Rahul");
        runner5.setDistance(89.45);

        String longestRunner1 = Runner.getLongestRunner();
        System.out.println(longestRunner1);

    }
}