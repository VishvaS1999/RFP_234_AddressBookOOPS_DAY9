package com.addressbook;

public class DeleteName_UC4 extends EditExistingContact_UC3
{
    //Deleting Person from address book
    public void DeletePerson()
    {
        System.out.println("Do you want to Delete (y/n)");
        String c = scanner.next();

        if(c.equals("y"))
        {
            System.out.println("Enter name to Delete Person");
            String s = scanner.next();

            for (int i = 0; i < person.size(); i++)
            {
                Contacts p = person.get(i);
                if (s.equals(p.getFirstName()))
                {
                    person.remove(i);  //Deleting every index position
                }
            }
            System.out.println("Person Deleted");
            System.out.println(person);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to Address Book Program");
        DeleteName_UC4 obj = new DeleteName_UC4();
        obj.AddPerson();
        obj.EditPerson();
        obj.DeletePerson();

    }
}

