package com.techniques;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/firstDuplicate")
public class TechniquesServices {
	
	@RequestMapping(value="/example", method = RequestMethod.GET)
	public String firstDuplicateExample(){
		return "This is an example of FirstDuplicate." +
				"<br>" + 
				"The Integer array is [8, 4, 6, 2, 6, 4, 7, 9, 5, 8]" + 
				"<br>" + 
				"The Algorithm should return 6!" +
				"<br>" + 
				"The Algorithm has returned " + FirstDuplicate.firstDuplicate(new int[] {8, 4, 6, 2, 6, 4, 7, 9, 5, 8});
	}
}
