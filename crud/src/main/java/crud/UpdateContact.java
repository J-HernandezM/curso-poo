package crud;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class UpdateContact {
    static String updateContact(String[] data) {
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
                returnMessage = "Contact not found";
                
            } else {
                if (name.length() == 0) {throw new IOException("Name should not be empty");}
                
                // Declare a temporal file and its RAF
                File tmpFile = new File("tempFile.txt");
                RandomAccessFile raft = new RandomAccessFile(tmpFile, "rw");
                
                // Set the pointer to the start of the original file
                raf.seek(0);
                
                // Traverse the original file to copy the contacts and modify the contact to be updated
                while(raf.getFilePointer() < raf.length()) {
                    nameNumber = raf.readLine();
                    String[] lineSplit = nameNumber.split("/");

                    String currentName = lineSplit[0];

                    // Find the contact to update and change its value
                    if (name.equalsIgnoreCase(currentName)) {
                        nameNumber = name + "/" + number;
                    }
                    
                    // Copy all contacts to the temp file even the changed one
                    raft.writeBytes(nameNumber);
                    raft.writeBytes(System.lineSeparator());
                }
                
                raf.seek(0);
                raft.seek(0);
                
                // Copy back all the contacts from the temp modified file to the original
                while(raft.getFilePointer() < raft.length()) {
                    raf.writeBytes(raft.readLine());
                    raf.writeBytes(System.lineSeparator());
                }
                
                // Set original file length to the temp's length
                raf.setLength(raft.length());
                
                // Closing the resources.
                raft.close();
                raf.close();
 
                // Deleting the temporary file
                tmpFile.delete();
 
                returnMessage = "Contact updated succesfully";
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
