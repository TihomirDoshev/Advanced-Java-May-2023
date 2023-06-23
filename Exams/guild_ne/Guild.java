package guild_ne;

import java.util.ArrayList;
import java.util.List;

public class Guild {
    //•	name: String
    //•	capacity: int
    private List<Player> roster;
    private String name;
    private int capacity;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();


    }
    public void addPlayer(Player player){
        if (this.roster.size()< this.capacity){
            this.roster.add(player);



        }
    }
    public boolean removePlayer(String name){
        for (Player element : this.roster) {
            if (element.getName().equals(name)){
                this.roster.remove(element);
                return true;
            }

        }
        return false;
    }
    public void promotePlayer(String name){
        for (Player element : this.roster) {
            if (element.getName().equals(name)){
                if (element.getRank().equals("Trial")){
                    element.setRank("Member");

                }

            }

        }

    }
    public void demotePlayer(String name){
        for (Player element : this.roster) {
            if (element.getName().equals(name)){
                if (element.getRank().equals("Member")){
                    element.setRank("Trial");

                }

            }

        }


    }
    public Player[] kickPlayersByClass(String clazz){
        Player[] names =this.roster.stream().filter(e -> e.getClazz().equals(clazz)).toArray(Player[]::new);
        this.roster.removeIf(element -> element.getClazz().equals(clazz));
        return names;




    }
    public int count(){
        return this.roster.size();
    }
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Players in the guild: %s:",this.name));
        sb.append(System.lineSeparator());
        for (Player element : this.roster) {
            sb.append(element);
            sb.append(System.lineSeparator());

        }
        return sb.toString().trim();
    }


}
