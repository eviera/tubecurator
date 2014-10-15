CREATE TABLE `TubeEntry`
(
   id              decimal(10, 0) not null,
   title           varchar(50) not null,
   comment         varchar(200) null,
   creation_date   date not null,
   url             varchar(200) not null,
   tagcloud        varchar(300) null
);

