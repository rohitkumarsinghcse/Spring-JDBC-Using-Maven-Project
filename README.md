# Spring-JDBC-Using-Maven-Project
It is a data access technology used for Java database connectivity. It provides methods to query and update data in a database and is oriented toward relational databases. JDBC offers a natural Java interface for working with SQL. JDBC is needed to provide a “pure Java” solution for application development.


# dbcTemplate class
It is the central class in the Spring JDBC support classes. It takes care of creation and release of resources such as creating and closing of connection object etc. So it will not lead to any problem if you forget to close the connection.
It handles the exception and provides the informative exception messages by the help of excepion classes defined in the org.springframework.dao package.
We can perform all the database operations by the help of JdbcTemplate class such as insertion, updation, deletion and retrieval of the data from the database

# DriverManagerDataSource
public class DriverManagerDataSource
extends AbstractDataSource
implements SmartDataSource
Implementation of SmartDataSource that configures a plain old JDBC Driver via bean properties, and returns a new connection every time.

Useful for test or standalone environments outside of a J2EE container, either as a DataSource bean in a respective ApplicationContext, or in conjunction with a simple JNDI environment. Pool-assuming Connection.close() calls will simply close the connection, so any DataSource-aware persistence code should work.

In a J2EE container, it is recommended to use a JNDI DataSource provided by the container. Such a DataSource can be exported as a DataSource bean in an ApplicationContext via JndiObjectFactoryBean, for seamless switching to and from a local DataSource bean like this class.

If you need a "real" connection pool outside of a J2EE container, consider Apache's Jakarta Commons DBCP. Its BasicDataSource is a full connection pool bean, supporting the same basic properties as this class plus specific settings. It can be used as a replacement for an instance of this class just by changing the class name of the bean definition to "org.apache.commons.dbcp.BasicDataSource".

# RowMapper
The org.springframework.jdbc.core.RowMapper<T> interface is used by JdbcTemplate for mapping rows of a ResultSet on a per-row basis. Implementations of this interface perform the actual work of mapping each row to a result object. SQLExceptions if any thrown will be caught and handled by the calling JdbcTemplate.
