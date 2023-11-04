package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectsOfDeveloper = new ArrayList<>();

        for(Map.Entry<String, Set<String>> m : projects.entrySet()){
            if (m.getValue().contains(developer)){
                projectsOfDeveloper.add(m.getKey());
            }
        }
        projectsOfDeveloper.sort((s1, s2) -> {
           int comparingInt = Integer.compare(s2.length(),s1.length());
           if(comparingInt!= 0){
               return comparingInt;
           }
           return s2.compareToIgnoreCase(s1);
        });



        return projectsOfDeveloper;
    }
}
