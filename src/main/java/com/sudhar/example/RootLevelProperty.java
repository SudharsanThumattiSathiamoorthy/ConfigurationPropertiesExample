package com.sudhar.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@PropertySource("classpath:application.yml")
@Component
public class RootLevelProperty {

    private int refreshTime;

    private int minTime;

    private int maxTime;


    public int getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(int refreshTime) {
        this.refreshTime = refreshTime;
    }

    public int getMinTime() {
        return minTime;
    }

    public void setMinTime(int minTime) {
        this.minTime = minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RootLevelProperty that = (RootLevelProperty) o;

        if (refreshTime != that.refreshTime) return false;
        if (minTime != that.minTime) return false;
        return maxTime == that.maxTime;
    }

    @Override
    public int hashCode() {
        int result = refreshTime;
        result = 31 * result + minTime;
        result = 31 * result + maxTime;
        return result;
    }

    @Override
    public String toString() {
        return "RootLevelProperty{" +
                "refreshTime=" + refreshTime +
                ", minTime=" + minTime +
                ", maxTime=" + maxTime +
                '}';
    }
}
