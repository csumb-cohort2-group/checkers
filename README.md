# Checkers

A online Checkers Game where you will play against a computer AI.

## Setup

Get the project up and running with Eclipse Mars. This project has two separate
applications. One is server side and a REST application that communicates with
the database. The other is client side. They're called "CheckersServer" and
"CheckersClient" for our purposes.

### Installation Requirements

* Java 8
* Tomcat v7 Server

### Instructions

#### MySQL Database

1. Run `db_and_user_setup.xml` script with root priviledges to create the user
 and database for this project. This is optional. To use different databases or
 users, edit `persistence.xml` to match (under
 `/CheckersService/src/main/java/META-INF`).

#### Client & Server

1. Import `CheckersClient` as a new maven project.
2. Import `CheckersServer` as a new maven project.
3. Add `CheckersClient` to the Tomcat webserver.
4. Add `CheckersServer` to the Tomcat webserver.

#### Run

1. Start the Tomcat webserver.
2. Two endpoints should be available from your browser:
  * http://localhost:8080/CheckersServer/
  * http://localhost:8080/CheckersClient/

#### Debugging Setup

* Both projects should be configured to run Java 8:
  1. Right click Properties > Java Compiler > Set "Compiler compliance level" to
   1.8
  2. Right click Properties > Project Facets > ("Details" tab is selected) >
   Select 1.8 for Java version > OK
* Both projects should be configured to run with the Tomcat server. (Right
 click project > Properties > Project Facets > Select "Runtimes" tab >
 Select "Apache Tomcat v7.0" > OK)
