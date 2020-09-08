create table WORD (
 id NUMERIC,
 word VARCHAR(280) DEFAULT NULL,
 transcription VARCHAR(280) DEFAULT NULL,
 definition VARCHAR(1000) DEFAULT NULL,
 examples VARCHAR(10000) DEFAULT NULL,
 chat_id NUMERIC
);

create sequence word_seq start 1;