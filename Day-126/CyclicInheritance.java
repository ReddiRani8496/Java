// java doesn't supports cyclic inheritance

public class CyclicInheritance {
    public static void main(String[] args) {
        
    }    
}

class A extends B { // forming a cycle between A and B

}

class B extends A {

}

class C extends C { // Forming a cycle with only C

}