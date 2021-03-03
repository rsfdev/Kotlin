package one.digitalinnovation.collections

import java.math.BigDecimal

fun Array<BigDecimal>.soma() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if (this.isEmpty()) BigDecimal.ZERO
    else this.soma() / this.size.toBigDecimal()