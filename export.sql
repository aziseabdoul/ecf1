-- Database: ecf1

-- DROP DATABASE ecf1;

CREATE DATABASE ecf1
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'French_France.1252'
    LC_CTYPE = 'French_France.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

-- Table: public.users

-- DROP TABLE public.users;

CREATE TABLE public.users
(
    id bigint NOT NULL,
    firstname character varying(512) COLLATE pg_catalog."default" NOT NULL,
    lastname character varying(512) COLLATE pg_catalog."default" NOT NULL,
    password character varying(512) COLLATE pg_catalog."default" NOT NULL,
    birthdate date NOT NULL,
    last_known_presence date,
    email character varying(512) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT users_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.users
    OWNER to postgres;

-- Table: public.threads

-- DROP TABLE public.threads;

CREATE TABLE public.threads
(
    id bigint NOT NULL,
    created date,
    owner_id bigint,
    first_message_id bigint,
    CONSTRAINT threads_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.threads
    OWNER to postgres;

-- Table: public.messages

-- DROP TABLE public.messages;

CREATE TABLE public.messages
(
    id bigint NOT NULL,
    modified text COLLATE pg_catalog."default",
    author_id bigint,
    next_message_id bigint,
    CONSTRAINT messages_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.messages
    OWNER to postgres;