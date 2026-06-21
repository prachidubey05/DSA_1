class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;

        // Find maximum cost
        for (int cost : costs) {
            maxCost = Math.max(maxCost, cost);
        }

        // Counting sort frequency array
        int[] count = new int[maxCost + 1];

        for (int cost : costs) {
            count[cost]++;
        }

        int bars = 0;

        // Buy from cheapest to costliest
        for (int cost = 1; cost <= maxCost; cost++) {
            while (count[cost] > 0 && coins >= cost) {
                coins -= cost;
                bars++;
                count[cost]--;
            }
        }

        return bars;
    }
}
