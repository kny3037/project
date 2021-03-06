package dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Writing {

	private int idx;
	private String categoryIdx;
	private String name;
	private String userId;
	private String subject;
	private String content;
	private String readCount;
	private short commentCount;
	private Timestamp wdate;
}
