import org.cs4485.IndoorAirMonitorFramework
import java.sql.*
import java.util.Properties

data class AirMonitorData(val temperature: Float,
                          val humidity: Float,
                          val airQuality: Float, {
}

/*
* Class for mySQL querying
* Check out this resource:
*    https://www.tutorialkart.com/kotlin/connect-to-mysql-database-from-kotlin-using-jdbc/
 */

object SQLDatabaseConnection {
    internal var conn: Connection? = null
    internal var username: String
    internal var password: String

    fun mySQLRetrieveQuery {
        /*
        * Code to retrieve information from DB
         */
    }

    fun mySQLInsert {
        /*
        * Code to insert data into the DB
         */
    }

    /*
    * Function to open connection to the DB
    * Needs a hardcoded address of the DB server
     */

    fun getConnection() {
        val connectionProps = Properties()
        connectionProps.put("user", username)
        connectionProps.put("password", password)
        try {
            Class.forName("address of connection").newInstance()
            conn = DriverManager.getConnection(
                "jdbc:" + "mysql" + "://" +
                        "127.0.0.1" +
                        ":" + "3306" + "/" +
                        "",
                connectionProps
            )
        } catch (ex: SQLException) {
            ex.printStackTrace()
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}


