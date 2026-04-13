// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.errors

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.http.Headers

abstract class HubSpotServiceException
protected constructor(message: String, cause: Throwable? = null) :
    HubSpotException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
