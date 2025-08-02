// Last updated: 8/2/2025, 11:56:27 PM
class Solution{
    public void setZeroes(int[][] matrix) {
        boolean col0=false,row0=false;
        for(int i=0 ; i<matrix.length ; i++){
            if(matrix[i][0]==0){
                col0=true;
                break;
            }
        }
        for(int i=0 ; i<matrix[0].length ; i++){
            if(matrix[0][i]==0){
                row0=true;
                break;
            }
        }
        for(int i=1 ; i<matrix.length ; i++){
            for(int j=1 ; j<matrix[0].length ; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1 ; i<matrix.length ; i++){
            if(matrix[i][0]==0){
                // make whole row zero
                for(int j=0 ; j<matrix[0].length ; j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j=0 ; j<matrix[0].length ; j++){
            if(matrix[0][j]==0){
                // make whole col zero
                for(int i=0 ; i<matrix.length ; i++){
                    matrix[i][j]=0;
                }
            }
        }
        if(row0){
            for(int j=0 ;j<matrix[0].length ; j++){
                matrix[0][j] =0;
            }
        }
        if(col0){
            for(int i=0 ;i<matrix.length ; i++){
                matrix[i][0] =0;
            }
        }
    }
}





// memory - 45.9MB beats 16% in memory ans 76%in runtime
// class Solution {
//     public void setZeroes(int[][] matrix) {
//         boolean[] row = new boolean[matrix.length];
//         boolean[] col = new boolean[matrix[0].length];
//         for(int i=0 ; i<matrix.length ; i++){
//             for(int j=0 ; j<matrix[0].length ; j++){
//                 if(matrix[i][j]==0){
//                     // set whole row as well as col=0
//                     col[j]=true;
//                     row[i]=true;
//                 }
//             }
//         }
//         for(int i=0 ; i<row.length ; i++){
//             if(row[i]){
//                 for(int j=0 ; j<matrix[0].length ; j++){
//                     matrix[i][j]=0;
//                 }
//             }
//         }
//         for(int i=0 ; i<col.length ; i++){
//             if(col[i]){
//                 for(int j=0 ; j<matrix.length ; j++){
//                     matrix[j][i]=0;
//                 }
//             }
//         }
//     }
// }

// memory - 46.3MB beats 8.7 in space and 76%in runtime
// class Solution {
//     public void setZeroes(int[][] matrix) {
//         List<Integer> row = new ArrayList<>();
//         List<Integer> col = new ArrayList<>();
//         for(int i=0 ; i<matrix.length ; i++){
//             for(int j=0 ; j<matrix[0].length ; j++){
//                 if(matrix[i][j]==0){
//                     // set whole row as well as col=0
//                     col.add(j);
//                     row.add(i);
//                 }
//             }
//         }
//         for(int i:row){
//             for(int j=0 ; j<matrix[0].length ; j++){
//                 matrix[i][j]=0;
//             }
//         }
//         for(int i:col){
//             for(int j=0 ; j<matrix.length ; j++){
//                 matrix[j][i]=0;
//             }
//         }
//     }
// }