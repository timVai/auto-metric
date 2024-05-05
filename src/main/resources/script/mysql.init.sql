create database if not exists auto_metric default charset utf8 collate utf8_general_ci;

create user 'amc'@'%' identified by 'amc123456';


grant all privileges on auto_metric.* to 'amc'@'%' identified by 'amc123456';


flush privileges;


show grants for 'amc';