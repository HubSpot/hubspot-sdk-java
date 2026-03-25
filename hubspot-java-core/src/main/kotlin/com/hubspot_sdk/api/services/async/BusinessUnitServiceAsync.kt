// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.async.BusinessUnitServiceAsync
import com.hubspot_sdk.api.services.async.businessunits.BusinessUnitServiceAsync
import java.util.function.Consumer

interface BusinessUnitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BusinessUnitServiceAsync

    fun businessUnits(): BusinessUnitServiceAsync

    /**
     * A view of [BusinessUnitServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BusinessUnitServiceAsync.WithRawResponse

        fun businessUnits(): BusinessUnitServiceAsync.WithRawResponse
    }
}
