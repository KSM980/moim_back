package data.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("Precaution")
public class Precaution {
    private int num;
    private String content;
    private int roomNum;
}
