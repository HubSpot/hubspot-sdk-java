// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations.v4

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.associations.ReportCreationResponse
import com.hubspot_sdk.api.models.crm.associations.v4.report.ReportGetHighUsageReportParams
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
    fun getHighUsageReport(userId: Int): ReportCreationResponse =
        getHighUsageReport(userId, ReportGetHighUsageReportParams.none())

    /** @see getHighUsageReport */
    fun getHighUsageReport(
        userId: Int,
        params: ReportGetHighUsageReportParams = ReportGetHighUsageReportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportCreationResponse =
        getHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see getHighUsageReport */
    fun getHighUsageReport(
        userId: Int,
        params: ReportGetHighUsageReportParams = ReportGetHighUsageReportParams.none(),
    ): ReportCreationResponse = getHighUsageReport(userId, params, RequestOptions.none())

    /** @see getHighUsageReport */
    fun getHighUsageReport(
        params: ReportGetHighUsageReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportCreationResponse

    /** @see getHighUsageReport */
    fun getHighUsageReport(params: ReportGetHighUsageReportParams): ReportCreationResponse =
        getHighUsageReport(params, RequestOptions.none())

    /** @see getHighUsageReport */
    fun getHighUsageReport(userId: Int, requestOptions: RequestOptions): ReportCreationResponse =
        getHighUsageReport(userId, ReportGetHighUsageReportParams.none(), requestOptions)

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
         * [ReportService.getHighUsageReport].
         */
        @MustBeClosed
        fun getHighUsageReport(userId: Int): HttpResponseFor<ReportCreationResponse> =
            getHighUsageReport(userId, ReportGetHighUsageReportParams.none())

        /** @see getHighUsageReport */
        @MustBeClosed
        fun getHighUsageReport(
            userId: Int,
            params: ReportGetHighUsageReportParams = ReportGetHighUsageReportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportCreationResponse> =
            getHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see getHighUsageReport */
        @MustBeClosed
        fun getHighUsageReport(
            userId: Int,
            params: ReportGetHighUsageReportParams = ReportGetHighUsageReportParams.none(),
        ): HttpResponseFor<ReportCreationResponse> =
            getHighUsageReport(userId, params, RequestOptions.none())

        /** @see getHighUsageReport */
        @MustBeClosed
        fun getHighUsageReport(
            params: ReportGetHighUsageReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportCreationResponse>

        /** @see getHighUsageReport */
        @MustBeClosed
        fun getHighUsageReport(
            params: ReportGetHighUsageReportParams
        ): HttpResponseFor<ReportCreationResponse> =
            getHighUsageReport(params, RequestOptions.none())

        /** @see getHighUsageReport */
        @MustBeClosed
        fun getHighUsageReport(
            userId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportCreationResponse> =
            getHighUsageReport(userId, ReportGetHighUsageReportParams.none(), requestOptions)
    }
}
