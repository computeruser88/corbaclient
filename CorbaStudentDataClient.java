/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corbastudentdataclient;

import NewStudentData.StudentData;
import NewStudentData.StudentDataHelper;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

/**
 *
 * @author Jan
 */
public class CorbaStudentDataClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ORB orb = ORB.init(args, null);
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            StudentData studentDataObj = (StudentData) StudentDataHelper.narrow(ncRef.resolve_str("ABC"));
            
            System.out.println("Welcome to the system:\n");
            int sid = studentDataObj.StudID();
            String name = studentDataObj.Name();
            String ssn = studentDataObj.SSN();
            String email = studentDataObj.EmailAddress();
            String phone = studentDataObj.HomePhone();
            
            System.out.println("Student ID: " + sid);
            System.out.println("Student name: " + name);
            System.out.println("Social security number: " + ssn);
            System.out.println("Email address: " + email);
            System.out.println("Phone number: " + phone);
            
        } catch (Exception e){
            System.out.println("Exception: " + e);
        }
    }
    
}
