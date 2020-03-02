#TASK 4

use world_news_corp_cms;

/*Query 1 */

SELECT
	`Authors`.FirstName,LastName,age
  FROM `authors` 
  WHERE ( `Age` > 0 ) 
  Order by `FirstName`;

  /*Query 2 */

  SELECT
      Round(AVG(age)) as 'Average Age'
    FROM `authors`
    WHERE (`Authors`.Gender = 'Male'); 

 /*Query 3 */
 SELECT
    FirstName, LastName, Salary
   FROM `Authors`
   WHERE salary = (select MAX(salary) from Authors); 

/*Query 4*/ 

SELECT FirstName, LastName
  FROM `Authors`
  WHERE NOT EXISTS( 
  	SELECT *
    FROM `Articles`
    WHERE (`Authors`.NINumber = `Articles`.NewsArticle));


#Query 5

SELECT
    `Articles`.Title, `Articles`.Topic,`Authors`.FirstName, `Authors`.LastName
  FROM `Authors` Join `Articles` ON `Articles`.NewsArticle = `Authors`.NINumber
  WHERE (`Articles`.Content Like ('%George Clooney%') or `Articles`.Content Like ('%David Cameron%')); 


