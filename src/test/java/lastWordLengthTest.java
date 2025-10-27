
import static org.junit.Assert.*;
import org.junit.Test;
import Codebase.Scripts.lastWordLength;

public class lastWordLengthTest {
    @Test
    public void testLengthOfLastWord() {
        lastWordLength lwl = new lastWordLength();
        
        assert lwl.lengthOfLastWord("Hello World") == 5;
        assert lwl.lengthOfLastWord("   fly me   to   the moon  ") == 4;
        assert lwl.lengthOfLastWord("luffy is still joyboy") == 6;
        assert lwl.lengthOfLastWord("a") == 1;
        assert lwl.lengthOfLastWord(" ") == 0;
    }
}