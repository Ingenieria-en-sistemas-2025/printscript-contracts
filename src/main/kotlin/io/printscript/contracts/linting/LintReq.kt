package io.printscript.contracts.linting

import io.printscript.contracts.Request

data class LintReq(override val language: String, override val version: String, override val content: String, val configText: String? = null, val configFormat: String? = null) :
    Request
