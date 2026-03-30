// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.featureflags

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateBatchResponse
import com.hubspot_sdk.api.models.crm.featureflags.batch.BatchDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.batch.BatchUpsertParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BatchServiceAsync

    /**
     * Delete an account-level flag state for multiple HubSpot accounts at once. Use this endpoint
     * to manage flag exposure for groups of HubSpot accounts.
     */
    fun delete(
        flagName: String,
        params: BatchDeleteParams,
    ): CompletableFuture<PortalFlagStateBatchResponse> =
        delete(flagName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        flagName: String,
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateBatchResponse> =
        delete(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see delete */
    fun delete(params: BatchDeleteParams): CompletableFuture<PortalFlagStateBatchResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateBatchResponse>

    /**
     * Set the portal flag state for multiple HubSpot accounts at once. Use this endpoint to manage
     * flag exposure for groups of HubSpot accounts.
     */
    fun upsert(
        flagName: String,
        params: BatchUpsertParams,
    ): CompletableFuture<PortalFlagStateBatchResponse> =
        upsert(flagName, params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        flagName: String,
        params: BatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateBatchResponse> =
        upsert(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see upsert */
    fun upsert(params: BatchUpsertParams): CompletableFuture<PortalFlagStateBatchResponse> =
        upsert(params, RequestOptions.none())

    /** @see upsert */
    fun upsert(
        params: BatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateBatchResponse>

    /** A view of [BatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/batch/delete`, but is otherwise
         * the same as [BatchServiceAsync.delete].
         */
        fun delete(
            flagName: String,
            params: BatchDeleteParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            delete(flagName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            flagName: String,
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            delete(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: BatchDeleteParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/batch/upsert`, but is otherwise
         * the same as [BatchServiceAsync.upsert].
         */
        fun upsert(
            flagName: String,
            params: BatchUpsertParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            upsert(flagName, params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            flagName: String,
            params: BatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            upsert(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see upsert */
        fun upsert(
            params: BatchUpsertParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            upsert(params, RequestOptions.none())

        /** @see upsert */
        fun upsert(
            params: BatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>>
    }
}
