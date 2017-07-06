INSERT INTO Risks (riskName) VALUES
   ('Employee theft'),
   ('Executive scandal'),
   ('Hackers')
;

INSERT INTO Users (firstname, lastname) VALUES
   ('Jon', 'Catanio'),
   ('Darth', 'Vader')
;

INSERT INTO UserRisks (riskId, userId) VALUES
   (1, 1),
   (2, 1),
   (1, 2),
   (3, 2)
;
