package day45_Abstraction;

//extends:
class C{

}

class A{

}

class B extends A{

}


interface Z{

}

interface X{

}

interface Y extends X, Z{

}


//implements

class D implements X,Y,Z{

}


public class ExtendsVsImplements extends A implements X, Y, Z{


}
