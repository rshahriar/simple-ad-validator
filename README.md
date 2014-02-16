simple-ad-validator
===================

Test project for implementation of a Simple Ad validation server.

Instructions:

To build the project:

mvn clean package install

Now the project has two tests - 

1. StandAloneTest - which runs itself the jetty server and installs the web app into it. Then makes a REST call to check the server response.

mvn -Dtest=StandAloneTest test -DfailIfNoTests=false

2. When the server is run manually, this test can run and check whether the server is sending response correctly.

mvn -Dtest=AdServerManualTest test -DfailIfNoTests=false

To run the server, follow the instructions below:

First open shell on the root folder of the project, then -

cd ad-validator-ws/

Then run the following command - 

mvn jetty:run

Once the server is run, please go to your browser, visit the following URL: 

http://localhost:8080/validate?uuid=fbb77207-193c-47ac-9892-d7d673faa0b4

Database:

Vanilla MySql is used. Along with this project, a test_databaes.sql file is attached which is the mysqldump of the database. In my machine, database password was '1234' (if needed)