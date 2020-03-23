

**Introduction**

This is a job-tracker service which allows candidate to see their upcoming, past, completed and missed interviews.

**Prerequisites**
 1. Java 8
 2. Maven
 3. MySQL

**Setup and Run**
 1. Clone the repository: `git clone https://github.com/jayvyas2/job-tracker.git`
 2. In MySQL, create a database named `job_tracker` and run `schema.sql` and `data.sql` to populate dummy values in database.
 3.  Application uses MySQL running on default 3306 port and `root/root` as username/password respectively
 4. `cd job-tracker`
 5. `mvn clean install`
 6. `cd target`
 7. `java -jar <job-tracker-1.0.0-SNAPSHOT.jar>`
 
 
 Alternatively, this java application can be configured and run in any popular IDE like IntelliJ or Eclipse.

**API Endpoints**
`GET http://localhost:9090/job-tracker/candidate/<id>/interview?status=<status>`

Possible value of statuses: `scheduled,on_going,completed,missed`

Examples: http://localhost:9090/job-tracker/candidate/1/interview?status=scheduled

http://localhost:9090/job-tracker/candidate/1/interview?status=on_going

http://localhost:9090/job-tracker/candidate/1/interview?status=completed

http://localhost:9090/job-tracker/candidate/1/interview?status=missed

Swagger integration is also present. Swagger ui can be accessed at [this link](http://localhost:9090/swagger-ui.html#!/interview-controller/getInterviewForCandidateUsingGET)

Response example :- 
`[{
	"id": 1,
	"company_id": 1,
	"comapany_name": "Bosch",
	"position_id": 1,
	"position_name": "software engineer",
	"date": "2020-03-24",
	"status": "scheduled",
	"round_status": "technical"
}]`

Response structure can be found at: `job-tracker/src/main/java/com/track/dto/InterviewDto.java` 
