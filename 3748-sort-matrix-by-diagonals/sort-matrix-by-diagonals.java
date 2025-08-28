class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int r=0;
        int c=grid.length-1;

        // according to 1st row
        while(c>0){
            List<Integer> ll = new ArrayList<>();
            int row=0,col=c;
            while(row<grid.length && col<grid.length){
                ll.add(grid[row][col]);
                row++;
                col++;
            }
            row=0;col=c;
            int k=0;
            Collections.sort(ll);
            while(row<grid.length && col<grid.length){
                grid[row][col] = ll.get(k++);
                row++;
                col++;
            }
            c--;
        }

        // according to 1st column
        r=0;c=0;
        while(r<grid.length){
            List<Integer> ll = new ArrayList<>();
            int row=r,col=c;
            while(row<grid.length && col<grid.length){
                ll.add(grid[row][col]);
                row++;
                col++;
            }
            row=r;
            col=c;
            int k=0;
            Collections.sort(ll,Comparator.reverseOrder());
            while(row<grid.length && col<grid.length){
                grid[row][col] = ll.get(k++);
                row++;
                col++;
            }
            r++;
        }
        return grid;
    }
}