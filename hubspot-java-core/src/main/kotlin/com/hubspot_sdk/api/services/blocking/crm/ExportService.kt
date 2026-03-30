// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.TaskLocator
import com.hubspot_sdk.api.models.crm.exports.ActionResponseWithSingleResultUri
import com.hubspot_sdk.api.models.crm.exports.ExportCreateAsyncParams
import com.hubspot_sdk.api.models.crm.exports.ExportGetParams
import com.hubspot_sdk.api.models.crm.exports.ExportGetStatusParams
import com.hubspot_sdk.api.models.crm.exports.PublicExportListRequest
import com.hubspot_sdk.api.models.crm.exports.PublicExportRequest
import com.hubspot_sdk.api.models.crm.exports.PublicExportResponse
import com.hubspot_sdk.api.models.crm.exports.PublicExportViewRequest
import java.util.function.Consumer

interface ExportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExportService

    /** Begins exporting CRM data for the portal as specified in the request body */
    fun createAsync(params: ExportCreateAsyncParams): TaskLocator =
        createAsync(params, RequestOptions.none())

    /** @see createAsync */
    fun createAsync(
        params: ExportCreateAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaskLocator

    /** @see createAsync */
    fun createAsync(
        publicExportRequest: PublicExportRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaskLocator =
        createAsync(
            ExportCreateAsyncParams.builder().publicExportRequest(publicExportRequest).build(),
            requestOptions,
        )

    /** @see createAsync */
    fun createAsync(publicExportRequest: PublicExportRequest): TaskLocator =
        createAsync(publicExportRequest, RequestOptions.none())

    /** @see createAsync */
    fun createAsync(
        view: PublicExportViewRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaskLocator = createAsync(PublicExportRequest.ofView(view), requestOptions)

    /** @see createAsync */
    fun createAsync(view: PublicExportViewRequest): TaskLocator =
        createAsync(view, RequestOptions.none())

    /** @see createAsync */
    fun createAsync(
        list: PublicExportListRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaskLocator = createAsync(PublicExportRequest.ofList(list), requestOptions)

    /** @see createAsync */
    fun createAsync(list: PublicExportListRequest): TaskLocator =
        createAsync(list, RequestOptions.none())

    /**
     * Retrieve detailed information about a specific CRM export, including its current state and
     * properties.
     */
    fun get(exportId: Long): PublicExportResponse = get(exportId, ExportGetParams.none())

    /** @see get */
    fun get(
        exportId: Long,
        params: ExportGetParams = ExportGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicExportResponse = get(params.toBuilder().exportId(exportId).build(), requestOptions)

    /** @see get */
    fun get(
        exportId: Long,
        params: ExportGetParams = ExportGetParams.none(),
    ): PublicExportResponse = get(exportId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ExportGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublicExportResponse

    /** @see get */
    fun get(params: ExportGetParams): PublicExportResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(exportId: Long, requestOptions: RequestOptions): PublicExportResponse =
        get(exportId, ExportGetParams.none(), requestOptions)

    /**
     * Returns the status of the export with taskId, including the URL of the resulting file if the
     * export status is COMPLETE
     */
    fun getStatus(taskId: Long): ActionResponseWithSingleResultUri =
        getStatus(taskId, ExportGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        taskId: Long,
        params: ExportGetStatusParams = ExportGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithSingleResultUri =
        getStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        taskId: Long,
        params: ExportGetStatusParams = ExportGetStatusParams.none(),
    ): ActionResponseWithSingleResultUri = getStatus(taskId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: ExportGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithSingleResultUri

    /** @see getStatus */
    fun getStatus(params: ExportGetStatusParams): ActionResponseWithSingleResultUri =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(taskId: Long, requestOptions: RequestOptions): ActionResponseWithSingleResultUri =
        getStatus(taskId, ExportGetStatusParams.none(), requestOptions)

    /** A view of [ExportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/exports/2026-03/export/async`, but is
         * otherwise the same as [ExportService.createAsync].
         */
        @MustBeClosed
        fun createAsync(params: ExportCreateAsyncParams): HttpResponseFor<TaskLocator> =
            createAsync(params, RequestOptions.none())

        /** @see createAsync */
        @MustBeClosed
        fun createAsync(
            params: ExportCreateAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaskLocator>

        /** @see createAsync */
        @MustBeClosed
        fun createAsync(
            publicExportRequest: PublicExportRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaskLocator> =
            createAsync(
                ExportCreateAsyncParams.builder().publicExportRequest(publicExportRequest).build(),
                requestOptions,
            )

        /** @see createAsync */
        @MustBeClosed
        fun createAsync(publicExportRequest: PublicExportRequest): HttpResponseFor<TaskLocator> =
            createAsync(publicExportRequest, RequestOptions.none())

        /** @see createAsync */
        @MustBeClosed
        fun createAsync(
            view: PublicExportViewRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaskLocator> =
            createAsync(PublicExportRequest.ofView(view), requestOptions)

        /** @see createAsync */
        @MustBeClosed
        fun createAsync(view: PublicExportViewRequest): HttpResponseFor<TaskLocator> =
            createAsync(view, RequestOptions.none())

        /** @see createAsync */
        @MustBeClosed
        fun createAsync(
            list: PublicExportListRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaskLocator> =
            createAsync(PublicExportRequest.ofList(list), requestOptions)

        /** @see createAsync */
        @MustBeClosed
        fun createAsync(list: PublicExportListRequest): HttpResponseFor<TaskLocator> =
            createAsync(list, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /crm/exports/2026-03/export/{exportId}`, but is
         * otherwise the same as [ExportService.get].
         */
        @MustBeClosed
        fun get(exportId: Long): HttpResponseFor<PublicExportResponse> =
            get(exportId, ExportGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            exportId: Long,
            params: ExportGetParams = ExportGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicExportResponse> =
            get(params.toBuilder().exportId(exportId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            exportId: Long,
            params: ExportGetParams = ExportGetParams.none(),
        ): HttpResponseFor<PublicExportResponse> = get(exportId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: ExportGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublicExportResponse>

        /** @see get */
        @MustBeClosed
        fun get(params: ExportGetParams): HttpResponseFor<PublicExportResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            exportId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PublicExportResponse> =
            get(exportId, ExportGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/exports/2026-03/export/async/tasks/{taskId}/status`, but is otherwise the same as
         * [ExportService.getStatus].
         */
        @MustBeClosed
        fun getStatus(taskId: Long): HttpResponseFor<ActionResponseWithSingleResultUri> =
            getStatus(taskId, ExportGetStatusParams.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            taskId: Long,
            params: ExportGetStatusParams = ExportGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithSingleResultUri> =
            getStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            taskId: Long,
            params: ExportGetStatusParams = ExportGetStatusParams.none(),
        ): HttpResponseFor<ActionResponseWithSingleResultUri> =
            getStatus(taskId, params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: ExportGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithSingleResultUri>

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: ExportGetStatusParams
        ): HttpResponseFor<ActionResponseWithSingleResultUri> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            taskId: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionResponseWithSingleResultUri> =
            getStatus(taskId, ExportGetStatusParams.none(), requestOptions)
    }
}
