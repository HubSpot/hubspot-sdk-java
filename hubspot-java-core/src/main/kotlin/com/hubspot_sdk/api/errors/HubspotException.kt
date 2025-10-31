package com.hubspot_sdk.api.errors

open class HubspotException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
