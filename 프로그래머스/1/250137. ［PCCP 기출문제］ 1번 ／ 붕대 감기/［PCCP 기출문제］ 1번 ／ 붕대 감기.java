class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int successStreak = 0, time = bandage[0], secoundPlus = bandage[1], plusPlus = bandage[2], arrIndex = 0, firstHealth = health;
        for(int i=1; i<=attacks[attacks.length-1][0]; i++) {
        	if(attacks[arrIndex][0] == i) { //공격당했을때
        		health -= attacks[arrIndex++][1];
        		successStreak = 0;
        		if(health<=0) return -1;
        		continue;
        	}
        	//회복할때
        	health += secoundPlus; 
        	successStreak++;
        	if(successStreak == time) {
        		health += plusPlus;
        		successStreak = 0;
        	}
        	if(firstHealth < health) health = firstHealth;
        	
        }
        return health;
    }
}