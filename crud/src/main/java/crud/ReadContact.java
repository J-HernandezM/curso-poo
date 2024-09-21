package crud;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class ReadContact {
    static List<String> readSingleContact(String[] data) {
        
        try {
            // Get the contact info of the data string array
            String name = data[0];
            String numberStr = data[1];
            Long number = null;
            
            if(!numberStr.isEmpty()) number = Long.parseLong(numberStr);
            if(name.isEmpty() && numberStr.isEmpty()) {throw new IOException("Please fill at least one field");}
            
            // Create the file
            File file = new File("contacts.txt");
            if (!file.exists()) file.createNewFile();
            
            // Declare variables
            String nameNumber;
            String foundName = "";
            String foundNumber = "";
            boolean found = false;
            
            // Instance a RAF of out file
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            
            // Get a single contact
            while (raf.getFilePointer() < raf.length()) {
                nameNumber = raf.readLine();
                String[] lineSplit = nameNumber.split("/");
                
                String currentName = lineSplit[0];
                Long currentNumber = Long.parseLong(lineSplit[1]);
                
                if (name.equalsIgnoreCase(currentName) || currentNumber.equals(number)) {
                    found = true;
                    foundName = currentName;
                    foundNumber = currentNumber.toString();
                    break;
                }
            }
            
            List<String> returnList = new ArrayList<String>();
            
            if (found) {
                returnList.add("Name: " + foundName + " | Number: " + foundNumber);
            } else {
                returnList.add("Contact not found");
            }
            
            return returnList;
            
        } catch (IOException ioe) {
            System.err.println(ioe);
            List<String> arr = new ArrayList<String>();
            arr.add(ioe.getMessage());
            return arr;
        } catch (NumberFormatException nfe) {
            System.err.println(nfe);
            List<String> arr = new ArrayList<String>();
            arr.add("Please use a number on Number field");
            return arr;
        }
    }
    
    static List<String> readAllContacts() {
        try {
            // Create the file
            File file = new File("contacts.txt");
            if (!file.exists()) file.createNewFile();
            
            // Declare variables
            String nameNumber;
            
            // Instance a RAF of out file
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            
            List<String> returnArr = new ArrayList<String>();
            
            // Get a single contact
            while (raf.getFilePointer() < raf.length()) {
                nameNumber = raf.readLine();
                String[] lineSplit = nameNumber.split("/");
                
                String currentName = lineSplit[0];
                Long currentNumber = Long.parseLong(lineSplit[1]);
                
                String message = "Name: " + currentName + " | Number: " + currentNumber;
                returnArr.add(message);
            }
            
            return returnArr;
            
        } catch (FileNotFoundException fnf) {
            System.err.println(fnf);
            List<String> arr = new ArrayList<String>();
            arr.add(fnf.getMessage());
            return arr;
        } catch (IOException ioe) {
            System.err.println(ioe);
            List<String> arr = new ArrayList<String>();
            arr.add(ioe.getMessage());
            return arr;
        }
    }
}
