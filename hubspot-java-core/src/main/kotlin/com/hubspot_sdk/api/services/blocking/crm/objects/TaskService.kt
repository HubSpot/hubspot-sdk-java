// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.crm.objects.tasks.TaskDeleteParams
import com.hubspot_sdk.api.services.blocking.crm.objects.tasks.BatchService
import java.util.function.Consumer

interface TaskService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaskService

    fun batch(): BatchService

    /** Move an Object identified by `{taskId}` to the recycling bin. */
    fun delete(objectId: String, params: TaskDeleteParams) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: TaskDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(params: TaskDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TaskDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [TaskService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaskService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/{objectType}/{objectId}`,
         * but is otherwise the same as [TaskService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String, params: TaskDeleteParams): HttpResponse =
            delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: TaskDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: TaskDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TaskDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
