package andrewkassab;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelRow;
import lombok.Getter;

@Getter
public class TestModel {

    @ExcelRow
    private int rowIndex;

    @ExcelCell(0)
    private int id;

    @ExcelCell(1)
    private String name;

}
