/*
 * FileName: CeSettingsCache.java
 * Author  : Ajimon
 * 
 * Using JRE 1.8.0_211
 * 
 * Copyright(c) 2020 Finance.
 * Duplication or distribution of this code in part or in whole by any media
 * without the express written permission of Finance or its agents is
 * strictly prohibited.
 *  
 * REVISION         DATE        NAME       DESCRIPTION
 * 511.101       2 Jan, 2020       Ajimon      Initial Code  
 */
package com.Test.util;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The Class CeSettingsCache.
 */
@Component
public class CeSettingsCache {

    /** The group settings. */
    private ConcurrentHashMap<String, HashMap<String, String>> groupSettings = new ConcurrentHashMap<>();

    /**
     * Gets the ce settings.
     *
     * @param groupName the group name
     * @return the ce settings
     */
    @Cacheable(value = "ceSettings", key = "#groupName", unless = "#result == null")

    public Map<String, String> getCeSettings(String groupName) {
        return groupSettings.get(groupName);
    }

    /**
     * Save ce settings.
     *
     * @param groupName the group name
     * @param settings the settings
     * @return the map
     */
    @CachePut(value = "ceSettings", key = "#groupName")
    public Map<String, String> saveCeSettings(String groupName, HashMap<String, String> settings) {
        groupSettings.put(groupName, settings);
        return settings;
    }

    /**
     * Delete ce settings.
     *
     * @param groupName the group name
     */
    @CacheEvict(value = "ceSettings", key = "#groupName")
    public void deleteCeSettings(String groupName) {
        groupSettings.remove(groupName);
    }

}
