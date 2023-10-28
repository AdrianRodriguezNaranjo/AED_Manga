drop table users;
create table users(
	id int not null auto_increment,
    name varchar(20) not null,
    password varchar(20) not null,
    email varchar(20) not null,
    CONSTRAINT users_pk PRIMARY KEY(id)
);
drop table mangas;
create table mangas(
	id int not null auto_increment,
    name varchar(20) not null,
    CONSTRAINT mangas_pk PRIMARY KEY(id)
);
drop table my_mangas;
create table my_mangas(
	id_user int not null,
    id_manga int not null,
    CONSTRAINT my_mangas_pk PRIMARY KEY(id_user,id_manga),
    CONSTRAINT my_manga_fk1 FOREIGN KEY(id_user)
    REFERENCES users(id) ON DELETE CASCADE ON update CASCADE,
    CONSTRAINT my_manga_fk2 FOREIGN KEY(id_manga)
    REFERENCES mangas(id) ON DELETE CASCADE ON update CASCADE
);
drop table manga_details;
create table manga_details(
	id int not null,
    synopsis varchar(50),   
    chapter int,
    CONSTRAINT mangas_pk PRIMARY KEY(id),
     CONSTRAINT manga_details_fk FOREIGN KEY(id)
    REFERENCES mangas(id) ON DELETE CASCADE ON update CASCADE
);