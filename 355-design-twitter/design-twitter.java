class Twitter {
    ArrayList<int[]> posts;
    HashMap<Integer , HashSet<Integer>> map;
    public Twitter() {
        posts =new ArrayList<int[]>();
        map = new HashMap< Integer , HashSet<Integer> >();
    }
    
    public void postTweet(int userId, int tweetId) {
        posts.add(new int[]{userId,tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> feed = new ArrayList<>();
        int i=posts.size()-1;
        while(i>=0 && feed.size()<10){
            int[] arr = posts.get(i);
            if(userId==arr[0] || (map.containsKey(userId) && map.get(userId).contains(arr[0]))){
                feed.add(arr[1]);
            }
            i--;
        }
        return feed;
    }
    
    public void follow(int followerId, int followeeId) {
        HashSet<Integer> x = map.getOrDefault(followerId,new HashSet<Integer>());
        x.add(followeeId);
        map.put(followerId , x);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(map.containsKey(followerId)){
            HashSet<Integer> x = map.get(followerId);
            x.remove(followeeId);
            map.put(followerId,x);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */