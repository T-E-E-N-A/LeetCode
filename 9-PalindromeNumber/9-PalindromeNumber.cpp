// Last updated: 8/2/2025, 11:57:43 PM
class Solution {
public:
    bool isPalindrome(long long int p) 
    {
        long long int a,s=0;
	    long long int copy=p;
	    while(p>0)
	    {
		    a=p%10;
    		s=10*s+a;
	    	p=p/10;
	    }
	    if(s==copy)
	    return true;
	    else
	    return false;   
    }
};