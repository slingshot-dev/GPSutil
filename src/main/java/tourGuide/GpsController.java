package tourGuide;

import java.util.List;

import gpsUtil.location.Attraction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import gpsUtil.location.VisitedLocation;
import tourGuide.interfaces.IGpsUtil;


@RestController
public class GpsController {

    private final IGpsUtil gpsUtilService;

    public GpsController(IGpsUtil gpsUtilService) {
        this.gpsUtilService = gpsUtilService;
    }

    @RequestMapping("/getUserLocation")
    public VisitedLocation userId(@RequestParam String userId) {
        return gpsUtilService.getUserLocation(userId);
    }

    @RequestMapping("/getAttractions")
    public List<Attraction> getLocation() {
        return gpsUtilService.getAttractions();
    }

}