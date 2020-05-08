package week2;

public class Straight_Line {
     
        public static boolean checkStraightLine(int[][] coordinates) {
            int [] pt1 = coordinates[1];
            int [] pt2 = coordinates[0];
            float mslope = findslope(pt1 , pt2);

            for(int i = 1; i<coordinates.length;i++){
                int [] p1 = coordinates[i];
                int [] p2 = coordinates[0];
                float fslope = findslope(p1,p2);
                if(mslope!=fslope)return false;
            }
            
            return true;
        }

        public static float findslope(int [] coordinate1 , int [] coordinate2){
            if(coordinate1[0]-coordinate2[0]==0)return 0;
            return (float)(coordinate2[1]-coordinate1[1])/(coordinate2[0]-coordinate1[0]);
        }
        public static void main(String args[]){
            int [][] arr = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
            checkStraightLine(arr);
        }
}