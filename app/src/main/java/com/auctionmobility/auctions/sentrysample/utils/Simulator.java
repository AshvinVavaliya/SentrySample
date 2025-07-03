package com.auctionmobility.auctions.sentrysample.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simulator {

    public void simulate() {
        System.out.println("Starting user data processing...");
        List<String> userIds = Arrays.asList("user_1", "user_2", "user_3", "user_4");
        Map<String, String> userProfiles = new HashMap<>();
        for (String userId : userIds) {
            userProfiles.put(userId, "Name: User_" + userId.substring(5) + ", Role: Member");
        }
        userProfiles.remove("user_3");
        for (String userId : userProfiles.keySet()) {
            System.out.println("Processing profile for " + userId);
            String profile = userProfiles.get(userId);
            String name = parseName(profile);
            String role = parseRole(profile);

            System.out.println("Name: " + name + ", Role: " + role);
        }

        System.out.println("Finished processing user data.");
    }

    private String parseName(String profile) {
        return profile.split(",")[0].split(":")[1].trim();
    }

    private String parseRole(String profile) {
        return profile.split(",")[1].split(":")[1].trim();
    }
}