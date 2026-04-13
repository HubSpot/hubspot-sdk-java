package com.hubspot.errors

class HubSpotIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : HubSpotException(message, cause)
