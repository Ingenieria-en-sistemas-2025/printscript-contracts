package io.printscript.contracts.tests

import io.printscript.contracts.Request

data class RunTestsReq(override val language: String, override val version: String, override val content: String, val testCases: List<RunTestCaseDto>, val options: RunTestsOptionsDto? = null) :
    Request
