class Spreadsheet {
    int[][] grid;
    public Spreadsheet(int rows) {
        grid = new int[rows][26];
    }
    
    public void setCell(String cell, int value) {
        int r = Integer.parseInt(cell.substring(1))-1;
        int col = cell.charAt(0)-'A';
        grid[r][col] = value;
    }
    
    public void resetCell(String cell) {
        int r = Integer.parseInt(cell.substring(1))-1;
        int col = cell.charAt(0)-'A';
        grid[r][col] = 0;
    }
    
    public int getValue(String formula) {
        String[] s = formula.substring(1).split("[+]");
        int val1=0;
        if(s[0].charAt(0)>='A' && s[0].charAt(0)<='Z'){
            val1 = grid[Integer.parseInt(s[0].substring(1))-1][s[0].charAt(0)-'A'];
        }else{
            val1 = Integer.parseInt(s[0]);
        }
        int val2=0;
        if(s[1].charAt(0)>='A' && s[1].charAt(0)<='Z'){
            int row = Integer.parseInt(s[1].substring(1))-1;
            val2 = grid[row][s[1].charAt(0)-'A'];

        }else{
            val2 = Integer.parseInt(s[1]);
        }
        return val1+val2;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */