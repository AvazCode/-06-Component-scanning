package constructer__injection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Project name: -05-Constructor - injection
 * Author: AvaZ
 * Data: 6/19/2024
 * Time: 8:18 PM
 **/
@Primary
@Component
public class BrokenCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Broken coach workout !";
    }
}
