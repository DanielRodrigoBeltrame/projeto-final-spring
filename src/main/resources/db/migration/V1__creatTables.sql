CREATE TABLE people_skills (
  id UUID NOT NULL,
   observation VARCHAR(255) NOT NULL,
   date_skill date NOT NULL,
   person_id UUID,
   CONSTRAINT pk_peopleskills PRIMARY KEY (id)
);

CREATE TABLE person (
  id UUID NOT NULL,
   name VARCHAR(255) NOT NULL,
   birth_date date NOT NULL,
   identification_document VARCHAR(255) NOT NULL,
   email VARCHAR(255),
   CONSTRAINT pk_person PRIMARY KEY (id)
);

CREATE TABLE skill (
  id UUID NOT NULL,
   description VARCHAR(255) NOT NULL,
   observation VARCHAR(255) NOT NULL,
   people_skills_id UUID,
   CONSTRAINT pk_skill PRIMARY KEY (id)
);

ALTER TABLE skill ADD CONSTRAINT FK_SKILL_ON_PEOPLESKILLS FOREIGN KEY (people_skills_id) REFERENCES people_skills (id);
ALTER TABLE people_skills ADD CONSTRAINT FK_PEOPLESKILLS_ON_PERSON FOREIGN KEY (person_id) REFERENCES person (id);
