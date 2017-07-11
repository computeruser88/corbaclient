# corbaclient

This project implements functionality sharing between a CORBA client and server. This functionality sharing results in transmission of 
data between the client, running on Course System, and the server, running on Roster System. The client initiates the request. 
All code was written in Java. 
The IDL-to-Java (idlj) compiler was used to compile NewStudentData.ipl. 
Compilation resulted in the NewStudentData folder and all its contents. 
  
The IDL module defines the interface. The implementation code is located in the Servant. 
  
The server contains the Object, which consists of an identity, an interface, and an implementation which is located within the Servant. 
The server also passes an object reference to the client. 
