// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.errors

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.http.Headers

abstract class HubSpotServiceException
protected constructor(message: String, cause: Throwable? = null) :
    HubSpotException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
