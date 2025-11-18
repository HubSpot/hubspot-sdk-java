// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associations.v4

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.v4.ReportCreationResponse
import com.hubspot_sdk.api.models.crm.associations.v4.report.ReportRequestHighUsageReportParams
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
    fun requestHighUsageReport(userId: Int): CompletableFuture<ReportCreationResponse> =
        requestHighUsageReport(userId, ReportRequestHighUsageReportParams.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        params: ReportRequestHighUsageReportParams = ReportRequestHighUsageReportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportCreationResponse> =
        requestHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        params: ReportRequestHighUsageReportParams = ReportRequestHighUsageReportParams.none(),
    ): CompletableFuture<ReportCreationResponse> =
        requestHighUsageReport(userId, params, RequestOptions.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        params: ReportRequestHighUsageReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportCreationResponse>

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        params: ReportRequestHighUsageReportParams
    ): CompletableFuture<ReportCreationResponse> =
        requestHighUsageReport(params, RequestOptions.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportCreationResponse> =
        requestHighUsageReport(userId, ReportRequestHighUsageReportParams.none(), requestOptions)

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
         * [ReportServiceAsync.requestHighUsageReport].
         */
        fun requestHighUsageReport(
            userId: Int
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            requestHighUsageReport(userId, ReportRequestHighUsageReportParams.none())

        /** @see requestHighUsageReport */
        fun requestHighUsageReport(
            userId: Int,
            params: ReportRequestHighUsageReportParams = ReportRequestHighUsageReportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            requestHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see requestHighUsageReport */
        fun requestHighUsageReport(
            userId: Int,
            params: ReportRequestHighUsageReportParams = ReportRequestHighUsageReportParams.none(),
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            requestHighUsageReport(userId, params, RequestOptions.none())

        /** @see requestHighUsageReport */
        fun requestHighUsageReport(
            params: ReportRequestHighUsageReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>>

        /** @see requestHighUsageReport */
        fun requestHighUsageReport(
            params: ReportRequestHighUsageReportParams
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            requestHighUsageReport(params, RequestOptions.none())

        /** @see requestHighUsageReport */
        fun requestHighUsageReport(
            userId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            requestHighUsageReport(
                userId,
                ReportRequestHighUsageReportParams.none(),
                requestOptions,
            )
    }
}
