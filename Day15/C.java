package Day15;

sealed class A permits B,C{
	
}

non-sealed class B extends A{
	
}

non-sealed class C extends A{

}
