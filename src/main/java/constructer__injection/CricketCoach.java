package constructer__injection;

import org.springframework.stereotype.Component;

/**
 * Project name: -05-Constructor - injection
 * Author: AvaZ
 * Data: 6/19/2024
 * Time: 7:57 PM
 **/
@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Lest do Practice for 15 minutes !!!! ";
    }
}
