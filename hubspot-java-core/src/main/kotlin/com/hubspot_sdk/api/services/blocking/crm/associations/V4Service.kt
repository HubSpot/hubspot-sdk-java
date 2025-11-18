// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.associations.v4.V4MergeParams
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.BatchService
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.ReportService
import java.util.function.Consumer

interface V4Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service

    fun batch(): BatchService

    fun report(): ReportService

    /** Merge two CRM objects of the specified type into one. */
    fun merge(objectType: String, params: V4MergeParams): SimplePublicObject =
        merge(objectType, params, RequestOptions.none())

    /** @see merge */
    fun merge(
        objectType: String,
        params: V4MergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = merge(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see merge */
    fun merge(params: V4MergeParams): SimplePublicObject = merge(params, RequestOptions.none())

    /** @see merge */
    fun merge(
        params: V4MergeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** A view of [V4Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        fun report(): ReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/v4/objects/{objectType}/merge`, but is
         * otherwise the same as [V4Service.merge].
         */
        @MustBeClosed
        fun merge(objectType: String, params: V4MergeParams): HttpResponseFor<SimplePublicObject> =
            merge(objectType, params, RequestOptions.none())

        /** @see merge */
        @MustBeClosed
        fun merge(
            objectType: String,
            params: V4MergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            merge(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see merge */
        @MustBeClosed
        fun merge(params: V4MergeParams): HttpResponseFor<SimplePublicObject> =
            merge(params, RequestOptions.none())

        /** @see merge */
        @MustBeClosed
        fun merge(
            params: V4MergeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>
    }
}
