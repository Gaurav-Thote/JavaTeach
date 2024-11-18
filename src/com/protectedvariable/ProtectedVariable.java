package com.protectedvariable;

import com.basic1.AccessModifiers;

public class ProtectedVariable extends AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers am = new AccessModifiers();
		System.out.println(am.publicVariable);
				
		ProtectedVariable pv = new ProtectedVariable();
		
		System.out.println(pv.protectedVariable);
		System.out.println(pv.publicVariable);
	
		
	}

}
