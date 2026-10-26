import java.util.Scanner;

class Student {
         int marks;
        String name;
        int age;
        String gender;

        Student( int marks, String name,int age, String gender){
            this.marks = marks;
            this.name = name;
            this.age = age;
            this.gender = gender;
        }


        public static void main(String[] args) {
            Student arr[] = {
                new Student(99, "Soumya", 22, "Male"),
                new Student(56, "Parth", 22, "Male"),
                new Student(37, "Aditya", 22, "Male"),
                    new Student(87, "Tej", 22, "Female"),
                new Student(89, "Vinayak", 22, "Male"),
                new Student(57, "Rahul", 22, "Male"),
                new Student(61, "Akash", 22, "Male"),
                new Student(17, "Anandi", 22, "Female"),
                new Student(67, "Shruti", 21, "Female")

        };


       boolean flag=true;

       while(flag){
           Scanner sc =new Scanner(System.in);
           System.out.println("enter the option");
           int n=sc.nextInt();

           switch (n)
           {
               case 1:
               
                   for(Student s:arr)
                   {                                                                                        
                    System.out.print(s.name + "  " + s.gender + "  " + s.age + "  " + s.marks   + "\n");
                   }
               break;


               case 2:
               
                   for(Student s:arr)
                   {
                       if(s.gender.equals("Male"))
                       {
                           System.out.print(s.name + "  " + s.gender + "  " + s.age + "  " + s.marks   + "\n");
                       }
                   }

               
               break;
               case 3:
               
                   for(Student s:arr)
                   {
                       if(s.gender.equals("Female"))
                       {
                           System.out.print(s.name + "  " + s.gender + "  " + s.age + "  " + s.marks + "\n" );
                       }
                   }
               

               case 4:
                   flag=false;
                   
           }


       }



    }
}

