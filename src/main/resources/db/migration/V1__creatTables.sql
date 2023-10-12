
CREATE TABLE person (
  id UUID NOT NULL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  birth_date date NOT NULL,
  identification_document VARCHAR(255) NOT NULL,
  email VARCHAR(255)
);

CREATE TABLE people_skills (
  id UUID NOT NULL PRIMARY KEY,
  skill_level VARCHAR(255) NOT NULL,
  observation VARCHAR(255) NOT NULL,
  date_skill date NOT NULL
);
CREATE TABLE skill (
  id UUID NOT NULL PRIMARY KEY,
  description VARCHAR(255) NOT NULL,
  observation VARCHAR(255) NOT NULL,
  people_skills_id UUID,
  FOREIGN KEY (people_skills_id) REFERENCES people_skills (id)
);
CREATE TABLE people_skills_person (
  people_skills_id UUID,
  person_id UUID NOT NULL,
  PRIMARY KEY (people_skills_id, person_id),
  FOREIGN KEY (people_skills_id) REFERENCES people_skills (id),
  FOREIGN KEY (person_id) REFERENCES person (id)
);




