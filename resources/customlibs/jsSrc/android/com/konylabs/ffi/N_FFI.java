package com.konylabs.ffi;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;
import com.konylabs.api.TableLib;
import com.konylabs.vm.LuaTable;



import com.ist.helloworld.HelloWorld;
import com.konylabs.libintf.Library;
import com.konylabs.libintf.JSLibrary;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;


public class N_FFI extends JSLibrary {

 
 
	public static final String helloworld = "helloworld";
 
	String[] methods = { helloworld };


 Library libs[] = null;
 public Library[] getClasses() {
 libs = new Library[0];
 return libs;
 }



	public N_FFI(){
	}

	public Object[] execute(int index, Object[] params) {
		// TODO Auto-generated method stub
		Object[] ret = null;
 
		int paramLen = params.length;
 int inc = 1;
		switch (index) {
 		case 0:
 if (paramLen != 0){ return new Object[] {new Double(100),"Invalid Params"}; }
 ret = this.helloworld( );
 
 			break;
 		default:
			break;
		}
 
		return ret;
	}

	public String[] getMethods() {
		// TODO Auto-generated method stub
		return methods;
	}
	public String getNameSpace() {
		// TODO Auto-generated method stub
		return "FFI";
	}


	/*
	 * return should be status(0 and !0),address
	 */
 
 
 	public final Object[] helloworld( ){
 
		Object[] ret = null;
 java.lang.String val = com.ist.helloworld.HelloWorld.helloWorld( );
 
 			ret = new Object[]{val, new Double(0)};
 		return ret;
	}
 
};
