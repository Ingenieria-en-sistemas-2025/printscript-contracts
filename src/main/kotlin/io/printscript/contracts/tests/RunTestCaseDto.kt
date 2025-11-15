package io.printscript.contracts.tests

data class RunTestCaseDto(val inputs: List<String> = emptyList(), val expectedOutputs: List<String> = emptyList())
