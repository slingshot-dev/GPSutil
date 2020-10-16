package tourGuide.interfaces;

import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;

import java.util.List;
import java.util.UUID;

public interface IGpsUtil {

    VisitedLocation getUserLocation(String userId);

    List<Attraction> getAttractions();

}
