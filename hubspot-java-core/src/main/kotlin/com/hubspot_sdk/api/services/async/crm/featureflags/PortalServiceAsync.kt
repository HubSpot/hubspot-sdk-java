// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.featureflags

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateBatchResponse
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateResponse
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchUpsertParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalGetParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PortalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortalServiceAsync

    /** Specify an account-level flag state for a specific HubSpot account. */
    fun update(
        portalId: Int,
        params: PortalUpdateParams,
    ): CompletableFuture<PortalFlagStateResponse> = update(portalId, params, RequestOptions.none())

    /** @see update */
    fun update(
        portalId: Int,
        params: PortalUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse> =
        update(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see update */
    fun update(params: PortalUpdateParams): CompletableFuture<PortalFlagStateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PortalUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse>

    /**
     * Delete an account-level flag state for a specific HubSpot account. No request body is
     * included.
     */
    fun delete(
        portalId: Int,
        params: PortalDeleteParams,
    ): CompletableFuture<PortalFlagStateResponse> = delete(portalId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        portalId: Int,
        params: PortalDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse> =
        delete(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see delete */
    fun delete(params: PortalDeleteParams): CompletableFuture<PortalFlagStateResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PortalDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse>

    /**
     * Delete an account-level flag state for multiple HubSpot accounts at once. Use this endpoint
     * to manage flag exposure for groups of HubSpot accounts.
     */
    fun batchDelete(
        flagName: String,
        params: PortalBatchDeleteParams,
    ): CompletableFuture<PortalFlagStateBatchResponse> =
        batchDelete(flagName, params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        flagName: String,
        params: PortalBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateBatchResponse> =
        batchDelete(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see batchDelete */
    fun batchDelete(
        params: PortalBatchDeleteParams
    ): CompletableFuture<PortalFlagStateBatchResponse> = batchDelete(params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        params: PortalBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateBatchResponse>

    /**
     * Set the portal flag state for multiple HubSpot accounts at once. Use this endpoint to manage
     * flag exposure for groups of HubSpot accounts.
     */
    fun batchUpsert(
        flagName: String,
        params: PortalBatchUpsertParams,
    ): CompletableFuture<PortalFlagStateBatchResponse> =
        batchUpsert(flagName, params, RequestOptions.none())

    /** @see batchUpsert */
    fun batchUpsert(
        flagName: String,
        params: PortalBatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateBatchResponse> =
        batchUpsert(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see batchUpsert */
    fun batchUpsert(
        params: PortalBatchUpsertParams
    ): CompletableFuture<PortalFlagStateBatchResponse> = batchUpsert(params, RequestOptions.none())

    /** @see batchUpsert */
    fun batchUpsert(
        params: PortalBatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateBatchResponse>

    /** Retrieve the account-level flag state of a specific HubSpot account. */
    fun get(portalId: Int, params: PortalGetParams): CompletableFuture<PortalFlagStateResponse> =
        get(portalId, params, RequestOptions.none())

    /** @see get */
    fun get(
        portalId: Int,
        params: PortalGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse> =
        get(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see get */
    fun get(params: PortalGetParams): CompletableFuture<PortalFlagStateResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PortalGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse>

    /**
     * A view of [PortalServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the same
         * as [PortalServiceAsync.update].
         */
        fun update(
            portalId: Int,
            params: PortalUpdateParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            update(portalId, params, RequestOptions.none())

        /** @see update */
        fun update(
            portalId: Int,
            params: PortalUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            update(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see update */
        fun update(
            params: PortalUpdateParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PortalUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the same
         * as [PortalServiceAsync.delete].
         */
        fun delete(
            portalId: Int,
            params: PortalDeleteParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            delete(portalId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            portalId: Int,
            params: PortalDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            delete(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: PortalDeleteParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PortalDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/batch/delete`, but is otherwise the
         * same as [PortalServiceAsync.batchDelete].
         */
        fun batchDelete(
            flagName: String,
            params: PortalBatchDeleteParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            batchDelete(flagName, params, RequestOptions.none())

        /** @see batchDelete */
        fun batchDelete(
            flagName: String,
            params: PortalBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            batchDelete(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see batchDelete */
        fun batchDelete(
            params: PortalBatchDeleteParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            batchDelete(params, RequestOptions.none())

        /** @see batchDelete */
        fun batchDelete(
            params: PortalBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/batch/upsert`, but is otherwise the
         * same as [PortalServiceAsync.batchUpsert].
         */
        fun batchUpsert(
            flagName: String,
            params: PortalBatchUpsertParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            batchUpsert(flagName, params, RequestOptions.none())

        /** @see batchUpsert */
        fun batchUpsert(
            flagName: String,
            params: PortalBatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            batchUpsert(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see batchUpsert */
        fun batchUpsert(
            params: PortalBatchUpsertParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            batchUpsert(params, RequestOptions.none())

        /** @see batchUpsert */
        fun batchUpsert(
            params: PortalBatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the same
         * as [PortalServiceAsync.get].
         */
        fun get(
            portalId: Int,
            params: PortalGetParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            get(portalId, params, RequestOptions.none())

        /** @see get */
        fun get(
            portalId: Int,
            params: PortalGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            get(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see get */
        fun get(
            params: PortalGetParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PortalGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>>
    }
}
