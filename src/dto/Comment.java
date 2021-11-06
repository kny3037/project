package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

	private int idx; 
	private int writingIdx;
	private String userId; 
	private String content;
	private short pro;
	
	}
