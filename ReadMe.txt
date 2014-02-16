

mvn clean package install

mvn -Dtest=AdServerManualTest test -DfailIfNoTests=false

mvn -Dtest=StandAloneTest test -DfailIfNoTests=false

cd ad-validator-ws/

mvn jetty:run

http://localhost:8080/validate?uuid=fbb77207-193c-47ac-9892-d7d673faa0b4