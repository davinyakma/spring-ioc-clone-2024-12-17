package com.programmers.framework.ioc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ApplicationContextTest {
    private static ApplicationContext applicationContext;

    @BeforeAll
    public static void beforeAll() {
        applicationContext = new ApplicationContext("com.programmers");
        applicationContext.init();
    }

    @Test
    @DisplayName("ApplicationContext 객체 생성")
    public void t1() {
        System.out.println(applicationContext);
    }

    @Test
    @DisplayName("testPostService 빈 얻기")
    public void t2() {
        TestPostService testPostService = applicationContext
                .genBean("testPostService");

        assertThat(testPostService).isNotNull();
    }
}