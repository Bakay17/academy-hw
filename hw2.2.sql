
create table group_students(
	id serial primary key,
	faculty_id integer references facultyes(id),
	cod varchar unique not null
);
insert into group_students (id, faculty_id, cod)
values (1, 2, '11223344'),
		(2, 1, '898765');

create table students(
	id serial primary key,
	fio varchar not null,
	group_id integer references group_students(id),
	date_birth date not null
);
insert into students (id, fio, group_id, date_birth)
values (1, 'Bakai Brdibekov', 2, '2002-01-17'),
		(2, 'Aruuke Nazarbaeva', 1, '2003-08-05');

create table facultyes(
	id serial primary key,
	fac_name varchar not null,
	univer integer references universitet(id)
);
insert into facultyes (id, fac_name, univer) values (1, 'Turism', 2), (2, 'Injeneriya', 1);

create table universitet(
	id serial primary key,
	univer_name varchar not null
);
insert into universitet (id, univer_name) values (1, 'Ala-Too'), (2, 'Manas');

create table subjects(
	id serial primary key,
	sub_name varchar not null
);
insert into subjects (id, sub_name)
values (1, 'Arihmetica'),
		(2, 'Manasovidenie');

create table appraisals(
	id integer references students(id),
	upai integer not null,
	subjects_app integer references subjects(id)
);
insert into appraisals (id, upai, subjects_app)
values (1, 88, 2),
		(2, 90, 1);

===========================================================
<-- Здесь все выводится
select s.fio, sub.sub_name, app.upai from appraisals app 
join subjects sub on app.subjects_app = sub.id 
join students s on app.id = s.id 
where s.fio = 'Aruuke Nazarbaeva'

<-- А тут нет
select s.fio, sub.sub_name, app.upai from appraisals app 
join subjects sub on app.subjects_app = sub.id 
join students s on app.id = s.id 
where s.fio = 'Bakai Berdibekov'

<-- Здесь все выводится 
select s.fio, gs.cod, f.fac_name, u.univer_name, sub.sub_name, app.upai from students s 
join appraisals app on s.id = app.id 
join group_students gs on s.group_id = gs.id 
join facultyes f on gs.faculty_id = f.id 
join universitet u on f.univer = u.id 
join subjects sub on app.subjects_app = sub.id 
where s.fio = 'Aruuke Nazarbaeva'
group by s.fio, gs.cod, f.fac_name, sub.sub_name, app.upai, u.univer_name


<-- А тут нет
select s.fio, gs.cod, f.fac_name, u.univer_name, sub.sub_name, app.upai from students s 
join appraisals app on s.id = app.id 
join group_students gs on s.group_id = gs.id 
join facultyes f on gs.faculty_id = f.id 
join universitet u on f.univer = u.id 
join subjects sub on app.subjects_app = sub.id 
where s.fio = 'Bakai Berdibekov'
group by s.fio, gs.cod, f.fac_name, sub.sub_name, app.upai, u.univer_name




