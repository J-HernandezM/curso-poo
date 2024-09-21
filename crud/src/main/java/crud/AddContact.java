
package crud;

import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;

public class AddContact {
    static String addContact(String[] data) {
        try {
            // Get the contact info of the data string array
            String name = data[0];
            Long number = Long.parseLong(data[1]);
            
            // Create the file
            File file = new File("contacts.txt");
            if (!file.exists()) file.createNewFile();
            
            // Declare variables
            String nameNumber;
            boolean found = false;
            
            // Instance a RAF of out file
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            
            // Check if the contact already exists
            while(raf.getFilePointer() < raf.length()) {
                nameNumber = raf.readLine();
                String[] lineSplit = nameNumber.split("/");
                
                String currentName = lineSplit[0];
                Long currentNumber = Long.parseLong(lineSplit[1]);
                
                if (name.equalsIgnoreCase(currentName) || currentNumber.equals(number)) {
                    found = true;
                    break;
                }
            }
            
            String returnMessage;
            
            if (!found) {
                if (name.length() == 0) {throw new IOException("Name should not be empty");}
                
                nameNumber = name + '/' + number.toString();
                raf.writeBytes(nameNumber);
                raf.writeBytes(System.lineSeparator());
                
                returnMessage = "Contact added succesfully";
                
            } else {
                returnMessage = "The contact already exists";
            }
            
            raf.close();
            System.out.println(returnMessage);
            return returnMessage;
        } catch (IOException ioe) {
            System.err.println(ioe);
            return(ioe.getMessage());
        } catch (NumberFormatException nfe) {
            System.err.println(nfe);
            return("Please use a number on Number field");
        }
    }
   
}
