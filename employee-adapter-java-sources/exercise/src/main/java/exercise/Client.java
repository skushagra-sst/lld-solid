package exercise;

import java.util.*;

public class Client {
  public static void main(String[] args) {
    // Sample legacy data from three different sources
    List<EmployeeCSV> csvRecords = List.of(
        new EmployeeCSV("101,John,Doe,john.doe@acme.com"),
        new EmployeeCSV("102,Sarah,Lee,sarah.lee@acme.com"));

    List<EmployeeDB> databaseEntries = List.of(
        new EmployeeDB(201, "Ravi", "Kumar", "ravi.kumar@contoso.com"),
        new EmployeeDB(202, "Anita", "Sharma", "anita.sharma@contoso.com"));

    List<EmployeeLDAP> ldapEntries = List.of(
        new EmployeeLDAP(
            Map.of("uid", "301", "givenName", "Pradyut", "sn", "Mangola", "mail", "pradyut@mangolas.com")),
        new EmployeeLDAP(
            Map.of("uid", "302", "givenName", "Manjaari", "sn", "Parkore", "mail",
                "manjaari.parkor@bauth-bolti.hai")));

    List<Employee> unifiedEmployeeList = new ArrayList<>();

    for (EmployeeCSV csvRecord : csvRecords) {
      AdapterCSV csvAdapter = new AdapterCSV();
      csvAdapter.ECSV = csvRecord;
      unifiedEmployeeList.add(csvAdapter);
    }
    for (EmployeeDB dbRecord : databaseEntries) {
      AdapterDB databaseAdapter = new AdapterDB();
      databaseAdapter.EDB = dbRecord;
      unifiedEmployeeList.add(databaseAdapter);
    }
    for (EmployeeLDAP ldapRecord : ldapEntries) {
      AdapterLDAP ldapAdapter = new AdapterLDAP();
      ldapAdapter.ELDAP = ldapRecord;
      unifiedEmployeeList.add(ldapAdapter);
    }

    EmployeePrinter.print(unifiedEmployeeList);
  }
}