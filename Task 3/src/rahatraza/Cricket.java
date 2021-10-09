/*
Name- Md.Rahat Miah Raza
ID-2012020058
Section-B
E-mail- cse_2012020058@lus.ac.bd
Date- 10 September 2021.
*/
package rahatraza;

public class Cricket extends Sports {
    String matchType;
    int over;
    Player player;

    Cricket( String matchType, int over,Player player)
    {
        this.matchType=matchType;
        this.over=over;
        this.player=player;

    }
    void display()
    {
        System.out.println("Match Type: "+matchType);
        System.out.println("Over of the match: "+over);
        System.out.println("Name of a player: "+player.playerName);
        System.out.println("Jersey number of a player: "+player.jerseyNumber);

    }

}
