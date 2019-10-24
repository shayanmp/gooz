import java.util.Scanner;


public class Student {



    public String firstname;
    public String lastname;
    public String peopleSoft;
    public String classStanding;
    public String email;
    public String streetAddress;
    public String city;
    public String state;
    public String zipcode;





    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("How many students would you like to enter?");

        String n = myObj.nextLine();
        int x = Integer.parseInt(n);
        System.out.println("Number of Students: " + x);

        Student[] studentList;
        studentList = new Student[x];


        for (int i = 0; i < x; i++) {

            studentList[i] = new Student();


            //Get First Name


            Scanner firstn = new Scanner(System.in);
            System.out.println("Enter first name:");
            studentList[i].firstname = firstn.nextLine();
            while (!studentList[i].firstname.matches("[a-zA-Z]+")) {

                System.out.println("ERROR: First name should only contain letters!");
                System.out.println("Enter first name:");
                studentList[i].firstname = firstn.nextLine();
            }


            //Get Last Name


            Scanner lastn = new Scanner(System.in);
            System.out.println("Enter last name:");
            studentList[i].lastname = lastn.nextLine();
            while (!studentList[i].lastname.matches("[a-zA-Z]+")) {

                System.out.println("ERROR: Last name should only contain letters!");
                System.out.println("Enter last name:");
                studentList[i].lastname = lastn.nextLine();
            }


            //Get PeopleSoftID


            Scanner ps = new Scanner(System.in);
            System.out.println("Enter PeopleSoft ID:");
            studentList[i].peopleSoft = ps.nextLine();
            while (!studentList[i].peopleSoft.matches("[0-9]+") || studentList[i].peopleSoft.length() > 7) {

                System.out.println("ERROR: People Soft ID should only contain less than 8 Digits!");
                System.out.println("Enter PeopleSoft ID:");
                studentList[i].peopleSoft = ps.nextLine();
            }




            //Get Class Standing
            Scanner cs = new Scanner(System.in);
            System.out.println("Enter Class Standing:");
            studentList[i].classStanding = cs.nextLine();
            while (!studentList[i].classStanding.matches("[fF][Rr][Ee][Ss][Hh][Mm][Aa][Nn]") && !studentList[i].classStanding.matches("[Ss][Oo][Pp][Hh][Oo][Mm][Oo][Rr][Ee]") && !studentList[i].classStanding.matches("[Jj][Uu][Nn][Ii][Oo][Rr]") && !studentList[i].classStanding.matches("[Ss][Ee][Nn][Ii][Oo][Rr]")) {

                System.out.println("ERROR: Class Standing should be on of the following: Freshman, Sophomore, Junior, Senior");
                System.out.println("Enter Class Standing:");
                studentList[i].classStanding = cs.nextLine();
            }






            //Get Email


            Scanner em = new Scanner(System.in);
            System.out.println("Enter Email:");
            studentList[i].email = em.nextLine();
            while (!studentList[i].email.matches("^[a-zA-Z1-9]+@[a-zA-Z1-9]+.(com|edu|org)$")) {

                System.out.println("ERROR: Enter a valid email:");
                System.out.println("Enter Email:");
                studentList[i].email = em.nextLine();
            }


//Enter Street Address

            Scanner sa = new Scanner(System.in);
            System.out.println("Enter Street Address:");
            studentList[i].streetAddress = sa.nextLine();
            while (!studentList[i].streetAddress.matches("[0-9]+[ ]\\D+")) {

                System.out.println("ERROR: Enter a valid street address:");
                System.out.println("Enter Street Address:");
                studentList[i].streetAddress = sa.nextLine();
            }
//Enter City
            Scanner c = new Scanner(System.in);
            System.out.println("Enter City:");
            studentList[i].city = c.nextLine();
            while (!studentList[i].city.matches("\\D+")) {

                System.out.println("ERROR: Invalid City");
                System.out.println("Enter City:");
                studentList[i].city = c.nextLine();
            }

//Enter State

            Scanner s = new Scanner(System.in);
            System.out.println("Enter State (ex. TX):");
            studentList[i].state = s.nextLine();
            while (!studentList[i].state.matches("AK|AL|AR|AZ|CA|CO|CT|DC|DE|FL|GA|HI|IA|ID|IL|IN|KS|KY|LA|MA|MD|ME|MI|MN|MO|MS|MT|NC|ND|NE|NH|NJ|NM|NV|NY|OH|OK|OR|PA|RI|SC|SD|TN|TX|UT|VA|VT|WA|WI|WV|WY")) {

                System.out.println("ERROR: Enter a valid US State as requested");
                System.out.println("Enter State (ex. TX or NY):");
                studentList[i].state = s.nextLine();
            }


//Enter ZipCode


            Scanner zc = new Scanner(System.in);
            System.out.println("Enter Zipcode");
            studentList[i].zipcode = zc.nextLine();
            while (!studentList[i].zipcode.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {


                System.out.println("ERROR: Enter a valid 9-digit US Zipcode");
                System.out.println("Enter Zipcode:");
                studentList[i].zipcode = zc.nextLine();
            }
        }


        System.out.println("Student Details, Department of ILT");

        for(int i=0; i < x; i++){

            System.out.println(studentList[i].firstname + "\t" + studentList[i].lastname + "\t" + studentList[i].peopleSoft + "\t" + studentList[i].classStanding + "\t" + studentList[i].email + "\t" + studentList[i].streetAddress + "\t" + studentList[i].city+ "\t" + studentList[i].state + "\t" + studentList[i].zipcode + "\t");
        }

        System.out.println("Number of Students: " + x);
    }
}
