class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        // code here
        int i=0;
        int j=0;
        char dir = 'r';
        while(i>=0 && i< mat.length && j>=0 && j<mat[0].length){
            if(mat[i][j]==1){
                mat[i][j] = 0;
                if(dir=='r'){
                    dir = 'd';
                    i++;
                } 
                else if(dir=='d'){
                    dir = 'l';
                    j--;
                }else if(dir == 'l'){
                    dir = 'u';
                    i--;
                }else{
                    dir = 'r';
                    j++;
                }
            }else{
                if(dir=='r'){
                    j++;
                } 
                else if(dir=='d'){
                    i++;
                }else if(dir == 'l'){
                    j--;
                }else{
                    i--;
                }
            }
        }
        if(dir=='r'){
            j--;
        } 
        else if(dir=='d'){
            i--;
        }else if(dir == 'l'){
            j++;
        }else{
            i++;
        }
        return new ArrayList<>(Arrays.asList(i,j));
    }
}