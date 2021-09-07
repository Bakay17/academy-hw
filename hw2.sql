create table kind_of_sport(
    id integer primary key,
    name varchar(50) unique not null
);

create table coaches(
    id serial primary key,
    full_name varchar(50) not null,
    phone varchar(20) unique,
    inn varchar(20) unique not null,
    type_of_sport integer references kind_of_sport(id)
);

create table visitors(
	id serial primary key,
	fio varchar(30) not null,
	date_birth date not null,
	sex varchar(30) not null
);

create table client(
	id serial primary key,
	client_time timestamp,
	coaches_id integer references coaches(id)
);


===========================================


insert into kind_of_sport (id, name)
values(1, 'Football');
insert into kind_of_sport (id, name)
values(2, 'Boxing');
insert into kind_of_sport (id, name)
values(3, 'MMA');
select * from kind_of_sport;

insert into coaches (id, full_name, phone, inn, type_of_sport)
values(1, 'Pep Guardiola', '0771541217', '321', 1);
insert into coaches (id, full_name, phone, inn, type_of_sport)
values(2, 'Leonid Sludskiy', '0771541562', '564', 2);
insert into coaches (id, full_name, phone, inn, type_of_sport)
values(3, 'Uliy Nagrlsman', '0775414549', '562', 3);
select * from coaches;

insert into visitors (id, fio, date_birth, sex)
values(1, 'Visitors1', '2003-03-12', 'man'),
		(2, 'Visitors2', '2000-01-17', 'woman'),
		(3, 'Visitors3', '2001-07-07', 'man')
select * from visitors;

insert into client (id, client_time, coaches_id)
values(1, '2021-07-10', 1),
	   (2, '2021-07-08', 2),
	   (3, '2021-07-09', 3)
select * from client;


select v.fio, cl.client_time, kos.name from client cl 
join coaches co on cl.coaches_id = co.id 
join visitors v on cl.id = v.id
join kind_of_sport kos on co.type_of_sport = kos.id 
where kos."name" = 'MMA'
order by cl.client_time desc;
