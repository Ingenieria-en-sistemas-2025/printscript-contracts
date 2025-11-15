package io.printscript.contracts.tests

data class RunSingleTestReq(val language: String, val version: String, val content: String, val inputs: List<String> = emptyList(), val expectedOutputs: List<String> = emptyList(), val options: RunTestsOptionsDto? = null)
