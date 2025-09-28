class Solution {
    public boolean isMatch(String s, String p) {
        if(p.isEmpty()) return s.isEmpty();

        boolean isFirst = !s.isEmpty() && (p.charAt(0)=='.' || s.charAt(0)==p.charAt(0));

        if(p.length()>1 && p.charAt(1)=='*'){
            // boolean without = isMatch(s,p.substring(2)); //if no occurence of that number
            // if(without) return true;
            // boolean with = isMatch(s.substring(1),p); //removed 1st occ now will see other
            // return (with && isFirst );
            return isMatch(s,p.substring(2)) || (isFirst && isMatch(s.substring(1),p) ); 
        }else{
            // if no star is found
            return isFirst && isMatch(s.substring(1),p.substring(1));
        }
    }
}

/*
input : 
s : "aabcbcbcaccbcaabc"
p : ".*a*aa*.*b*.c*.*a*"
*/