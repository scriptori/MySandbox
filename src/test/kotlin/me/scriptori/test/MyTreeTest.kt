package me.scriptori.test

import kotlin.test.Test
import kotlin.test.assertEquals
import me.scriptori.MyTree
import me.scriptori.model.Node

class MyTreeTest {
    private val tree = MyTree(Node("A")).also {
        it.root.apply {
            left = Node("B").apply {
                left = Node("D")
                right = Node("E")
            }
            right = Node("C").apply {
                left = Node("F")
                right = Node("G")
            }
        }
    }

    @Test
    fun nodeLevelTest() {
        assertEquals(0, tree.getLevel("A"))
        assertEquals(1, tree.getLevel("B"))
        assertEquals(1, tree.getLevel("C"))
        assertEquals(2, tree.getLevel("D"))
        assertEquals(2, tree.getLevel("E"))
        assertEquals(2, tree.getLevel("F"))
        assertEquals(2, tree.getLevel("G"))
        assertEquals(-1, tree.getLevel("H"))
    }

    @Test
    fun nodePathTest() {
        assertEquals(3, tree.getPathNodes("E")!!.size)
        assertEquals("A -> B", tree.getPath("B"))
        assertEquals("A -> B -> E", tree.getPath("E"))
        assertEquals("A -> C -> G", tree.getPath("G"))
    }
}
