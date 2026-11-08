class Twitter {

    private static class Tweet {
        int id, time;
        Tweet(int id, int time) { this.id = id; this.time = time; }
    }

    private Map<Integer, List<Tweet>> tweets = new HashMap<>();
    private Map<Integer, Set<Integer>> following = new HashMap<>();
    private int clock = 0;

    public Twitter() {
    }

    public void postTweet(int userId, int tweetId) {
        clock++;
        if (!tweets.containsKey(userId)) {
            tweets.put(userId, new ArrayList<>());
        }
        tweets.get(userId).add(new Tweet(tweetId, clock));
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Tweet> all = new ArrayList<>();

        // 1. my own tweets
        if (tweets.containsKey(userId)) {
            for (Tweet t : tweets.get(userId)) {
                all.add(t);
            }
        }

        // 2. tweets of everyone I follow
        if (following.containsKey(userId)) {
            for (int person : following.get(userId)) {
                if (tweets.containsKey(person)) {
                    for (Tweet t : tweets.get(person)) {
                        all.add(t);
                    }
                }
            }
        }

        // 3. newest first
        all.sort((a, b) -> Integer.compare(b.time, a.time));

        // 4. first 10 ids
        List<Integer> feed = new ArrayList<>();
        int limit = Math.min(10, all.size());
        for (int i = 0; i < limit; i++) {
            feed.add(all.get(i).id);
        }
        return feed;
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) return;
        if (!following.containsKey(followerId)) {
            following.put(followerId, new HashSet<>());
        }
        following.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (following.containsKey(followerId)) {
            following.get(followerId).remove(followeeId);
        }
    }
}