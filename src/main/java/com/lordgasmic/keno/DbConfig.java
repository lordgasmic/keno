package com.lordgasmic.keno;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author nwellman
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", transactionManagerRef = "transactionManager", basePackages = {
        "com.lordgasmic.keno.db.repository" })
public class DbConfig {

    @Autowired
    JpaVendorAdapter jpaVendorAdapter;

    @Autowired
    DataSource dataSource;

    /**
     * @return
     */
    @Bean(name = "entityManager")
    public EntityManager entityManager() {
        return entityManagerFactory().createEntityManager();
    }

    /**
     * @return EntityManagerFactory
     */
    @Primary
    @Bean(name = "entityManagerFactory")
    public EntityManagerFactory entityManagerFactory() {
        final LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        final Properties properties = new Properties();
        properties.setProperty("hibernate.ejb.naming_strategy", "org.hibernate.cfg.ImprovedNamingStrategy");
        properties.setProperty("hibernate.show_sql", "true");
        emf.setJpaProperties(properties);
        emf.setDataSource(dataSource);
        emf.setJpaVendorAdapter(jpaVendorAdapter);
        emf.setPackagesToScan("com.lordgasmic.keno.db.persistence");
        emf.setPersistenceUnitName("default"); // <- giving 'default' as name
        emf.afterPropertiesSet();
        return emf.getObject();
    }

    /**
     * @return PlatformTransactionManager
     */
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager() {
        final JpaTransactionManager tm = new JpaTransactionManager();
        tm.setEntityManagerFactory(entityManagerFactory());
        return tm;
    }
}
