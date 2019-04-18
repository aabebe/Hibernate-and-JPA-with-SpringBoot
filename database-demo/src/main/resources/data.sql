create table person
(
    id integer not null,
    name varchar (255) not null,
    location varchar (255),
    birth_date timestamp,
    primary key (id)
);

insert into PERSON (ID,NAME,LOCATION,BIRTH_DATE )
VALUES(1001,'Ranga','Hyderabad',sysdate());
insert into PERSON (ID,NAME,LOCATION,BIRTH_DATE )
VALUES(1002,'Andualem','Columbus',sysdate());
insert into PERSON (ID,NAME,LOCATION,BIRTH_DATE )
VALUES(1003,'Sebli','Columbus',sysdate());
insert into PERSON (ID,NAME,LOCATION,BIRTH_DATE )
VALUES(1004,'Peter','Amsterdam',sysdate());