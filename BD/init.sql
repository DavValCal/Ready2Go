-- Crear una tabla
CREATE TABLE IF NOT EXISTS Users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    surname VARCHAR(100),
    urlImg VARCHAR(100),
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    passwordValidated BOOLEAN,
    token VARCHAR(100),
    oauthPlatform VARCHAR(100),
    city VARCHAR(100),
    country VARCHAR(100),
    -- userID para referenciar la lista de amigos
    userID INT
);

CREATE TABLE IF NOT EXISTS Permission (
    id SERIAL PRIMARY KEY,
    createPlanning BOOLEAN,
    deletePlanning BOOLEAN,
    addActivity BOOLEAN,
    moveActivity BOOLEAN,
    deleteActivity BOOLEAN,
    addImage BOOLEAN,
    removeImage BOOLEAN,
    seeImages BOOLEAN,
    addTravelers BOOLEAN,
    removeTravelers BOOLEAN,
    -- userID para referenciar al user
    userID INT,
    FOREIGN KEY (userID) REFERENCES Users(id)
);

CREATE TABLE IF NOT EXISTS Tag (
    tagName VARCHAR(50) PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS Activity (
     id SERIAL PRIMARY KEY,
     apiId VARCHAR(100),
     name VARCHAR(100),
     startDate DATE,
     endDate DATE,
     time_unit INT,
     urlImage VARCHAR(100),
     mobileNumber INT,
     price DOUBLE PRECISION,
     tag_id VARCHAR(50),
     FOREIGN KEY (tag_id) REFERENCES Tag(tagName)
);

CREATE TABLE IF NOT EXISTS Travel (
     id SERIAL PRIMARY KEY,
     origin VARCHAR(100),
     destination VARCHAR(100),
     budget DOUBLE PRECISION,
     dateFROM DATE,
     dateTo DATE,
     rating INT,
     comments VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS Expense (
     id SERIAL PRIMARY KEY,
     description VARCHAR(100),
     total DOUBLE PRECISION,
     usuario_id INT,
     travel_id INT,
     FOREIGN KEY (usuario_id) REFERENCES Users(id),
     FOREIGN KEY (travel_id) REFERENCES Travel(id)
);


