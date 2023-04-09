package Person;

import java.io.File;
import java.io.FileNotFoundException;
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

    public Student(){
        Scanner input = new Scanner(System.in);
        File studentFile = new File("/src/Files/Students.txt");
        try {
            Scanner inputFile = new Scanner(studentFile);
            System.out.print("ID\t");
            System.out.print("Name\t");
            System.out.print("phone\t");
            System.out.println("Email");
            while(input.hasNext()){
                String line = inputFile.nextLine();
                String[] studentInfo = line.split(" ");
                for (String part:studentInfo){
                    System.out.print(part+"\t");
                }
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
