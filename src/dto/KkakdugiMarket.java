package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class KkakdugiMarket {

	private int idx;
	private String categoryIdx;
	private String userId;
	private String subject;
	private String content;
	
}
