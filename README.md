# Checkers

A online Checkers Game where you will play against a computer AI.

## Setup

Get the project up and running with Eclipse Mars. This project has two separate
applications. One is server side and a REST application that communicates with
the database. The other is client side. They're called "CheckersService" and
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
2. Import `CheckersService` as a new maven project.
3. Add `CheckersClient` to the Tomcat webserver.
4. Add `CheckersService` to the Tomcat webserver.

#### Run

1. Start the Tomcat webserver.
2. Two endpoints should be available from your browser:
  * http://localhost:8080/CheckersService/
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

## Server

### Mac Instructions

The following instructions are for Mac and assume the SSH key (`.pem` file) is saved and populated.

#### Access phpMyAdmin

SSH Tunnel to access phpMyAdmin locally (http://localhost:8888/phpmyadmin):

```sh
ssh  -v -N -L 8888:127.0.0.1:80 -i [`.pem` file path] bitnami@cst438-checkers.bitnamiapp.com
```
*"[`.pem` file path]" will need to be updated to reflect your saved location/file name.

#### Copy New Code to Server

1. Export both CheckersClient and CheckersService as a .war file.
2. Move CheckersClient.war and CheckersService.war to the home directory on the server.
    
    ```sh
    scp -i [.pem file path] [file path]CheckersClient.war bitnami@cst438-checkers.bitnamiapp.com:~/
    scp -i [.pem file path] [file path]CheckersService.war bitnami@cst438-checkers.bitnamiapp.com:~/
    ```
    *Update relative paths for war files & SSH key before running.
3. SSH into the server.
    
    ```sh
    ssh -i [.pem file path] bitnami@cst438-checkers.bitnamiapp.com
    ```
    *Update relative path for SSH key before running.
4. Move the `.war` files into the destination directory. This requires `sudo`, which is why it is not done in step #2.
    
    ```sh
    sudo mv CheckersClient.war ~/stack/apache-tomcat/webapps
    sudo mv CheckersService.war ~/stack/apache-tomcat/webapps
    ```
5. New code should automatically deploy at http://cst438-checkers.bitnamiapp.com/CheckersClient/ and http://cst438-checkers.bitnamiapp.com/CheckersService.
