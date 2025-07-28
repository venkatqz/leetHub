class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        sumofsub(candidates, target, 0, new ArrayList<>(), results);
        return results;
    }

    private void sumofsub(int[] candidates, int remaining, int start, List<Integer> current, List<List<Integer>> results) {
        if (remaining == 0) {
            results.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= remaining) {
                current.add(candidates[i]); 
                sumofsub(candidates, remaining - candidates[i], i, current, results);
                current.remove(current.size() - 1); 
            }
        }
    }
}