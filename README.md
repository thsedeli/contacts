# contacts
Simple Contacts Application

For this exercise I decided to to use Spring boot with Java. 

Since it's my first app using html I decided to keep it as simple as possible.

The design is simple and it consists of two simple pages:
  - the first holds the form which populates the name attribute of a Person object
  - the second shows the results of the search inside the contacts/persons list
  
If the user clicks on submit without entering a text the app will return all the available contacts/persons.

If the user submits a text in the form field then the app performs a filter in the names of the contacts and matches
any contact that has this text inside the name.

Given the time constraints I decided to implement only a search by name but the application could be extended to search 
by other fields as well. 

- In order to run the application follow the steps below:
  1. Download the repository in your local machine
  2. Go to the folder in which you downloaded the repo using terminal.
  3. Run the command: java -jar contacts-0.0.1-SNAPSHOT.jar
  4. Open a browser and go to: http://localhost:8080/form
  5. You can use the app
  
If you have any questions please feel free to contact me at thsedeli@gmail.com

