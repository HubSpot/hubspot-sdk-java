package com.hubspot.sdk.errors

class HubSpotInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : HubSpotException(message, cause)
