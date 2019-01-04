--create table role (id bigint not null, name varchar(255), primary key (id))
--create table user (id bigint not null, password varchar(255), username varchar(255), primary key (id))
--create table user_role (user_id bigint not null, role_id bigint not null, primary key (user_id, role_id))
--create sequence hibernate_sequence start with 1 increment by 1
--alter table user_role add constraint FKa68196081fvovjhkek5m97n3y foreign key (role_id) references role
--alter table user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references user

insert into role(id,name) values(1,'ROLE_ADMIN');
insert into role(id,name) values(2,'ROLE_USER');
insert into user(id,password,username) values(1,'$2a$10$DL6xXzR3WzGaiJilQOcM1e0Yn.vKi6NunEKHebPidT97wrYEdE7Eu','shailendra');
insert into user(id,password,username) values(2,'$2a$10$DL6xXzR3WzGaiJilQOcM1e0Yn.vKi6NunEKHebPidT97wrYEdE7Eu','Raj');
insert into user_role(user_id,role_id) values(1,1);
insert into user_role(user_id,role_id) values(2,2);
