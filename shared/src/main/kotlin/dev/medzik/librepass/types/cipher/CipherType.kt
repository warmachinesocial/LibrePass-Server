package dev.medzik.librepass.types.cipher

/**
 * CipherType is an enum class that represents the type of cipher.
 */
enum class CipherType {
    Login,
    SecureNote,
    Card;

    companion object {
        /**
         * Returns the [CipherType] from the given type integer.
         * @param type cipher type
         */
        fun from(type: Int) = values()[type]
    }
}