# Simple JOOQ Example with Maven
--------------------------------------------------------------------------------
JOOQ Test with simple database schema

To Run:

```
$ mvn clean package assembly:assembly
$ ./run
```

--------------------------------------------------------------------------------
Database Setup:

All database information is in the `db-setup/` directory. There are three setup
scripts allowing for the creation, deletion, and mock population of the new
database. Here are the steps that should be taken to setup the database (it
assumes the user is using MySQL):

1.) Find DB User that has CREATE permissions or a user that can add tables to
the `test` database built into MariaDB/MySQL.

2.) Run the create table script.

`$ mysql -u user -ppass test < create-tables.sql`

3.) Populate the tables with the test data.

`$ mysql -u user -ppass test < populate-tables.sql`

4.) Verify that the tables were created and populated with mock data.

5.) Run the mvn build and `run` script.

```
$ mvn clean package assembly:assembly
$ ./run
```

--------------------------------------------------------------------------------
Dependencies:

The `run` script simply builds the Java classpath and executes the program.
All dependencies should be packaged in the
`jooqtest-1.0-SNAPSHOT-jar-with-dependencies.jar` if the
`mvn package assembly:assembly` command was run. Using the 
`jooqtest-1.0-SNAPSHOT.jar` file would require the classpath to be updated, in
the `run` script, with the appropriate dependencies.
