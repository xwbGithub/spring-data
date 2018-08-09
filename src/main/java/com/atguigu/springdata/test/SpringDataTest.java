package com.atguigu.springdata.test;

import javafx.scene.chart.PieChart;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

import javax.sql.DataSource;
import java.sql.SQLException;

public class SpringDataTest {
    private ApplicationContext ctx = null;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testDatasoiurce() throws SQLException {
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
