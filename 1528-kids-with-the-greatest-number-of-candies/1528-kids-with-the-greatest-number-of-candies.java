class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> boolList = new ArrayList<>();

        int maxValue = Integer.MIN_VALUE;

        for(int i = 0; i<candies.length; i++){

            if(candies[i] > maxValue){

                maxValue = candies[i];
            }
        }

        for(int i=0; i<candies.length;i++){
            if(candies[i] + extraCandies >= maxValue){
                boolList.add(true);
            } else {
                boolList.add(false);
            }
        }
        return boolList;
    }
}