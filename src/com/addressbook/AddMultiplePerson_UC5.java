package com.addressbook;

public class AddMultiplePerson_UC5 extends DeleteName_UC4
{
    public void MultiplePerson()
    {
        while(true)
        {
            System.out.println("Select Choice \n1)Add Person\n2)Edit Person\n3)Delete Person\n4)Exit");
            int c = scanner.nextInt();


            switch (c)
            {
                case 1:
                    AddPerson();
                    break;
                case 2:
                    EditPerson();
                    break;
                case 3:
                    DeletePerson();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Incorrect option");
            }
            if(c==4)
            {
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        AddMultiplePerson_UC5 obj = new AddMultiplePerson_UC5();
        obj.MultiplePerson();
    }
}
