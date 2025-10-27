// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.TaskLocator
import com.hubspot_sdk.api.models.crm.exports.ActionResponseWithSingleResultUri
import com.hubspot_sdk.api.models.crm.exports.ExportCreateParams
import com.hubspot_sdk.api.models.crm.exports.ExportGetStatusParams
import com.hubspot_sdk.api.models.crm.exports.PublicExportRequest
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
    fun create(params: ExportCreateParams): CompletableFuture<TaskLocator> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaskLocator>

    /** @see create */
    fun create(
        publicExportRequest: PublicExportRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TaskLocator> =
        create(
            ExportCreateParams.builder().publicExportRequest(publicExportRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(publicExportRequest: PublicExportRequest): CompletableFuture<TaskLocator> =
        create(publicExportRequest, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /crm/v3/exports/export/async`, but is otherwise the
         * same as [ExportServiceAsync.create].
         */
        fun create(params: ExportCreateParams): CompletableFuture<HttpResponseFor<TaskLocator>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaskLocator>>

        /** @see create */
        fun create(
            publicExportRequest: PublicExportRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TaskLocator>> =
            create(
                ExportCreateParams.builder().publicExportRequest(publicExportRequest).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            publicExportRequest: PublicExportRequest
        ): CompletableFuture<HttpResponseFor<TaskLocator>> =
            create(publicExportRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /crm/v3/exports/export/async/tasks/{taskId}/status`,
         * but is otherwise the same as [ExportServiceAsync.getStatus].
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
