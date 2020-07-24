
package mypackage;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Exercise15ExtraMainClass {

   
    public static void main(String[] args) {
    Student s1=new Student("John", 12,20);
    Student s2=new Student("Maria",10,22);
    Student s3=new Student("Kevin",14,18);
    Student s4=new Student(s3);
    Set<Student> hash1=new HashSet();
    hash1.add(s1);
    hash1.add(s2);
    hash1.add(s3);
    hash1.add(s4);
    
        System.out.println(hash1);
        
        Set<Student> tree1=new TreeSet();
    tree1.add(s1);
    tree1.add(s2);
    tree1.add(s3);
    tree1.add(s4);  
        System.out.println(tree1);  
        
    }
    
}
