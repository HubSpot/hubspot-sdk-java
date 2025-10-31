// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.v4

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.v4.ReportCreationResponse
import com.hubspot_sdk.api.models.crm.associations.v4.report.ReportGetHighUsageReportParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportServiceAsync

    /** Requests a report of all objects in the portal which have a high usage of associations */
    fun getHighUsageReport(userId: Int): CompletableFuture<ReportCreationResponse> =
        getHighUsageReport(userId, ReportGetHighUsageReportParams.none())

    /** @see getHighUsageReport */
    fun getHighUsageReport(
        userId: Int,
        params: ReportGetHighUsageReportParams = ReportGetHighUsageReportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportCreationResponse> =
        getHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see getHighUsageReport */
    fun getHighUsageReport(
        userId: Int,
        params: ReportGetHighUsageReportParams = ReportGetHighUsageReportParams.none(),
    ): CompletableFuture<ReportCreationResponse> =
        getHighUsageReport(userId, params, RequestOptions.none())

    /** @see getHighUsageReport */
    fun getHighUsageReport(
        params: ReportGetHighUsageReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportCreationResponse>

    /** @see getHighUsageReport */
    fun getHighUsageReport(
        params: ReportGetHighUsageReportParams
    ): CompletableFuture<ReportCreationResponse> = getHighUsageReport(params, RequestOptions.none())

    /** @see getHighUsageReport */
    fun getHighUsageReport(
        userId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportCreationResponse> =
        getHighUsageReport(userId, ReportGetHighUsageReportParams.none(), requestOptions)

    /**
     * A view of [ReportServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/usage/high-usage-report/{userId}`, but is otherwise the same as
         * [ReportServiceAsync.getHighUsageReport].
         */
        fun getHighUsageReport(
            userId: Int
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            getHighUsageReport(userId, ReportGetHighUsageReportParams.none())

        /** @see getHighUsageReport */
        fun getHighUsageReport(
            userId: Int,
            params: ReportGetHighUsageReportParams = ReportGetHighUsageReportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            getHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see getHighUsageReport */
        fun getHighUsageReport(
            userId: Int,
            params: ReportGetHighUsageReportParams = ReportGetHighUsageReportParams.none(),
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            getHighUsageReport(userId, params, RequestOptions.none())

        /** @see getHighUsageReport */
        fun getHighUsageReport(
            params: ReportGetHighUsageReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>>

        /** @see getHighUsageReport */
        fun getHighUsageReport(
            params: ReportGetHighUsageReportParams
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            getHighUsageReport(params, RequestOptions.none())

        /** @see getHighUsageReport */
        fun getHighUsageReport(
            userId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            getHighUsageReport(userId, ReportGetHighUsageReportParams.none(), requestOptions)
    }
}
