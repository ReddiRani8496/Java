// supplement or extra information or data given to compiler or jvm

class Hello {

    void sayHi() {

        System.out.println("Hi");

    }

}

class Hi extends Hello {

    @Override 
    void sayHi() {

        super.sayHi();

    }
    
}
