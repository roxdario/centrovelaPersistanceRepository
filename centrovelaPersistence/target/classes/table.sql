
create table roles (
	id bigint NOT NULL AUTO_INCREMENT, 
	label VARCHAR(50),
	description VARCHAR(2000),
	level int,
	primary key(id),
	CONSTRAINT level UNIQUE (level)
);

create table users (
	id bigint primary key auto_increment,
	code VARCHAR(16) not null,
	email VARCHAR(100) not null,
	password varchar(100),
	role int,
	firstname VARCHAR(50) ,
	lastname VARCHAR(50) ,
	regdate date,
	phone int ,
	domicilecity varchar(100),
	domicilestreetname varchar(100),
	domicilehousenumber varchar(100),
	cap int ,
	dateofbirth date ,
	placeofbirth VARCHAR(50) ,
	medicalvisit VARCHAR(50) DEFAULT 'undeliverd' check (medical_visit in ('valid', 'expired', 'undelivered')),
	note VARCHAR(500),
	type VARCHAR(50)  DEFAULT 'adult' CHECK (tipo IN ('adult','children','staff')),
	firstnameoftutor VARCHAR(50),
	lastnameoftutor VARCHAR(50),
	CONSTRAINT uniqueFC UNIQUE (code),
	foreign key (role) references roles(level)
);




create table courses (
	id bigint primary key auto_increment,
	duration VARCHAR(50) ,
	price int ,
	avaiableplaces int,
	totalplaces int ,
	description VARCHAR(500), 
	level VARCHAR(50) DEFAULT 'basic' CHECK (level IN ('basic','intermediate','advanced')),
	type VARCHAR(50)  CHECK (type IN ('settimanali_diurni','corso_crociera','prova_vela', 'settimana_azzurra')),
	starttime date ,
	endtime date 
);

create table reservation (
	id bigint primary key auto_increment,
	courseid bigint not null,
	userid bigint  not null,
	starttime date ,
	endtime date ,
	paymentstatus VARCHAR(50) not null DEFAULT 'payed' check(payment_status in ('payed','not_payed')),
	level VARCHAR(50) DEFAULT 'basic' CHECK (level IN ('basic','intermediate','advanced')),
	type VARCHAR(50)  CHECK (type IN ('settimanali_diurni','corso_crociera','prova_vela', 'settimana_azzurra')),
	foreign key (courseid) references courses(id) ,
	foreign key (userid) references users(id) 
);

create table request (
	id bigint primary key auto_increment,
	courseid bigint not null,
	userid bigint  not null,
	starttime date ,
	endtime date ,
	description VARCHAR(2000),
	status VARCHAR(100),
	foreign key (courseid) references courses(id) ,
	foreign key (userid) references users(id) 
);