package Person;

import Default.MainPage;
import Default.viewStudent;

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
            viewStudent secondPage = new viewStudent();
            File studentFile = new File("Students.txt");
            if (studentFile.exists()) {
                System.out.println("File exists");
                inputFile = new Scanner(studentFile);

                secondPage.createNewLabel("ID");


                secondPage.createNewLabel("Name");


                secondPage.createNewLabel("Phone");


                secondPage.createNewLabel("Email");

                while (inputFile.hasNextLine()) {
                    String line = inputFile.nextLine();
                    String[] studentInfo = line.split(" ");
                    for (String part : studentInfo) {
                        secondPage.createNewLabel(part);
//                        System.out.print(part + "\t\t");
                    }

//                    System.out.println();
                }

            } else {
                System.out.println("file doesn't exits");
                new MainPage();
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
//        } finally {
//            inputFile.close();
//        }
    }}
}
