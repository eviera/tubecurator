--Insertador
insert into TubeCurator.TubeEntry (id, title, comment, creation_date, url, tagcloud)
select max(id) + 1, 'titulo', 'comentario', now(), 'http://www.youtube.com/embed/M7lc1UVf-VE', 'tag1,tag2' from TubeCurator.TubeEntry;