package com.bit.motrip.service.tripplan;

import com.bit.motrip.common.Search;
import com.bit.motrip.domain.DailyPlan;
import com.bit.motrip.domain.Place;
import com.bit.motrip.domain.TripPlan;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TripPlanService {

    public List<TripPlan> selectPublicTripPlanList(Search search) throws Exception;
    public List<TripPlan> selectMyTripPlanList(String tripPlanAuthor, Search search) throws Exception;
    public void addTripPlan(TripPlan tripPlan) throws Exception;
    public int getTripPlan() throws Exception;
    public TripPlan selectTripPlan(int tripPlanNo) throws Exception;
    public TripPlan updateTripPlan(TripPlan tripPlan) throws Exception;
    public void deleteTripPlan(int tripPlanNo) throws Exception;
    public void tripPlanPublic(int tripPlanNo) throws Exception;
    public void tripPlanDownloadable(int tripPlanNo) throws Exception;
    public void tripPlanDeleted(int tripPlanNo) throws Exception;
    public void tripPlanCompleted(int tripPlanNo) throws Exception;

}
