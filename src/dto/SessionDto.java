package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class SessionDto {

	private int idx;
	private String id;
	private String name;
	private String email;
	private String proIdx;
}
