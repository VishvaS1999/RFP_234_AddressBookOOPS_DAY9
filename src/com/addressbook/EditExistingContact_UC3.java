package com.addressbook;

public class EditExistingContact_UC3 extends AddNewContact_UC2
{
    //editing contact by searching name
    public void EditPerson()
    {
        System.out.println("Do you want to Edit (y/n)");
        String c = scanner.next();

        if(c.equals("y"))
        {
            System.out.println("Enter name to edit");
            String s = scanner.next();

            for(int i = 0; i<person.size(); i++)
            {
                Contacts p = person.get(i);
                if(s.equals(p.getFirstName()))
                {
                    while (true)
                    {
                        System.out.println("Enter Choice to edit 1)firstName\n2)lastName\n3)address\n4)city\n5)state\n6)zip\n7)phoneNumber\n8)email\n9)exit");
                        int choice = scanner.nextInt();
                        switch (choice)
                        {
                            case 1:
                                p.setFirstName(scanner.next());
                                break;
                            case 2:
                                p.setLastName(scanner.next());
                                break;
                            case 3:
                                p.setAddress(scanner.next());
                                break;
                            case 4:
                                p.setCity(scanner.next());
                                break;
                            case 5:
                                p.setState(scanner.next());
                                break;
                            case 6:
                                p.setZip(scanner.next());
                                break;
                            case 7:
                                p.setPhoneNumber(scanner.next());
                                break;
                            case 8:
                                p.setEmail(scanner.next());
                                break;
                            case 9:
                                break;
                            default:
                                System.out.println("select correct choice");
                                break;
                        }
                        if (choice == 9)
                            break;
                    }
                    person.set(i, p);
                    System.out.println("Person after Editing");
                    System.out.println(person);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        EditExistingContact_UC3 obj = new EditExistingContact_UC3();
        obj.AddPerson();
        obj.EditPerson();

    }
}
