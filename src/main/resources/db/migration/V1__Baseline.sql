CREATE TABLE inventory
(
    id           SERIAL PRIMARY KEY,
    title        varchar(255) NOT NULL,
    artist       varchar(255) NOT NULL,
    label        varchar(255),
    country      varchar(24),
    year         integer,
    format       varchar(255),
    genre        varchar(255),
    nr_of_tracks integer,
    quantity     integer,
    version      integer      NOT NULL
);