package com.test.config;


import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.io.IOException;

@EnableAspectJAutoProxy
@ComponentScans({
        @ComponentScan("com.test.service")

})
@Configuration
@MapperScan("com.test.mapper")
public class MainConfiguration {

//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate() throws IOException {
//        SqlSessionTemplate template = new SqlSessionTemplate(new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")));
//        return template;
//    }

        @Bean
    public DataSource dataSource() {
//        PooledDataSource dataSource = new PooledDataSource();
//        dataSource.setDriver("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://10.2.14.249:33406/zdb");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root@!^*");
//        return dataSource;

        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://10.2.14.249:33406/zdb");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("root@!^*");
        return dataSource;
    }



    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Autowired DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

}
