import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ua.ucu.edu.task1.*;

public class Task1Test {
    @Test
    public void testFacebookUserAdapter() {
        
        FacebookUser facebookUser = new FacebookUser("new_facebook_user@email.com", "Poland", "2024-12-10T09:30:00");
        FacebookUserAdapter facebookUserAdapter = new FacebookUserAdapter(facebookUser);

        
        assertEquals("new_facebook_user@email.com", facebookUserAdapter.getEmail());
        assertEquals("Poland", facebookUserAdapter.getCountry());
        assertEquals("2024-12-10T09:30:00", facebookUserAdapter.getActiveTime());
    }

    @Test
    public void testTwitterUserAdapter() {
        
        TwitterUser twitterUser = new TwitterUser("new_twitter_user@email.com", "Canada", "2024-12-10T15:45:00");
        TwitterUserAdapter twitterUserAdapter = new TwitterUserAdapter(twitterUser);

        
        assertEquals("new_twitter_user@email.com", twitterUserAdapter.getEmail());
        assertEquals("Canada", twitterUserAdapter.getCountry());
        assertEquals("2024-12-10T15:45:00", twitterUserAdapter.getActiveTime());
    }
}