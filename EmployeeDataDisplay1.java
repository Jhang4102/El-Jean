/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee.data.display.pkg1;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

class AttendanceRecord {
    private Date timeIn;
    private Date timeOut;
    
    public AttendanceRecord(Date timeIn, Date timeOut) {
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }
    
    public Date getTimeIn() {
        return timeIn;
    }
    
    public Date getTimeOut() {
        return timeOut;
    }
}

class Employee {
    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String sssNumber;
    private String philhealthNumber;
    private String tinNumber;
    private String pagibigNumber;
    private String status;
    private String position;
    private String immediateSupervisor;
    private double basicSalary;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;
    private double grossSemiMonthlyRate;
    private double hourlyRate;
    private List<AttendanceRecord> attendanceRecords;
    double getBasicSalary;
    
    public Employee(int employeeNumber, String lastName, String firstName, String birthday, String address, String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, String pagibigNumber, String status, String position, String immediateSupervisor, double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance, double grossSemiMonthlyRate, double hourlyRate) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sssNumber = sssNumber;
        this.philhealthNumber = philhealthNumber;
        this.tinNumber = tinNumber;
        this.pagibigNumber = pagibigNumber;
        this.status = status;
        this.position = position;
        this.immediateSupervisor = immediateSupervisor;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
        this.hourlyRate = hourlyRate;
        this.attendanceRecords = new ArrayList<>();
    }
    
    //Getters for employee information
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getBirthday() {
        return birthday;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getSssNumber() {
        return sssNumber;
    }
    
    public String getPhilhealthNumber() {
        return philhealthNumber;
    }
    
    public String getTinNumber() {
        return tinNumber;
    }
    
    public String getPagibigNumber() {
        return pagibigNumber;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String getPosition() {
        return position;
    }
    
    public String getImmediateSupervisor() {
        return immediateSupervisor;
    }
    
    public double getBasicSalary() {
        return basicSalary;
    }
    
    public double getRiceSubsidy() {
        return riceSubsidy;
    }
    
    public double getPhoneAllowance() {
        return phoneAllowance;
    }
    
    public double getClothingAllowance() {
        return clothingAllowance;
    }
    
    public double getGrossSemiMonthlyRate() {
        return grossSemiMonthlyRate;
    }
    
    public double getHourlyRate() {
        return hourlyRate;
    }
    
   public List<AttendanceRecord> getAttendanceRecords() {
       return attendanceRecords;
   }
   
   public void addAttendanceRecord(AttendanceRecord attendanceRecord) {
       
       attendanceRecords.add(attendanceRecord);
   }
} 

public class EmployeeDataDisplay1 {
    public static void main(String[] args){
        //Create a HashMap to store the employee data
        Map<Integer, Employee> employeeData = new HashMap<>();
        
        //Add employee data to the HashMap
        employeeData.put(1, new Employee(1, "Garcia", "Manuel III", "10/11/1983", "Valero Carpark Building Valero Street 1227, Makati City", "966-860-270", "44-4506057-3", "820126853951", "442-605-657-000", "691295330870", "Regular", "Chief Executive Officer", "N/A", 90000, 1500, 2000, 1000, 45000, 535.71));
        employeeData.put(2, new Employee(2, "Lim", "Antonio", "06/19/1988", "San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite", "171-867-411", "52-2061274-9", "331735646338", "683-102-776-000", "663904995411", "Regular", "Chief Operating Officer", "Garcia, Manuel III", 60000, 1500, 2000, 1000, 30000, 357.14));
        employeeData.put(3, new Employee(3, "Aquino", "Biance Sofia", "08/04/1989", "Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City", "966-889-370", "30-8870406-2", "177451189665", "971-711-280-000", "171519773969", "Regular", "Chief Finance Officer", "Garcia, Manuel III", 60000, 1500, 2000, 1000, 30000, 357.14));
        employeeData.put(4, new Employee(4, "Reyes", "Isabella", "06/16/1994", "460 Solanda Street Intramuros 1000, Manila", "786-868-477", "40-2511815-0", "341911411254", "876-809-437-000", "416946776041", "Regular", "Chief Marketing Officer", "Garcia, Manuel III", 60000, 1500, 2000, 1000, 30000, 357.14));
        employeeData.put(5, new Employee(5, "Hernandez", "Eduard", "09/23/1989", "National Highway, Gingoog, Misamis Occidental", "088-861-012", "50-5577638-1", "957436191812", "031-702-374-000", "952347222457", "Regular", "IT Operations and Systems", "Lim, Antonio", 52670, 1500, 1000, 1000, 26335, 313.51));
        employeeData.put(6, new Employee(6, "Villanuea", "Andrea Mae", "02/14/1988", "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands", "918-621-603", "49-1632020-8", "382189453145", "317-674-022-000", "441093369646", "Regular", "HR Manager", "Lim, Antonio", 52670, 1500, 1000, 1000, 26335, 313.51));
        employeeData.put(7, new Employee(7, "San Jose", "Brad", "03/15/1996", "99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi", "797-009-261", "40-2400714-1", "239192926939", "672-474-690-000", "210850209964", "Regular", "HR Team Leader", "Villanueva, Andrea Mae", 42975, 1500, 800, 800, 21488, 255.80));
        employeeData.put(8, new Employee(8, "Romualdez", "Alice", "05/14/1992", "12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte", "983-606-799", "55-4476527-2", "545652640232", "888-572294-000", "211385556888", "Regular", "HR Rank and File", "San Jose, Brad", 22500, 1500, 500, 500, 11250, 133.93));
        employeeData.put(9, new Employee(9, "Atienza", "Rosie", "09/24/1948", "90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte", "266-036-427", "41-0644692-3", "708988234853", "604-997-793-000", "260107732354", "Regular", "HR Rank and File", "San Jose, Brad", 22500, 1500, 500, 500, 11250, 133.93));
        employeeData.put(10, new Employee(10, "Alvaro", "Roderick", "03/30/1988", "#284 T. Morato corner, Scout Rallos Street, Quezon City", "053-381-386", "64-7605054-4", "578114853194", "525-420-419-000", "799254095212", "Regular", "Accounting Head", "Aquino, Biance Sofia", 52670, 1500, 1000, 1000, 26335, 313.51));
        employeeData.put(11, new Employee(11, "Salcedo", "Anthony", "09/14/1993", "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate", "070-766-300", "26-9647608-3", "126445315651", "210-805-911-000", "218002473454", "Regular", "Payroll Manager", "Alvaro, Roderick", 50825, 1500, 1000, 1000, 25413, 302.53));
        employeeData.put(12, new Employee(12, "Lopez", "Josie", "01/14/1987", "49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro", "478-355-427", "44-8563448-3", "431709011012", "218-489-737-000", "113071293354", "Regular", "Payroll Team Leader", "Salcedo, Anthony", 38475, 1500, 800, 800, 19238, 229.02));
        employeeData.put(13, new Employee(13, "Farala", "Martha", "01/11/1942", "42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte", "329-034-366", "45-5656375-0", "233693897247", "210-835-851-000", "631130283546", "Regular", "Payroll Rank and File", "Salcedo, Anthony", 24000, 1500, 500, 500, 12000, 142.86));
        employeeData.put(14, new Employee(14, "Martinez", "Leila", "07/11/1970", "37/46 Kulas Roads, Maragondon 0962 Quirino", "877-110-749", "27-2090996-4", "515741057496", "275-792-513-000", "101205445886", "Regular", "Payroll Rank and File", "Salcedo, Anthony", 24000, 1500, 500, 500, 12000, 142.86));
        employeeData.put(15, new Employee(15, "Romualdez", "Fredrick", "03/10/1985", "22A/52 Lubowitz Meadow, Pililla 4895 Zambales", "023-079-009", "26-8768374-1", "308366860059", "598-065-761-000", "223057707853", "Regular", "Account Manager", "Lim, Antonio", 53500, 1500, 1000, 1000, 26750, 318.45));
        employeeData.put(16, new Employee(16, "Mata", "Christian", "10/21/1987", "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu", "783-776-744", "49-2959312-6", "824187961962", "103-100-522-000", "631052853464", "Regular", "Account Team Leader", "Romualdez, Fredrick", 42975, 1500, 800, 800, 21488, 255.80));
        employeeData.put(17, new Employee(17, "De Leon", "Selena", "02/20/1975", "89A Armstrong Trace, Compostela 7874 Maguindanao", "975-432-139", "27-2090208-8", "587272469938", "482-259-498-000", "719007608464", "Regular", "Account Team Leader", "Romualdez, Fredrick", 41850, 1500, 800, 800, 20925, 249.11));
        employeeData.put(18, new Employee(18, "San Jose", "Allison", "06/24/1986", "08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union", "179-075-129", "45-3251383-0", "745148459521", "121-203-336-000", "114901859343", "Regular", "Account Rank and File", "Mata, Christian", 22500, 1500, 500, 500, 11250, 133.93));
        employeeData.put(19, new Employee(19, "Rosario", "Cydney", "10/06/1996", "93A/21 Berge Points, Tapaz 2180 Quezon", "868-819-912", "49-1629900-2", "579253435499", "122-244-511-000", "265104358643", "Regular", "Account Rank and File", "Mata, Christian", 22500, 1500, 500, 500, 11250, 133.93));
        employeeData.put(20, new Employee(20, "Bautista", "Mark", "02/12/1991", "65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino", "683-725-348", "49-1647342-5", "399665157135", "273-970-941-000", "260054585575", "Regular", "Account Rank and File", "Mata, Christian", 23250, 1500, 500, 500, 11625, 138.39));
        employeeData.put(21, new Employee(21, "Lazaro", "Darlene", "11/25/1985", "47A/94 Larking Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino", "740-721-558", "45-5617168-2", "606386917510", "354-650-951-000", "104907708845", "Probationary", "Account Rank and File", "Mata, Christian", 23250, 1500, 500, 500, 11625, 138.39));
        employeeData.put(22, new Employee(22, "Delos Santos", "Kolby", "02/26/1980", "06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur", "739-443-033", "52-0109570-6", "357451271274", "187-500-345-000", "113017988667", "Probationary", "Account Rank and File", "Mata, Christian", 24000, 1500, 500, 500, 12000, 142.86));
        employeeData.put(23, new Employee(23, "Santos", "Vella", "12/31/1983", "99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur", "955-879-269", "52-9883524-3", "548670482885", "101-558-994-000", "360028104576", "Probationary", "Account Rank and File", "Mata, Christian", 22500, 1500, 500, 500, 11250, 133.93));
        employeeData.put(24, new Employee(24, "Del Rosario", "Tomas", "12/18/1978", "80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque", "882-550-989", "45-5866331-6", "953901539995", "560-735-732-000", "913108649964", "Probationary", "Account Rank and File", "Mata, Christian", 22500, 1500, 500, 500, 11250, 133.93));
        employeeData.put(25, new Employee(25, "Tolentino", "Jacklyn", "05/19/1984", "96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao", "675-757-366", "47-1692793-0", "753800654114", "841-177-857-000", "210546661243", "Probationary", "Account Rank and File", "De Leon, Selena", 24000, 1500, 500, 500, 12000, 142.86));
        employeeData.put(26, new Employee(26, "Gutierrez", "Percival", "12/18/1970", "57A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur", "512-899-876", "40-9504657-8", "797639382265", "502-995-671-000", "210897095686", "Probationary", "Account Rank and File", "De Leon, Selena", 24750, 1500, 500, 500, 12375, 147.32));
        employeeData.put(27, new Employee(27, "Manalaysay", "Garfield", "08/28/1986", "60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur", "948-628-136", "45-3298166-4", "810909286264", "336-676-445-000", "211274476563", "Probationary", "Account Rank and File", "De Leon, Selena", 24750, 1500, 500, 500, 12375, 147.32));
        employeeData.put(28, new Employee(28, "Villegas", "Lizeth", "12/12/1981", "66/77 Mann Views, Luisiana 1263 Dinagat Islands", "332-372-215", "40-2400719-4", "934389652994", "210-395-397-000", "122238077997", "Probationary", "Account Rank and File", "De Leon, Selena", 24000, 1500, 500, 500, 12000, 142.86));
        employeeData.put(29, new Employee(29, "Ramos", "Carol", "08/20/1978", "72/70 Stamm Spurs, Bustos 4550 Iloilo", "250-700-389", "60-1152206-4", "351830469744", "395-032-717-000", "212141893454", "Probationary", "Account Rank and File", "De Leon, Selena", 22500, 1500, 500, 500, 11250, 133.93));
        employeeData.put(30, new Employee(30, "Maceda", "Emelia", "04/14/1973", "50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija", " 973-358-041", "54-1331005-0", "465087894112", "215-973-013-000", "515012579765", "Probationary", "Account Rank and File", "De Leon, Selena", 22500, 1500, 500, 500, 11250, 133.93));
        employeeData.put(31, new Employee(31, "Aguilar", "Delia", "01/27/1989", "95 Cremin Junction, Surallah 2809 Cotabato", "529-705-439", "52-1859253-1", "136451303068", "599-312588-000", "110018813465", "Probationary", "Account Rank and File", "De Leon, Selena", 22500, 1500, 500, 500, 11250, 133.93));
        employeeData.put(32, new Employee(32, "Castro", "John Rafael", "02/09/1992", "Hi-way, Yati, Liloan Cebu", "332-424-955", "26-7145133-4", "601644902402", "404-768-309-000", "697764069311", "Regular", "Sales & Marketing", "Reyes, Isabella", 52670, 1500, 1000, 1000, 26335, 313.51));
        employeeData.put(33, new Employee(33, "Martinez", "Carlos Ian", "11/16/1990", "Bulala, Camalaniugan", "078-854-208", "11-5062972-7", "380685387212", "256-436-296-000", "993372963726", "Regular", "Supply Chain and Logistics", "Reyes, Isabella", 52670, 1500, 1000, 1000, 26335, 313.51));
        employeeData.put(34, new Employee(34, "Santos", "Beatriz", "08/07/1990", "Agapita Building, Metro Manila", "526-639-511", "20-2987501-5", "918460050077", "911-529-713-000", "874042259378", "Regular", "Customer Service and Relations", "Reyes, Isabella", 52670, 1500, 1000, 1000, 26335, 313.51));
        
        //Add attendance records for each employee
        addAttendanceRecords(employeeData);
        
        //Display employee information and calculate one-week salary
        for (Employee employee : employeeData.values()) {
            System.out.println("Employee #" + employee.getEmployeeNumber());
            System.out.println("Last Name: " + employee.getLastName());
            System.out.println("First Name: " + employee.getFirstName());
            System.out.println("Birthday: " + employee.getBirthday());
            System.out.println("Address: " + employee.getAddress());
            System.out.println("Phone Number: " + employee.getPhoneNumber());
            System.out.println("SSS #: " + employee.getSssNumber());
            System.out.println("Philhealth #: " + employee.getPhilhealthNumber());
            System.out.println("TIN #: " + employee.getTinNumber());
            System.out.println("Pag-ibig #: " + employee.getPagibigNumber());
            System.out.println("Status: " + employee.getStatus());
            System.out.println("Position: " + employee.getPosition());
            System.out.println("Immediate Supervisor: " + employee.getImmediateSupervisor());
            System.out.println("Basic Salary: " + employee.getBasicSalary());
            System.out.println("Rice Subsidy: " + employee.getRiceSubsidy());
            System.out.println("Phone Allowance: " + employee.getPhoneAllowance());
            System.out.println("Clothing Allowance: " + employee.getClothingAllowance());
            System.out.println("Gross Semi-Monthly Rate: " + employee.getGrossSemiMonthlyRate());
            System.out.println("Hourly Rate: " + employee.getHourlyRate());
            
            //Calculate hours worked for each employee
            double totalHoursWorked = 0;
            for (AttendanceRecord record : employee.getAttendanceRecords()) {
                double hoursWorked = calculateHoursWorked(record.getTimeIn(), record.getTimeOut());
                if (hoursWorked > 0) {
                    totalHoursWorked += hoursWorked;
                }
            }
            System.out.println("Total Hours Worked: " + totalHoursWorked);
            
            //Calculate one-week salary
            double oneWeekSalary = totalHoursWorked * employee.getHourlyRate();
            System.out.println("One-Week Salary: " + oneWeekSalary);
            
            System.out.println();
            
            //Deduct SSS Contribution
            double sssContribution = calculateSssContribution(oneWeekSalary);
            double netWage = oneWeekSalary - sssContribution;
            System.out.println("SSS Contribution: " + sssContribution);
            
            //Deduct Pag-IBIG Contribution
            double pagibigContribution = calculatePagibigContribution(employee.getBasicSalary());
            netWage -= pagibigContribution;
            System.out.println("Pag-IBIG Contribution: " + pagibigContribution);
            
            //Deduct Philhealth contribution
            double philhealthContribution = calculatePhilhealthContribution(employee.getBasicSalary());
            netWage -= philhealthContribution;
            System.out.println("PhilHealth Contribution: " + philhealthContribution);
            
            //Deduct Withholding Tax Contribution
            double withholdingTax = calculateWithholdingTax(netWage);
            netWage -= withholdingTax;
            System.out.println("Withholding Tax: " + withholdingTax);
            
            System.out.println("Net Wage: " + netWage);
            
            System.out.println();
        }
    }  
    
    //Method to calculate  hours worked based on time-in and time-out
    private static double calculateHoursWorked(Date timeIn, Date timeOut) {
        long millisecondsInHour = 60 * 60 * 1000;
        long gracePeriodMilliseconds = 10 * 60 * 1000; //10 minutes grace period
        long hoursWorked = (timeOut.getTime() - timeIn.getTime()) / millisecondsInHour;
        
        //Apply grace period deduction
        if (timeIn.getHours() >= 8 && timeIn.getMinutes() >= 11) {
            hoursWorked -= (gracePeriodMilliseconds / millisecondsInHour);
        }
        
        return hoursWorked;
    }
    
    //Method to calculate SSS Contribution
    private static double calculateSssContribution(double salary) {
        if (salary < 3250) {
            return 135.00;
        } else if (salary < 3750) {
            return 157.50;
        } else if (salary < 4250) {
            return 180.00;
        } else if (salary < 4750) {
            return 202.50;
        } else if (salary < 5250) {
            return 225.00;
        } else if (salary < 5750) {
            return 247.50;
        } else if (salary < 6250) {
            return 270.00;
        } else if (salary < 6750) {
            return 292.50;
        } else if (salary < 7250) {
            return 315.00;
        } else if (salary < 7750) {
            return 337.50;
        } else if (salary < 8250) {
            return 360.00;
        } else if (salary < 8750) {
            return 382.50;
        } else if (salary < 9250) {
            return 405.00;
        } else if (salary < 9750) {
            return 427.50;
        } else if (salary < 10250) {
            return 450.00;
        } else if (salary < 10750) {
            return 472.50;
        } else if (salary < 11250) {
            return 495.00;
        } else if (salary < 11750) {
            return 517.50;
        } else if (salary < 12250) {
            return 540.00;
        } else if (salary < 12750) {
            return 562.50;
        } else if (salary < 13250) {
            return 585.00;
        } else if (salary < 13750) {
            return 607.50;
        } else if (salary < 14250) {
            return 630.00;
        } else if (salary < 14750) {
            return 652.50;
        } else if (salary < 15250) {
            return 675.00;
        } else if (salary < 15750) {
            return 697.50;
        } else if (salary < 16250) {
            return 720.00;
        } else if (salary < 16750) {
            return 742.50;
        } else if (salary < 17250) {
            return 765.00;
        } else if (salary < 17750) {
            return 787.50;
        } else if (salary < 18250) {
            return 810.00;
        } else if (salary < 18750) {
            return 832.50;
        } else if (salary < 19250) {
            return 855.00;
        } else if (salary < 19750) {
            return 877.50;
        } else if (salary < 20250) {
            return 900.00;
        } else if (salary < 20750) {
            return 922.50;
        } else if (salary < 21250) {
            return 945.00;
        } else if (salary < 21750) {
            return 967.50;
        } else if (salary < 22250) {
            return 990.00;
        } else if (salary < 22750) {
            return 1012.50;
        } else if (salary < 23250) {
            return 1035.00;
        } else if (salary < 23750) {
            return 1057.50;
        } else if (salary < 24250) {
            return 1080.00;
        } else if (salary < 24750) {
            return 1102.50;
        } else {
            return 1125.00;
        }
    }
    
    //Method to calculate Pag-IBIG contribution
    private static double calculatePagibigContribution(double salary) {
        if (salary >= 1000 && salary <= 1500) {
            return salary * 0.01; //Employee's contribution rate is 1%
        } else if (salary > 1500) {
            return salary * 0.02; //Employee's contribution rate is 2%
        } else {
            return 0; //No contribution for salary below 1000
        }
    }
    
    //Method to calculate PhilHealth contribution
    private static double calculatePhilhealthContribution(double salary) {
        if (salary <= 10000) {
            return salary * 0.03; // Premium rate is 3%
        } else if (salary <= 59999.99) {
            return 300; //Monthly premium is 300
        } else {
            return 1800; //Monthly premium is 1800 for a salary of 60000
        }
    }
    
    //Method to calculate withholding tax
    private static double calculateWithholdingTax(double netWage) {
        if (netWage <= 20832) {
            return 0; //No withholding tax
        } else if (netWage < 33333) {
            return (netWage - 20832) * 0.2; //20% in excess of 20832
        } else if (netWage < 66667) {
            return 2500 + (netWage - 33333) * 0.25; // 2500 plus 25% in excess of 33333
        } else if (netWage < 166667) {
            return 10833 + (netWage - 66667) * 0.3; //10833 plus 30% in excess of 66667
        } else if (netWage < 666667) {
            return 40833.33 + (netWage - 166667) * 0.32; //40833.33 plus 32% in excess of 166667
        } else {
            return 200833.33 + (netWage - 666667) * 0.35; //200833.33 plus 35% in excess of 666667
        }
    }
    
    //Method to add attendance records for each employee
    private static void addAttendanceRecords(Map<Integer, Employee> employeeData){
         //Attendance records for each employee
        Object[][] attendanceRecords = {
            //{employeeNumber, timeIn, timeOut}
            {1, "01/09/2022", "8:00", "17:00"},
            {2, "01/09/2022", "8:00", "17:00"},
            {3, "01/09/2022", "8:00", "17:00"},
            {4, "01/09/2022", "8:00", "17:00"},
            {5, "01/09/2022", "8:00", "17:00"},
            {6, "01/09/2022", "8:00", "17:00"},
            {7, "01/09/2022", "8:00", "17:00"},
            {8, "01/09/2022", "8:00", "17:00"},
            {9, "01/09/2022", "8:00", "17:00"},
            {10, "01/09/2022", "8:00", "17:00"},
            {11, "01/09/2022", "8:00", "17:00"},
            {12, "01/09/2022", "8:00", "17:00"},
            {13, "01/09/2022", "8:00", "17:00"},
            {14, "01/09/2022", "8:00", "17:00"},
            {15, "01/09/2022", "8:00", "17:00"},
            {16, "01/09/2022", "8:00", "17:00"},
            {17, "01/09/2022", "8:00", "17:00"},
            {18, "01/09/2022", "8:00", "17:00"},
            {19, "01/09/2022", "8:00", "17:00"},
            {20, "01/09/2022", "8:00", "17:00"},
            {21, "01/09/2022", "8:00", "17:00"},
            {22, "01/09/2022", "8:00", "17:00"},
            {23, "01/09/2022", "8:00", "17:00"},
            {24, "01/09/2022", "8:00", "17:00"},
            {25, "01/09/2022", "8:00", "17:00"},
            {26, "01/09/2022", "8:00", "17:00"},
            {27, "01/09/2022", "8:00", "17:00"},
            {28, "01/09/2022", "8:00", "17:00"},
            {29, "01/09/2022", "8:00", "17:00"},
            {30, "01/09/2022", "8:00", "17:00"},
            {31, "01/09/2022", "8:00", "17:00"},
            {32, "01/09/2022", "8:00", "17:00"},
            {33, "01/09/2022", "8:00", "17:00"},
            {34, "01/09/2022", "8:00", "17:00"},
        };
    }
}