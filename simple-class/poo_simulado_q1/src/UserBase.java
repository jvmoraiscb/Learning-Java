package poo_simulado_q1.src;

import java.util.LinkedList;
import java.util.List;

public class UserBase {
    private List<User> users;

    public UserBase(){
        this.users = new LinkedList<>();
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public float getAverageSizeOfTweets(){
        float amount_tweets  = 0;
        float size           = 0;
        for(User u: this.users){
            for(Tweet t: u.getTweets()){
                size += t.getText().length();
                amount_tweets++;
            }
        }

        return size/amount_tweets;
    }
    
    public float getVerifiedUsersPercentage(){
        float amount_users           = this.users.size();
        float amount_verifiedUsers   = 0;
        for(User u: this.users){
            if(u.isVerified())
                amount_verifiedUsers++;
        }

        return (amount_verifiedUsers/amount_users) * 100f;
    }
}
