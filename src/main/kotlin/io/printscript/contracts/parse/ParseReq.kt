package io.printscript.contracts.parse

import io.printscript.contracts.Request

data class ParseReq(override val language: String, override val version: String, override val content: String) : Request
