package com.joncatanio.jooqtest;

import static db.generated.Tables.*;
import static org.jooq.impl.DSL.*;

import java.sql.*;

import org.jooq.*;
import org.jooq.impl.*;

public class App {
   public static void main(String[] args) {
      String userName = "testUser";
      String password = "testpass";
      String url = "jdbc:mariadb://localhost:3306/test";

      try (Connection conn = DriverManager.getConnection(url, userName,
         password)) {

         DSLContext create = DSL.using(conn, SQLDialect.MARIADB);

         Result<Record> result = create.select().from(USERS).fetch();
         System.out.println("----- Simple SELECT -----");
         printResult(result);

         System.out.println("----- Multiple JOIN -----");
         testQuery(create);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void printResult(Result<Record> result) {
      for (Record r : result) {
         Long id = r.getValue(USERS.ID).longValue();
         String firstname = r.getValue(USERS.FIRSTNAME);
         String lastname = r.getValue(USERS.LASTNAME);

         System.out.println("> " + id + " " + firstname + " " + lastname);
      }
   }

   public static void testQuery(DSLContext create) {
      Result<Record> result =
         create.select()
            .from(USERS)
            .join(USERRISKS).on(USERS.ID.eq(USERRISKS.USERID))
            .join(RISKS).on(RISKS.ID.eq(USERRISKS.RISKID))
            .where(RISKS.RISKNAME.eq("Hackers"))
            .fetch();

      for (Record r : result) {
         System.out.println("> " + r.getValue(USERS.FIRSTNAME) + " " +
            r.getValue(USERS.LASTNAME) + " " + r.getValue(RISKS.RISKNAME));
      }
   }
}
