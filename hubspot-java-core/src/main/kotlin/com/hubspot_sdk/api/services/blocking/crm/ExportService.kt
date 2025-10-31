// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.TaskLocator
import com.hubspot_sdk.api.models.crm.exports.ActionResponseWithSingleResultUri
import com.hubspot_sdk.api.models.crm.exports.ExportCreateParams
import com.hubspot_sdk.api.models.crm.exports.ExportGetStatusParams
import com.hubspot_sdk.api.models.crm.exports.PublicExportRequest
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
    fun create(params: ExportCreateParams): TaskLocator = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaskLocator

    /** @see create */
    fun create(
        publicExportRequest: PublicExportRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TaskLocator =
        create(
            ExportCreateParams.builder().publicExportRequest(publicExportRequest).build(),
            requestOptions,
        )

    /** @see create */
    fun create(publicExportRequest: PublicExportRequest): TaskLocator =
        create(publicExportRequest, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /crm/v3/exports/export/async`, but is otherwise the
         * same as [ExportService.create].
         */
        @MustBeClosed
        fun create(params: ExportCreateParams): HttpResponseFor<TaskLocator> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaskLocator>

        /** @see create */
        @MustBeClosed
        fun create(
            publicExportRequest: PublicExportRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TaskLocator> =
            create(
                ExportCreateParams.builder().publicExportRequest(publicExportRequest).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(publicExportRequest: PublicExportRequest): HttpResponseFor<TaskLocator> =
            create(publicExportRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /crm/v3/exports/export/async/tasks/{taskId}/status`,
         * but is otherwise the same as [ExportService.getStatus].
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
