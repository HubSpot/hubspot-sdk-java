package com.hubspot.errors

class HubSpotInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : HubSpotException(message, cause)
