import java.util.ArrayList;

public class PracticeProblem {
    public static String[] towerOfHanoi(int disks) {
        ArrayList<String> moves = new ArrayList<>();
        hanoi(disks, 'L', 'R', 'M', moves);

        String[] result = new String[moves.size()];
        for (int i = 0; i < moves.size(); i++) {
            result[i] = moves.get(i);
        }
        return result;
    }
    private static void hanoi(int n, char from, char to, char aux, ArrayList<String> moves) {
        if (n == 0) return;
        hanoi(n - 1, from, aux, to, moves);
        moves.add("" + from + to);
        hanoi(n - 1, aux, to, from, moves);
    }
}