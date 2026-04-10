package com.hubspot_sdk.api.errors

open class HubSpotException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
