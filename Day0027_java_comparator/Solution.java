/* java comparator
 Comparators are used to compare two objects. 
 you'll create a comparator and use it to sort an array.
Input Format

Input from stdin is handled by the locked stub code in the Solution class.

The first line contains an integer,n , denoting the number of players.
Each of the  subsequent n lines contains a player's name and score, respectively.

*/
import java.util.*;
class Checker implements Comparator<Player> {
    public int compare(Player p1, Player p2) {
        return p1.score != p2.score ? (p2.score - p1.score) : p1.name.compareTo(p2.name);
    }
}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}