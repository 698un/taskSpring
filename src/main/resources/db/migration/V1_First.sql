create table hibernate_sequence(
    next_val bigint
) engine=MyISAM;


insert into hibernate_sequence values(1);
insert into hibernate_sequence values(1);

#TABLE OF USERS
CREATE TABLE t_users(
    id BIGINT NOT NULL AUTO_INCREMENT,
    password varchar(64) not null,
    login varchar(64) not null unique,
    PRIMARY KEY (id)
    ) engine=MyISAM;

#TABLE OF TASKS
CREATE TABLE t_tasks(
    id BIGINT NOT NULL AUTO_INCREMENT,
    title varchar(64) not null,
    completed BOOLEAN not NULL,
    PRIMARY KEY (id)
    ) engine=MyISAM;

#TABLE OF ROLES
CREATE TABLE t_roles(
    id BIGINT NOT NULL AUTO_INCREMENT,
    title varchar(100) not null,
    PRIMARY KEY (id)
    ) engine=MyISAM;