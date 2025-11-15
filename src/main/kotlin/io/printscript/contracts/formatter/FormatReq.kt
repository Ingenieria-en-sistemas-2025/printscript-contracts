package io.printscript.contracts.formatter

import io.printscript.contracts.Request

data class FormatReq(override val language: String, override val version: String, override val content: String, val configText: String? = null, val configFormat: String? = null, val options: FormatterOptionsDto? = null) :
    Request
