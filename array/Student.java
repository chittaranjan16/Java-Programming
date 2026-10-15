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
                new Student(37, "Aditya", 22, "Female"),
                new Student(89, "Vinayak", 22, "Male"),
                new Student(57, "Rahul", 22, "Male"),
                new Student(61, "Akash", 22, "Male"),
                new Student(17, "Anand", 22, "Male"),

        };

       boolean flag=true;

       while(flag){
           Scanner sc =new Scanner(System.in);
           System.out.println("enter the option");
           int n=sc.nextInt();

           switch (n)
           {
               case 1:
               {
                   for(Student s:arr)
                   {
                       System.out.print(s.name);
                       System.out.print(s.age);
                       System.out.print(s.marks);
                       System.out.print(s.gender);
                   }

               }
               break;
               case 2:
               {
                   for(Student s:arr)
                   {
                       if(s.gender.equals("male"))
                       {
                           System.out.print(s.name);
                           System.out.print(s.age);
                           System.out.print(s.marks);
                           System.out.print(s.gender);
                       }
                   }

               }
               break;
               case 3:
               {
                   for(Student s:arr)
                   {
                       if(s.gender.equals("female"))
                       {
                           System.out.print(s.name);
                           System.out.print(s.age);
                           System.out.print(s.marks);
                           System.out.print(s.gender);
                       }
                   }
               }

               case 4:
                   flag=false;
           }


       }



    }
}

