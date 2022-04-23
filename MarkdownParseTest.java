import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksTest() throws IOException {
        List<String> expectedList = List.of("https://something.com","some-thing.html");

        Path fileName = Path.of("/Users/matveyvilkin/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expectedList, links);
    }

    @Test
    public void getLinksTest2() throws IOException {
        List<String> expectedList = List.of("https://something.com","some-page.html");

        Path fileName = Path.of("/Users/matveyvilkin/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expectedList, links);
    }

    
    @Test
    public void getLinksTest3() throws IOException {
        List<String> expectedList = new ArrayList<>();

        Path fileName = Path.of("/Users/matveyvilkin/Documents/GitHub/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expectedList, links);
    }
    /*

    @Test
    public void getLinksTest5() throws IOException {
        List<String> expectedList = List.of("https://something.com","some-thing.html");

        Path fileName = Path.of("/Users/matveyvilkin/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expectedList, links);
    }

    @Test
    public void getLinksTest6() throws IOException {
        List<String> expectedList = List.of("https://something.com","some-thing.html");

        Path fileName = Path.of("/Users/matveyvilkin/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expectedList, links);
    }

    @Test
    public void getLinksTest7() throws IOException {
        List<String> expectedList = List.of("https://something.com","some-thing.html");

        Path fileName = Path.of("/Users/matveyvilkin/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expectedList, links);
    }

    @Test
    public void getLinksTest8() throws IOException {
        List<String> expectedList = List.of("https://something.com","some-thing.html");

        Path fileName = Path.of("/Users/matveyvilkin/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expectedList, links);
    }
    */
}