Databases
If you already have the database instances on your local or other servers, you can connect to them by changing the
 application.properties data sources.

Otherwise, for testing purposes in the local development, you can use docker and install databases (Mysql and SqlServer)

inside Docker Engine
Install SQL Server DB in docker mode

> docker run --name sqlserver1  -e 'ACCEPT_EULA=Y' -e 'MSSQL_SA_PASSWORD=jEe8BUkAta32sA' -e 'MSSQL_PID=Enterprise' -p 1433:1433 -d microsoft/mssql-server-linux

#create first database name: jpa_test

> docker exec -it sqlserver1 /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P 'jEe8BUkAta32sA' -Q "CREATE DATABASE jpa_test"

Install Mysql Database with docker

> docker run --name  mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql:5.7

#### create database only first time

> docker exec -it mysql bash
mysql -u root -p password -h 127.0.0.1
create database jpa  CHARACTER SET utf8 COLLATE utf8_general_ci;

Build an executable JAR

# build and run application with spring-boot development
> mvn spring-boot:run
# or run jar file as stand alone
> mvn clean package && java -jar target/multidb-0.0.1-SNAPSHOT.jar

TEST REST-APIs

# create a new category

curl -X POST \
  http://localhost:8080/api/category \
  -H 'content-type: application/json' \
  -d '{"name":"category1","description":"description1"}'

#create a new country

curl -X POST \
  http://localhost:8080/api/country \
  -H 'content-type: application/json' \
  -d '{ "name":"camboida", "isoCode":"kh"}'

#get all data

curl -X GET http://localhost:8080/api/all

{
"country":[{"id":1,"name":"camboida","isoCode":"kh"}],
"category"[{"id":1,"name":"category1","description":"description1"}]
}
