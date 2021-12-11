package me.scriptori.test

import me.scriptori.caesarCipher
import kotlin.test.Test
import kotlin.test.assertEquals

class CaesarCipherTest {
    @Test
    fun `password Caesar Cipher encryption test`() {
        assertEquals(
            "Wkhuh'v d vwdupdq zdlwlqj lq wkh vnb",
            caesarCipher("There's a starman waiting in the sky", 3)
        )
    }
}
