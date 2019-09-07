# springboot-dynamic-datasource
## properties 文件配置 

spring.datasource.druid.stat-view-servlet.login-username=admin
spring.datasource.druid.stat-view-servlet.login-password=123456
spring.datasource.dynamic.druid.initial-size=5
spring.datasource.dynamic.druid.min-idle=5
spring.datasource.dynamic.druid.maxActive=20
spring.datasource.dynamic.druid.maxWait=60000
spring.datasource.dynamic.druid.timeBetweenEvictionRunsMillis=60000
spring.datasource.dynamic.druid.minEvictableIdleTimeMillis=300000
spring.datasource.dynamic.druid.validationQuery=SELECT 1 FROM DUAL
spring.datasource.dynamic.druid.testWhileIdle=true
spring.datasource.dynamic.druid.testOnBorrow=false
spring.datasource.dynamic.druid.testOnReturn=false
spring.datasource.dynamic.druid.poolPreparedStatements=true
spring.datasource.dynamic.druid.maxPoolPreparedStatementPerConnectionSize=20
spring.datasource.dynamic.druid.filters=stat,slf4j
spring.datasource.dynamic.druid.connectionProperties=druid.stat.mergeSql\=true;druid.stat.slowSqlMillis\=5000
spring.datasource.dynamic.druid.web-stat-filter.enabled=true
spring.datasource.dynamic.druid.web-stat-filter.url-pattern=/*
spring.datasource.dynamic.druid.web-stat-filter.exclusions=*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*
spring.datasource.dynamic.druid.stat-view-servlet.url-pattern=/druid/*
spring.datasource.dynamic.druid.stat-view-servlet.allow=127.0.0.1,192.168.163.1
spring.datasource.dynamic.druid.stat-view-servlet.deny=192.168.1.73
spring.datasource.dynamic.druid.stat-view-servlet.reset-enable=false
