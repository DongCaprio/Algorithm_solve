import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
        for(String player : callings){
            int rank = map.get(player);
            String beforePlayer = players[rank-1];
            players[rank-1] = players[rank];
            players[rank] = beforePlayer;

            map.put(beforePlayer, rank);
            map.put(player, rank-1);

        }
        return players;
    }
}