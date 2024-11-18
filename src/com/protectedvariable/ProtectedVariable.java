package com.protectedvariable;

import com.basic.AccessModifier;

public class ProtectedVariable extends AccessModifier {

	public static void main(String[] args) {
		
		AccessModifier am = new AccessModifier();
		System.out.println(am.publicVariable);
				
		ProtectedVariable pv = new ProtectedVariable();
		
		System.out.println(pv.protectedVariable);
		System.out.println(pv.publicVariable);
	
		
	}

}
