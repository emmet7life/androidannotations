package com.googlecode.androidannotations.test15.prefs;

import com.googlecode.androidannotations.annotations.sharedpreferences.DefaultInt;
import com.googlecode.androidannotations.annotations.sharedpreferences.DefaultString;
import com.googlecode.androidannotations.annotations.sharedpreferences.SharedPref;
import com.googlecode.androidannotations.annotations.sharedpreferences.SharedPref.Scope;

@SharedPref(Scope.UNIQUE)
public interface SomePrefs {

    @DefaultString("John")
	String name();
	
	@DefaultInt(42)
	int age();
}
