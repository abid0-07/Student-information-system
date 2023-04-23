package Person;

import Default.SecondPage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Student {
    private String name;
    private String Id;
    private String phone;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student() throws IOException {
        Scanner input = new Scanner(System.in);

        Scanner inputFile = null;
        try {
            SecondPage secondPage = new SecondPage();
            File studentFile = new File("Students.txt");
            if (studentFile.exists()) {
                System.out.println("File exists");
                inputFile = new Scanner(studentFile);
//                System.out.print("ID\t\t\t");
                secondPage.createNewLabel("ID");

//                System.out.print("  Name\t\t\t");
                secondPage.createNewLabel("Name");

//                System.out.print("phone\t\t\t");
                secondPage.createNewLabel("Phone");

//                System.out.println("Email");
                secondPage.createNewLabel("Email");

                while (inputFile.hasNextLine()) {
                    String line = inputFile.nextLine();
                    String[] studentInfo = line.split(" ");
                    for (String part : studentInfo) {
                        secondPage.createNewLabel(part);
//                        System.out.print(part + "\t\t");
                    }

                    System.out.println();
                }


            } else {
                System.out.println("file doesn't exits");
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            inputFile.close();
        }
    }
}
