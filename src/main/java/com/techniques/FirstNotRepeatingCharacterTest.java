package com.techniques;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNotRepeatingCharacterTest {

	@Test
	public void shouldReturnACharacter() {
		char result;
		result = FirstNotRepeatingCharacter.firstNotRepeatingCharacter("abababababa");
		result = FirstNotRepeatingCharacter.firstNotRepeatingCharacter("abacabaabacaba");
		result = FirstNotRepeatingCharacter.firstNotRepeatingCharacter("bcccccccb");
		result = FirstNotRepeatingCharacter.firstNotRepeatingCharacter("zzz");
		result = FirstNotRepeatingCharacter.firstNotRepeatingCharacter("");
		assertEquals('_', result);
	}
	
	@Test
	public void shouldReturnanUnderscore(){
		boolean expectedResult = true;
		if(FirstNotRepeatingCharacter.firstNotRepeatingCharacter("abacabad") != 'c'){
			expectedResult = false;
		}
		if(FirstNotRepeatingCharacter.firstNotRepeatingCharacter("z") != 'z'){
			expectedResult = false;
		}
		if(FirstNotRepeatingCharacter.firstNotRepeatingCharacter("bcb") != 'c'){
			expectedResult = false;
		}
		if(FirstNotRepeatingCharacter.firstNotRepeatingCharacter("abcdefghijklmnopqrstuvwxyziflskecznslkjfabe") != 'd'){
			expectedResult = false;
		}
		if(FirstNotRepeatingCharacter.firstNotRepeatingCharacter("bcccccccccccccyb") != 'y'){
			expectedResult = false;
		}
		if(FirstNotRepeatingCharacter.firstNotRepeatingCharacter("xdnxxlvupzuwgigeqjggosgljuhliybkjpibyatofcjbfxwtalc") != 'd'){
			expectedResult = false;
		}
		if(FirstNotRepeatingCharacter.firstNotRepeatingCharacter("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof") != 'g'){
			expectedResult = false;
		}
		
		assertEquals(true, expectedResult);
	}
}
