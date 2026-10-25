class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int rounds = 0;
        int i = 0;
        while(true){
            if(tickets[k] == 0){
                return rounds;
            }

            if(tickets[i] > 0){
            tickets[i]--;
            rounds++;
            }

            if(tickets.length - 1 == i){
                i = 0;
            }else{
                i++;
            }
        }

        
    }
}