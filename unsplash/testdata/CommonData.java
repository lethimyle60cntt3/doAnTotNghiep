package com.unsplash.testdata;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class CommonData {

    public static final int CONDITION_TIMEOUT = 3;
    public static final int DEFAULT_TIMEOUT = 30;
    public static final int PAGE_LOAD_TIMEOUT = 120;
    public static final int SCRIPT_TIMEOUT = 60;
    public static final String DEFAULT_PASSWORD = "Test@123";


    public static Map<String, String[]> accountInfo = ImmutableMap.<String, String[]>builder()
            .put("LeUser", new String[]{"0979041105", "Lethimyle090900"})
            .build();

    public static Map<String, String[]> paymentCreditCards = ImmutableMap.of(
            "Visa", new String[]{"11111111111111", "8", "2024", "883", "Zen Auto"},
            "Master", new String[]{"222222222222222", "6", "2020", "767", "Zen Auto"}
    );
}
