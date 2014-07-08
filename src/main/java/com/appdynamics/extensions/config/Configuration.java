package com.appdynamics.extensions.config;


import com.appdynamics.extensions.config.customer.PagerDutyConfig;

public class Configuration {

    private String userAccount;
    private String password;
    private String saasHost;
    private String protocol;
    private String applicationsUrlPath;
    private String healthRuleViolationsUrlPath;
    private String eventsUrlPath;
    private int connectTimeout;
    private int socketTimeout;
    private int durationInMins;

    private PagerDutyConfig pagerDutyConfig;

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getApplicationsUrlPath() {
        return applicationsUrlPath;
    }

    public void setApplicationsUrlPath(String applicationsUrlPath) {
        this.applicationsUrlPath = applicationsUrlPath;
    }

    public String getHealthRuleViolationsUrlPath() {
        return healthRuleViolationsUrlPath;
    }

    public void setHealthRuleViolationsUrlPath(String healthRuleViolationsUrlPath) {
        this.healthRuleViolationsUrlPath = healthRuleViolationsUrlPath;
    }

    public String getEventsUrlPath() {
        return eventsUrlPath;
    }

    public void setEventsUrlPath(String eventsUrlPath) {
        this.eventsUrlPath = eventsUrlPath;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSaasHost() {
        return saasHost;
    }

    public void setSaasHost(String saasHost) {
        this.saasHost = saasHost;
    }

    public PagerDutyConfig getPagerDutyConfig() {
        return pagerDutyConfig;
    }

    public void setPagerDutyConfig(PagerDutyConfig pagerDutyConfig) {
        this.pagerDutyConfig = pagerDutyConfig;
    }

    public int getDurationInMins() {
        return durationInMins;
    }

    public void setDurationInMins(int durationInMins) {
        this.durationInMins = durationInMins;
    }
}
