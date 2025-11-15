package io.printscript.contracts.permissions

data class SnippetPermissionListResponse(
    val authorizations: List<PermissionSnippet>,
    val total: Int,
)