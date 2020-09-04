package com.microsoft.applicationinsights.internal.util;

import java.util.Map;

import org.apache.http.HttpHost;

public class ProxyUtil {
    private static final String PROXY_HOST_NAME = "AI_PROXY_HOST";
    private static final String PROXY_PORT_NAME = "AI_PROXY_PORT";

    public static HttpHost getProxy() {
        Map<String, String> env = System.getenv();
        if (env.containsKey(PROXY_HOST_NAME) && env.containsKey(PROXY_PORT_NAME))
            return new HttpHost(env.get(PROXY_HOST_NAME), Integer.parseInt(env.get(PROXY_PORT_NAME)));
        else
            return null;
    }
}
