package tourGuide.services;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.stereotype.Service;
import tourGuide.interfaces.IGpsUtil;

import java.util.List;
import java.util.UUID;

@Service
public class GpsUtilImpl implements IGpsUtil {

    private final GpsUtil gpsUtil = new GpsUtil();


    @Override
    public VisitedLocation getUserLocation(String userId) {
        return gpsUtil.getUserLocation(UUID.fromString(userId));
    }

    @Override
    public List<Attraction> getAttractions() {
        return gpsUtil.getAttractions();
    }
}
