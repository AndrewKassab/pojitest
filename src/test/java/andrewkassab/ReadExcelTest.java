package andrewkassab;

import com.poiji.bind.Poiji;
import com.poiji.option.PoijiOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadExcelTest {

    @Test
    void testReadExcel() {
        Path currentDirectory = Paths.get("src","test","java", "andrewkassab");
        var filePath = currentDirectory.toFile().getAbsolutePath() + "/tests.xlsx";

        List<TestModel> tests = Poiji.fromExcel(new File(filePath), TestModel.class);

        TestModel firstItem = tests.get(0);
        System.out.println(firstItem.getName());
    }
}
