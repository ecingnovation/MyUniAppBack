package com.MyUniApp.MyUniAppBack.Services;

import com.MyUniApp.MyUniAppBack.Model.InterestPoint;

import java.util.List;

public interface MapService {

    List<InterestPoint> getInterestPointsList();

    InterestPoint getInterestPointById(String id);

    InterestPoint createInterestPoint(String description, String title, String label, double lng, double lat);

    InterestPoint updateInterestPoint(String description, String title, String label, double lng, double lat);

}
