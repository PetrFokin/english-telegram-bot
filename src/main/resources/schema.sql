create table TEXT (
 ID NUMERIC,
 WORD VARCHAR(1000) NOT NULL,
 TRANSCRIPTION VARCHAR(1000) DEFAULT NULL
);

create sequence text_seq start 1;