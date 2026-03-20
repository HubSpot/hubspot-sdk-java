// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.objects.ContactService
import com.hubspot_sdk.api.services.blocking.crm.objects.CustomService
import com.hubspot_sdk.api.services.blocking.crm.objects.TaskService
import java.util.function.Consumer

interface ObjectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectService

    fun contacts(): ContactService

    fun custom(): CustomService

    fun tasks(): TaskService

    /** A view of [ObjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectService.WithRawResponse

        fun contacts(): ContactService.WithRawResponse

        fun custom(): CustomService.WithRawResponse

        fun tasks(): TaskService.WithRawResponse
    }
}
