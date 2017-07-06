CREATE TABLE Risks (
   id       INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
   riskName VARCHAR(128) NOT NULL UNIQUE
);

CREATE TABLE Users (
   id        INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
   firstname VARCHAR(64),
   lastname  VARCHAR(64)
);

CREATE TABLE UserRisks (
   riskId INT UNSIGNED REFERENCES Risks(id),
   userId INT UNSIGNED REFERENCES Users(id)
);

CREATE INDEX UserRisksRIndex ON UserRisks(riskId);
CREATE INDEX UserRisksUIndex ON UserRisks(userId);
