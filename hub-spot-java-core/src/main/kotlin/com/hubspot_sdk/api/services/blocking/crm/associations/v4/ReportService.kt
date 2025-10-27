// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.v4

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.v4.ReportCreationResponse
import com.hubspot_sdk.api.models.crm.associations.v4.report.ReportRequestHighUsageReportParams
import java.util.function.Consumer

interface ReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService

    /** Requests a report of all objects in the portal which have a high usage of associations */
    fun requestHighUsageReport(userId: Int): ReportCreationResponse =
        requestHighUsageReport(userId, ReportRequestHighUsageReportParams.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        params: ReportRequestHighUsageReportParams = ReportRequestHighUsageReportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportCreationResponse =
        requestHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        params: ReportRequestHighUsageReportParams = ReportRequestHighUsageReportParams.none(),
    ): ReportCreationResponse = requestHighUsageReport(userId, params, RequestOptions.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        params: ReportRequestHighUsageReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportCreationResponse

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(params: ReportRequestHighUsageReportParams): ReportCreationResponse =
        requestHighUsageReport(params, RequestOptions.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        requestOptions: RequestOptions,
    ): ReportCreationResponse =
        requestHighUsageReport(userId, ReportRequestHighUsageReportParams.none(), requestOptions)

    /** A view of [ReportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /crm/v4/associations/usage/high-usage-report/{userId}`, but is otherwise the same as
         * [ReportService.requestHighUsageReport].
         */
        @MustBeClosed
        fun requestHighUsageReport(userId: Int): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(userId, ReportRequestHighUsageReportParams.none())

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            userId: Int,
            params: ReportRequestHighUsageReportParams = ReportRequestHighUsageReportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            userId: Int,
            params: ReportRequestHighUsageReportParams = ReportRequestHighUsageReportParams.none(),
        ): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(userId, params, RequestOptions.none())

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            params: ReportRequestHighUsageReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportCreationResponse>

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            params: ReportRequestHighUsageReportParams
        ): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(params, RequestOptions.none())

        /** @see requestHighUsageReport */
        @MustBeClosed
        fun requestHighUsageReport(
            userId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportCreationResponse> =
            requestHighUsageReport(
                userId,
                ReportRequestHighUsageReportParams.none(),
                requestOptions,
            )
    }
}
