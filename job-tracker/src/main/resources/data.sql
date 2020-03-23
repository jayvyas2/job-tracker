/*
-- Query: SELECT * FROM job_tracker.candidate
LIMIT 0, 10000

-- Date: 2020-03-23 14:43
*/
INSERT INTO `candidate` (`id`,`name`,`phone`,`email`,`resume_link`,`experience`,`degree`,`college`) VALUES (1,'Sam','123456789','sam@gmail.com','jjdendvio.wejbwbfuebe',1,'B.Cs','SPC');
INSERT INTO `candidate` (`id`,`name`,`phone`,`email`,`resume_link`,`experience`,`degree`,`college`) VALUES (2,'Ram','98765433','ram@gmail.com','dhjbdwjbwjk.//adkdu/.jhbeh',2,'B.Tech','NMV');


/*
-- Query: SELECT * FROM job_tracker.company
LIMIT 0, 10000

-- Date: 2020-03-23 14:44
*/
INSERT INTO `company` (`id`,`name`,`description`) VALUES (1,'Bosch','Bosch is an automible company founded in 1990.');

/*
-- Query: SELECT * FROM job_tracker.position
LIMIT 0, 10000

-- Date: 2020-03-23 14:45
*/
INSERT INTO `position` (`id`,`title`,`minimum_experience`,`maximum_experience`,`description`,`minimum_salary`,`maximum_salary`,`number_of_openings`,`company_id`) VALUES (1,'software engineer',1,2,'s e','3L',NULL,2,1);


/*
-- Query: SELECT * FROM job_tracker.interview
LIMIT 0, 10000

-- Date: 2020-03-23 14:43
*/
INSERT INTO `interview` (`id`,`candidate_id`,`date`,`position_id`,`status`,`company_id`) VALUES (1,1,'2020-03-24 10:10:10',1,'scheduled',1);
INSERT INTO `interview` (`id`,`candidate_id`,`date`,`position_id`,`status`,`company_id`) VALUES (2,2,'2020-03-24 11:11:00',1,'completed',1);


/*
-- Query: SELECT * FROM job_tracker.interview_rounds
LIMIT 0, 10000

-- Date: 2020-03-23 14:44
*/
INSERT INTO `interview_rounds` (`id`,`interview_id`,`interviewer_name`,`name`,`feedback`) VALUES (1,1,'Ronak','technical',NULL);
INSERT INTO `interview_rounds` (`id`,`interview_id`,`interviewer_name`,`name`,`feedback`) VALUES (2,2,'Suresh','hr','approved');


/*
-- Query: SELECT * FROM job_tracker.offer
LIMIT 0, 10000

-- Date: 2020-03-23 14:45
*/
INSERT INTO `offer` (`id`,`position_id`,`candidate_id`,`status`,`cost_to_company`) VALUES (1,1,2,'accepted','4L');


