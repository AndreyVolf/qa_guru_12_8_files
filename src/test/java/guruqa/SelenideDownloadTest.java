package guruqa;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class SelenideDownloadTest {

    @Test
    void downloadTest() throws FileNotFoundException {
        Selenide.open("https://github.com/junit-team/junit5/blob/main/README.md");
        File textFile = $("#raw-url").download();
        System.out.println();



    }





}
