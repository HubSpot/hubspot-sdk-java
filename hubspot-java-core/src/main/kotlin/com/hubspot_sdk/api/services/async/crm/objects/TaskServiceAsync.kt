// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.objects

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.crm.objects.tasks.TaskDeleteParams
import com.hubspot_sdk.api.services.async.crm.objects.tasks.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TaskServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaskServiceAsync

    fun batch(): BatchServiceAsync

    /** Move an Object identified by `{taskId}` to the recycling bin. */
    fun delete(objectId: String, params: TaskDeleteParams): CompletableFuture<Void?> =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: TaskDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(params: TaskDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TaskDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [TaskServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaskServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/{objectType}/{objectId}`,
         * but is otherwise the same as [TaskServiceAsync.delete].
         */
        fun delete(objectId: String, params: TaskDeleteParams): CompletableFuture<HttpResponse> =
            delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: TaskDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(params: TaskDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TaskDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
