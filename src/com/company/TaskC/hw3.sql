create table country(
	id serial primary key,
	full_name varchar not null,
	cod varchar not null,
	population integer not null,
	president varchar not null
);
insert into country (id, full_name, cod, population, president)
values (1, 'Italia', '1122', 60000360, 'Sergo Matarella'),
		(2, 'England', '3344', 55098000, 'Boris Jonson');
		
create table towns(
	id serial primary key,
	full_name varchar not null,
	country integer references country(id),
	leader varchar not null,
	population integer not null
);
insert into towns (id, full_name, country, leader, population)
values (1, 'London', 2, 'Luck Show', 124000),
		(2, 'Rome', 1, 'Nicollo Barella', 122004),
		(3, 'Milan', 1, 'Chiro Immobile', 214509);
		
create table peoples(
	id serial primary key,
	full_name varchar not null,
	date_birtch date not null
);
insert into peoples (id, full_name, date_birtch)
values (1, 'Leo Bonucci', '1989-10-17'),
		(2, 'Ganluinji Buffon', '1983-02-19'),
		(3, 'Marco Asensio', '1997-05-09'),
		(4, 'Gordan Picford', '1993-12-24'),
		(5, 'Trent Arnold', '1999-01-17'),
		(6, 'Filip Ferdinand', '1995-07-30');
		
--------------------------------
	
select sum(population) from towns;


alter table country add language_country varchar(20) null;