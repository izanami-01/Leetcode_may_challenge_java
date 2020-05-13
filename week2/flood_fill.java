class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor) return image;
        mainFill(image , sr ,sc ,image[sr][sc],newColor);
        return image;
    }
    
    public void mainFill(int[][] image , int sr, int sc , int colorM , int newColor){
        if( sr<0 || sc<0 || sr>=image.length || sc>=image[0].length||image[sr][sc]!=colorM)
            return;
        
        image[sr][sc] = newColor;
        mainFill(image, sr-1 ,sc, colorM , newColor);
          mainFill(image, sr+1 ,sc, colorM , newColor);
          mainFill(image, sr ,sc-1, colorM , newColor);
          mainFill(image, sr ,sc+1, colorM , newColor);
    }
}