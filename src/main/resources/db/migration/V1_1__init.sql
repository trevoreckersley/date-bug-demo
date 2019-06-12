create table dates (
    id int primary key,
    date timestamp
);

insert into dates (id, date) values (1, '2019-06-12 13:57:00'); -- Safe, greater or equal to 1970-01-01T00:00:00
insert into dates (id, date) values (2, '1970-01-01 12:00:00'); -- Safe, greater or equal to 1970-01-01T00:00:00
insert into dates (id, date) values (3, '1970-01-01 00:00:00'); -- Safe, greater or equal to 1970-01-01T00:00:00
insert into dates (id, date) values (4, '1632-05-11 00:00:00'); -- Safe, midnight and less than 1970-01-01T00:00:00
insert into dates (id, date) values (5, '1969-12-31 00:00:00'); -- Safe, midnight and less than 1970-01-01T00:00:00
insert into dates (id, date) values (6, '1969-12-31 00:00:01'); -- Unsafe, not midnight and less than 1970-01-01T00:00:00
insert into dates (id, date) values (7, '1969-12-01 23:59:59'); -- Unsafe, not midnight and less than 1970-01-01T00:00:00
insert into dates (id, date) values (8, '1948-01-10 12:00:00'); -- Unsafe, not midnight and less than 1970-01-01T00:00:00
insert into dates (id, date) values (9, '1840-02-22 17:38:11'); -- Unsafe, not midnight and less than 1970-01-01T00:00:00
insert into dates (id, date) values (10, '0022-03-14 09:55:18'); -- Unsafe, not midnight and less than 1970-01-01T00:00:00
