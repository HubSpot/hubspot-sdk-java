// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.TaskLocator
import com.hubspot.models.crm.exports.ActionResponseWithSingleResultUri
import com.hubspot.models.crm.exports.ExportCreateAsyncParams
import com.hubspot.models.crm.exports.ExportGetParams
import com.hubspot.models.crm.exports.ExportGetStatusParams
import com.hubspot.models.crm.exports.PublicExportListRequest
import com.hubspot.models.crm.exports.PublicExportRequest
import com.hubspot.models.crm.exports.PublicExportResponse
import com.hubspot.models.crm.exports.PublicExportViewRequest
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExportServiceAsync

    /** Begins exporting CRM data for the portal as specified in the request body */
    fun createAsync(params: ExportCreateAsyncParams): CompletableFuture<TaskLocator> =
        createAsync(params, RequestOptions.none())

    /** @see createAsync */
    fun createAsync(
        params: ExportCreateAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaskLocator>

    /** @see createAsync */
    fun createAsync(
        publicExportRequest: PublicExportRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaskLocator> =
        createAsync(
            ExportCreateAsyncParams.builder().publicExportRequest(publicExportRequest).build(),
            requestOptions,
        )

    /** @see createAsync */
    fun createAsync(publicExportRequest: PublicExportRequest): CompletableFuture<TaskLocator> =
        createAsync(publicExportRequest, RequestOptions.none())

    /** @see createAsync */
    fun createAsync(
        view: PublicExportViewRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaskLocator> =
        createAsync(PublicExportRequest.ofView(view), requestOptions)

    /** @see createAsync */
    fun createAsync(view: PublicExportViewRequest): CompletableFuture<TaskLocator> =
        createAsync(view, RequestOptions.none())

    /** @see createAsync */
    fun createAsync(
        list: PublicExportListRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaskLocator> =
        createAsync(PublicExportRequest.ofList(list), requestOptions)

    /** @see createAsync */
    fun createAsync(list: PublicExportListRequest): CompletableFuture<TaskLocator> =
        createAsync(list, RequestOptions.none())

    /**
     * Retrieve detailed information about a specific CRM export, including its current state and
     * properties.
     */
    fun get(exportId: Long): CompletableFuture<PublicExportResponse> =
        get(exportId, ExportGetParams.none())

    /** @see get */
    fun get(
        exportId: Long,
        params: ExportGetParams = ExportGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicExportResponse> =
        get(params.toBuilder().exportId(exportId).build(), requestOptions)

    /** @see get */
    fun get(
        exportId: Long,
        params: ExportGetParams = ExportGetParams.none(),
    ): CompletableFuture<PublicExportResponse> = get(exportId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: ExportGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublicExportResponse>

    /** @see get */
    fun get(params: ExportGetParams): CompletableFuture<PublicExportResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        exportId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<PublicExportResponse> =
        get(exportId, ExportGetParams.none(), requestOptions)

    /**
     * Returns the status of the export with taskId, including the URL of the resulting file if the
     * export status is COMPLETE
     */
    fun getStatus(taskId: Long): CompletableFuture<ActionResponseWithSingleResultUri> =
        getStatus(taskId, ExportGetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        taskId: Long,
        params: ExportGetStatusParams = ExportGetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithSingleResultUri> =
        getStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(
        taskId: Long,
        params: ExportGetStatusParams = ExportGetStatusParams.none(),
    ): CompletableFuture<ActionResponseWithSingleResultUri> =
        getStatus(taskId, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: ExportGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithSingleResultUri>

    /** @see getStatus */
    fun getStatus(
        params: ExportGetStatusParams
    ): CompletableFuture<ActionResponseWithSingleResultUri> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        taskId: Long,
        requestOptions: RequestOptions,
    ): CompletableFuture<ActionResponseWithSingleResultUri> =
        getStatus(taskId, ExportGetStatusParams.none(), requestOptions)

    /**
     * A view of [ExportServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/exports/2026-03/export/async`, but is
         * otherwise the same as [ExportServiceAsync.createAsync].
         */
        fun createAsync(
            params: ExportCreateAsyncParams
        ): CompletableFuture<HttpResponseFor<TaskLocator>> =
            createAsync(params, RequestOptions.none())

        /** @see createAsync */
        fun createAsync(
            params: ExportCreateAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaskLocator>>

        /** @see createAsync */
        fun createAsync(
            publicExportRequest: PublicExportRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaskLocator>> =
            createAsync(
                ExportCreateAsyncParams.builder().publicExportRequest(publicExportRequest).build(),
                requestOptions,
            )

        /** @see createAsync */
        fun createAsync(
            publicExportRequest: PublicExportRequest
        ): CompletableFuture<HttpResponseFor<TaskLocator>> =
            createAsync(publicExportRequest, RequestOptions.none())

        /** @see createAsync */
        fun createAsync(
            view: PublicExportViewRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaskLocator>> =
            createAsync(PublicExportRequest.ofView(view), requestOptions)

        /** @see createAsync */
        fun createAsync(
            view: PublicExportViewRequest
        ): CompletableFuture<HttpResponseFor<TaskLocator>> =
            createAsync(view, RequestOptions.none())

        /** @see createAsync */
        fun createAsync(
            list: PublicExportListRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaskLocator>> =
            createAsync(PublicExportRequest.ofList(list), requestOptions)

        /** @see createAsync */
        fun createAsync(
            list: PublicExportListRequest
        ): CompletableFuture<HttpResponseFor<TaskLocator>> =
            createAsync(list, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /crm/exports/2026-03/export/{exportId}`, but is
         * otherwise the same as [ExportServiceAsync.get].
         */
        fun get(exportId: Long): CompletableFuture<HttpResponseFor<PublicExportResponse>> =
            get(exportId, ExportGetParams.none())

        /** @see get */
        fun get(
            exportId: Long,
            params: ExportGetParams = ExportGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicExportResponse>> =
            get(params.toBuilder().exportId(exportId).build(), requestOptions)

        /** @see get */
        fun get(
            exportId: Long,
            params: ExportGetParams = ExportGetParams.none(),
        ): CompletableFuture<HttpResponseFor<PublicExportResponse>> =
            get(exportId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: ExportGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublicExportResponse>>

        /** @see get */
        fun get(params: ExportGetParams): CompletableFuture<HttpResponseFor<PublicExportResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            exportId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PublicExportResponse>> =
            get(exportId, ExportGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /crm/exports/2026-03/export/async/tasks/{taskId}/status`, but is otherwise the same as
         * [ExportServiceAsync.getStatus].
         */
        fun getStatus(
            taskId: Long
        ): CompletableFuture<HttpResponseFor<ActionResponseWithSingleResultUri>> =
            getStatus(taskId, ExportGetStatusParams.none())

        /** @see getStatus */
        fun getStatus(
            taskId: Long,
            params: ExportGetStatusParams = ExportGetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithSingleResultUri>> =
            getStatus(params.toBuilder().taskId(taskId).build(), requestOptions)

        /** @see getStatus */
        fun getStatus(
            taskId: Long,
            params: ExportGetStatusParams = ExportGetStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithSingleResultUri>> =
            getStatus(taskId, params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            params: ExportGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithSingleResultUri>>

        /** @see getStatus */
        fun getStatus(
            params: ExportGetStatusParams
        ): CompletableFuture<HttpResponseFor<ActionResponseWithSingleResultUri>> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            taskId: Long,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ActionResponseWithSingleResultUri>> =
            getStatus(taskId, ExportGetStatusParams.none(), requestOptions)
    }
}
