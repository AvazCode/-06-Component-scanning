package constructer__injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name: -05-Constructor - injection
 * Author: AvaZ
 * Data: 6/19/2024
 * Time: 8:00 PM
 **/
@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(Coach coach) {
        myCoach = coach;
    }

    @GetMapping("/getDailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
