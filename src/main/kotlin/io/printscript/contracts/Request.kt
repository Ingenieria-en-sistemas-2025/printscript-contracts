package io.printscript.contracts

interface Request {
    val language: String
    val version: String
    val content: String
}