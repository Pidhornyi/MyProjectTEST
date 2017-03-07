-- Table: users
CREATE TABLE users (
  id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL
)
  ENGINE = InnoDB;

-- Table: roles
CREATE TABLE roles (
  id   INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL
)
  ENGINE = InnoDB;

-- Table for mapping user and roles: user_roles
CREATE TABLE user_roles (
  user_id INT NOT NULL,
  role_id INT NOT NULL,

  FOREIGN KEY (user_id) REFERENCES users (id),
  FOREIGN KEY (role_id) REFERENCES roles (id),

  UNIQUE (user_id, role_id)
)
  ENGINE = InnoDB;




-- DB for candidate/


-- Table candidate :
CREATE TABLE `candidate` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `key` varchar(255) NOT NULL,
  `true_false` ENUM('true', 'false') NOT NULL DEFAULT 'false',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Table candidate_ansvers :
CREATE TABLE `candidate_ansvers` (
  `id` int(11) NOT NULL,
  `n_question` int(11) NOT NULL,
  `ansvers` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Tests(CRUD) :
-- Table questions :
CREATE TABLE `questions` (
  `n_question` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(255) NOT NULL,
  PRIMARY KEY (`n_question`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Table response_options :
CREATE TABLE `response_options` (
  `n_question` int(11) NOT NULL,
  `response_options` varchar(255) NOT NULL,
  `true_false` ENUM('true', 'false') NOT NULL DEFAULT 'false'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Insert data

INSERT INTO users VALUES (1, 'pidhornyi', '$2a$11$uSXS6rLJ91WjgOHhEGDx..VGs7MkKZV68Lv5r1uwFu7HgtRn3dcXG');

INSERT INTO roles VALUES (1, 'ROLE_USER');
INSERT INTO roles VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_roles VALUES (1, 2);