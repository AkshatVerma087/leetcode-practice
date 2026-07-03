class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1){
            if(flowerbed[0] == 0) n--;

            return (n <= 0) ? true : false;
        }
    
        for(int i = 0; i < flowerbed.length; i++){
            if(n == 0) return true;
            if(i == 0) { 

                if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1; 
                    n--; 
                    System.out.println(i); 
                }

                continue; 
            }
            if(i == flowerbed.length -1) {
                if(flowerbed[i] == 0 && flowerbed[i-1] == 0 ){
                    flowerbed[i] = 1;
                    n--; 
                    System.out.println(i); 
                }
  
                continue;
            }

            if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){flowerbed[i] = 1; System.out.println(i); n--;}
        }

        return (n <= 0) ? true : false;
    }
}