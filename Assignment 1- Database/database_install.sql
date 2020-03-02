CREATE DATABASE IF NOT EXISTS `world_news_corp_cms`;

use world_news_corp_cms;


/*Create Table authors*/
CREATE TABLE IF NOT EXISTS authors (
  NINumber BIGINT UNSIGNED NOT NULL,
  FirstName VARCHAR(255),
  LastName VARCHAR(255),
  Gender Enum('Male', 'Female'),
  Age int(10),
  Salary int,
  Country VARCHAR(200),
  PRIMARY KEY (NINumber)
);

#Data entries for table authors

INSERT INTO `authors`(`NINumber`,`FirstName`, `LastName`, `Gender`, `Age`, 
	`Salary`, `Country`) VALUES
(1987234920,'John', 'Smith', 'Male', 34, 20000, 'England')
;
INSERT INTO `authors`(`NINumber`,`FirstName`, `LastName`, `Gender`, `Age`, 
	`Salary`, `Country`) VALUES
(9348098234,'Tom', 'Potter', 'Male', 32, 32000, 'Scotland');

INSERT INTO `authors`(`NINumber`,`FirstName`, `LastName`, `Gender`, `Age`, 
	`Salary`, `Country`) VALUES
(4564547547,'Jack', 'Kingman', 'Male', 23, 14000, 'India');
INSERT INTO `authors`(`NINumber`,`FirstName`, `LastName`, `Gender`, `Age`, 
	`Salary`, `Country`) VALUES
(5654674575,'Chris', 'Trethick', 'Male', 45, 24000, 'India');
INSERT INTO `authors`(`NINumber`,`FirstName`, `LastName`, `Gender`, `Age`, 
	`Salary`, `Country`) VALUES
(5675675675,'Dave', 'Carter', 'Male', 56, 40000, 'Ireland');
INSERT INTO `authors`(`NINumber`,`FirstName`, `LastName`, `Gender`, `Age`, 
	`Salary`, `Country`) VALUES
(7775656765,'Ian', 'Packwood', 'Male', 33, 19000, 'England');
INSERT INTO `authors`(`NINumber`,`FirstName`, `LastName`, `Gender`, `Age`, 
	`Salary`, `Country`) VALUES
(8964334324,'Lucy', 'Teague', 'Female', 18, 20000, 'America');
INSERT INTO `authors`(`NINumber`,`FirstName`, `LastName`, `Gender`, `Age`, 
	`Salary`, `Country`) VALUES
(6612355667,'Jane', 'Connor', 'Female', 19, 49000, 'France');
INSERT INTO `authors`(`NINumber`,`FirstName`, `LastName`, `Gender`, `Age`, 
	`Salary`, `Country`) VALUES
(3456456457,'Mary', 'Van Schmidt', 'Female', 42, 32000, 'France');
INSERT INTO `authors`(`NINumber`,`FirstName`, `LastName`, `Gender`, `Age`, 
	`Salary`, `Country`) VALUES
(1875432325,'Liz', 'Fogarty', 'Female', 53, 34000, 'America');
INSERT INTO `authors`(`NINumber`,`FirstName`, `LastName`, `Gender`, `Age`, 
	`Salary`, `Country`) VALUES
(1134576877,'Emma', 'Baker', 'Female', 37, 20000, 'England');
INSERT INTO `authors`(`NINumber`,`FirstName`, `LastName`, `Gender`, `Age`, 
	`Salary`, `Country`) VALUES
(2345457654,'Anne', 'Nuttley', 'Female', 43, 34000, 'Indonesia'); 

#Create table for Articles

CREATE TABLE IF NOT EXISTS `Articles` (
  `ArticleID` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `Title` VARCHAR(50),
  `Topic` Enum('Financial','Politics', 'Sport', 'Science', 'Entertainment'),
  `Content` VARCHAR(250),
  `TimePost` timestamp,
  `CountryPost` VARCHAR (50),
  `NewsArticle` BIGINT,
  PRIMARY KEY (ArticleID)

);

#Data entries for table Article

INSERT INTO `Articles`(`ArticleID`, `NewsArticle`, `Title`, `Topic`, `Content`, `TimePost`, `CountryPost`) VALUES (1, 1987234920, 'Europe crackdown on jihadist network', 'Politics', 
	'Police target 17 people in raids in several European countries on suspicion of links to a jihadist network.', now(), 'England'
);

INSERT INTO `Articles`(`ArticleID`, `NewsArticle`, `Title`, `Topic`, `Content`, `TimePost`, `CountryPost`) VALUES (2, 9348098234, 'Modi visit historic opportunity for UK', 'Politics', 
	'Indian prime minister arrives in the UK for a three day visit, described by David Cameron as a historic opportunity for both countries.', now(), 'India'
);

INSERT INTO `Articles`(`ArticleID`, `NewsArticle`, `Title`, `Topic`, `Content`, `TimePost`, `CountryPost`) VALUES(3, 5675675675,'Sweden brings in migrant border checks', 'Politics',
	'Sweden brings in temporary border checks to control the flow of migrants into the country, as an EU Africa summit continues.', Now(), 'Sweden'
);

INSERT INTO `Articles`(`ArticleID`, `NewsArticle`, `Title`, `Topic`, `Content`, `TimePost`, `CountryPost`) VALUES (4, 7775656765, 'Apple apologises after racism outcry', 'Financial',
	'Apple apologises to six schoolboys who were asked to leave one of their shops in Australia, in what the students described as a racist incident.', Now(), 'Australia'
);

INSERT INTO `Articles`(`ArticleID`, `NewsArticle`, `Title`, `Topic`, `Content`, `TimePost`, `CountryPost`) VALUES (5, 1134576877, 'HMRC reveals tax office shake-up', 'Financial',
	'The UKs tax authority will close 137 local offices and replace them with 13 regional centres, raising fears over job losses.', Now(), 'England'
); 

INSERT INTO `Articles`(`ArticleID`, `NewsArticle`, `Title`, `Topic`, `Content`, `TimePost`, `CountryPost`) VALUES (6, 1987234920, 'Film star visits cafe for homeless', 'Entertainment', 
	'Hollywood star George Clooney visits a sandwich shop which helps homeless people during a visit to Edinburgh.', now(), 'Scotland'
);

INSERT INTO `Articles`(`ArticleID`, `NewsArticle`, `Title`, `Topic`, `Content`, `TimePost`, `CountryPost`) VALUES (7, 1134576877, 'Rolls-Royce shares dive on profit woes', 'Financial',
	'Shares in aerospace group RollsRoyce sink after it warns that its profits will be hit by sharply weaker demand.', Now(), 'England'
);

INSERT INTO `Articles`(`ArticleID`, `NewsArticle`, `Title`, `Topic`, `Content`, `TimePost`, `CountryPost`) VALUES (8, 1134576877, 'Ex-MPs GBP13,700 on shredding and skips', 'Politics',
	'The Independent Parliamentary Standards Authority releases expenses claims for 182 MPs who left the Commons at the election - with GBP705,000 spent on closing down their offices.',
	now(), 'England'
);

INSERT INTO `Articles`(`ArticleID`, `NewsArticle`, `Title`, `Topic`, `Content`, `TimePost`, `CountryPost`) VALUES (9, 3456456457, 'Action needed to protect UK coast', 'Science', 
	'The UK is ignoring known risks of flood and erosion at the coast and immediate action is needed to manage the threats, the National Trust warns.', now(), 'England'
);

INSERT INTO `Articles`(`ArticleID`, `NewsArticle`, `Title`, `Topic`, `Content`, `TimePost`, `CountryPost`) VALUES (10, 2345457654, 'Venus twin excites astronomers', 'Science',
	'Astronomers hunting distant worlds say they have made one of their most significant discoveries to date, what could be a kind of hot twin to our Venus.', now(), 'England'

);





#Create Comments table 
CREATE TABLE IF NOT EXISTS `Comments` (
  `CommentID` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `UserName` VARCHAR(25),
  `UserComment` VARCHAR(100),
  `TimeStamp` TimeStamp,
  `has_comment` int,
  PRIMARY KEY (CommentID)
) ENGINE = InnoDB;

#Input data for table Comments

INSERT INTO `Comments`(`CommentID`, `UserName`, `UserComment`, `TimeStamp`, `has_comment`) VALUES (1,'userName01', 'Modi should make a better deal with the David Cameron before return back to India.', now(), 2
  );
INSERT INTO `Comments`(`CommentID`, `UserName`, `UserComment`, `TimeStamp`,`has_comment`) VALUES (2,'Love-Tech', 'What is the actual fuss about him?', now(), 2
  );

INSERT INTO `Comments`(`CommentID`, `UserName`,`UserComment`, `TimeStamp`, `has_comment`) VALUES (3, 'LordHaveMercy', 'What is on earth happening to this world?', 
  now(), 1
  );
INSERT INTO `Comments`(`CommentID`, `UserName`, `UserComment`, `TimeStamp`, `has_comment`) VALUES (4, 'jhonlegend', 'I believe these jihadists get help from someone.', now(), 1
  );
INSERT INTO `Comments`(`CommentID`, `UserName`, `UserComment`, `TimeStamp`, `has_comment`) VALUES (5, 'Md_jb', 'well done to author to bring up current poor state of HMRC.', now(), 5
);


#Create Likes table

CREATE TABLE IF NOT EXISTS `Likes` (
  `LikeID` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `has_like` int,
  `TimeStamp` TimeStamp,
  PRIMARY KEY (LikeID)
) ENGINE = InnoDB;


#input data into the table Likes
INSERT INTO `Likes`(`LikeID`, `has_like`, `TimeStamp`) VALUES(1, 1,Now());
INSERT INTO `Likes`(`LikeID`, `has_like`, `TimeStamp`) VALUES(2, 1,Now());
INSERT INTO `Likes`(`LikeID`, `has_like`, `TimeStamp`) VALUES(3, 9,Now());
INSERT INTO `Likes`(`LikeID`, `has_like`, `TimeStamp`) VALUES(4, 5,Now());
INSERT INTO `Likes`(`LikeID`, `has_like`, `TimeStamp`) VALUES(5, 3,Now());
