class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
        long vol = (length *1L) *(width * 1L) * (height * 1L);

        boolean h = false;
        boolean b = false;

        if(length>=10000 || width >= 10000 || height >= 10000 || vol>=1000000000L){

            b = true;
        }

        if(mass >= 100){
            h = true;

        }

        
        if(h && b)
            return "Both";
  
        if(h==false && b==false)
            return "Neither";
        
        if(h)
            return "Heavy";
        
        return "Bulky";
        
    }
}
