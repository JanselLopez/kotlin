// WITH_STDLIB
package test

fun box() = E.E1.f() + E.E2.f()

enum class E {
    E1 {
        override fun f(): String {
            return super<E>.f() + "O"
        }
    },
    E2 {
        override fun f(): String {
            return super.f() + "K"
        }
    };

    open fun f() = ""
}