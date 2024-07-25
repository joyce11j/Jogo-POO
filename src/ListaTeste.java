import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListaTeste {

    @Test
    void testAdicionar() {
        Lista l = new Lista(3);
        assertEquals(0, l.getTamanho());
        assertDoesNotThrow(() -> l.adicionar("a"));
        assertEquals(1, l.getTamanho());
        assertDoesNotThrow(() -> l.adicionar("b"));
        assertEquals(2, l.getTamanho());
        assertDoesNotThrow(() -> l.adicionar("c"));
        assertEquals(3, l.getTamanho());

        assertThrows(ArrayOutOfSpaceException.class, () -> l.adicionar("d"));
        assertEquals(3, l.getTamanho());
    }

    @Test
    void testRemover() {
        Lista l = new Lista(3);
        assertDoesNotThrow(() -> l.adicionar("a"));
        assertDoesNotThrow(() -> l.adicionar("b"));
        assertDoesNotThrow(() -> l.adicionar("c"));

        assertDoesNotThrow(() -> l.remover(0));
        assertDoesNotThrow(() -> l.remover(0));
        assertDoesNotThrow(() -> l.remover(0));

        assertEquals(0, l.getTamanho());

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> l.remover(0));
    }

    @Test
    void testGet() {
        Lista l = new Lista(3);
        assertDoesNotThrow(() -> l.adicionar("a"));
        assertDoesNotThrow(() -> l.adicionar("b"));
        assertDoesNotThrow(() -> l.adicionar("c"));

        assertEquals("a", l.get(0));
        assertDoesNotThrow(() -> l.remover(0));
        assertEquals("b", l.get(0));

        assertDoesNotThrow(() -> l.adicionar("d"));
        assertEquals("b", l.get(0));
        assertEquals("c", l.get(1));
        assertEquals("d", l.get(2));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> l.get(4));
    }

    @Test
    void testContem() {
        Lista l = new Lista(3);
        assertDoesNotThrow(() -> l.adicionar("a"));
        assertDoesNotThrow(() -> l.adicionar("b"));
        assertDoesNotThrow(() -> l.adicionar("c"));

        assertTrue(l.contem("a"));
        assertTrue(l.contem("b"));
        assertTrue(l.contem("c"));
        assertFalse(l.contem("d"));
    }
}