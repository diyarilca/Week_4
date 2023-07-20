
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Player {
    private String isim;
    
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
       return "|||| ID: " + id + " İsim :" + isim + " |||";
       
    }

	@Override
	public int hashCode() {
		return Objects.hash(id, isim);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return id == other.id && Objects.equals(isim, other.isim);
	}

}
public class HashCode_Equals {
    
    public static void main(String[] args) {
        
        
        Set<Player> player_list = new HashSet<Player>();

        Player player1 = new Player("Mustafa",1);
        Player player2 = new Player("Mehmet",10);
        Player player3 = new Player("Emre",6);
        Player player4 = new Player("Mustafa",1);
       
        player_list.add(player1);
        player_list.add(player2);
        player_list.add(player3);
        player_list.add(player4);
        
        for(Player p : player_list) {
        	System.out.println(p);
        }
     
    }
}