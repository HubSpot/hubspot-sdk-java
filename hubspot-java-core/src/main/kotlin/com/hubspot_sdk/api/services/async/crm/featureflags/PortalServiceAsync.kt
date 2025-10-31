// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.featureflags

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchDeleteResponse
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchUpsertParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalBatchUpsertResponse
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalDeleteResponse
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalGetParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalGetResponse
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalUpdateParams
import com.hubspot_sdk.api.models.crm.featureflags.portals.PortalUpdateResponse
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
    fun update(portalId: Int, params: PortalUpdateParams): CompletableFuture<PortalUpdateResponse> =
        update(portalId, params, RequestOptions.none())

    /** @see update */
    fun update(
        portalId: Int,
        params: PortalUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalUpdateResponse> =
        update(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see update */
    fun update(params: PortalUpdateParams): CompletableFuture<PortalUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PortalUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalUpdateResponse>

    /**
     * Delete an account-level flag state for a specific HubSpot account. No request body is
     * included.
     */
    fun delete(portalId: Int, params: PortalDeleteParams): CompletableFuture<PortalDeleteResponse> =
        delete(portalId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        portalId: Int,
        params: PortalDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalDeleteResponse> =
        delete(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see delete */
    fun delete(params: PortalDeleteParams): CompletableFuture<PortalDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PortalDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalDeleteResponse>

    /**
     * Delete an account-level flag state for multiple HubSpot accounts at once. Use this endpoint
     * to manage flag exposure for groups of HubSpot accounts.
     */
    fun batchDelete(
        flagName: String,
        params: PortalBatchDeleteParams,
    ): CompletableFuture<PortalBatchDeleteResponse> =
        batchDelete(flagName, params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        flagName: String,
        params: PortalBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalBatchDeleteResponse> =
        batchDelete(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see batchDelete */
    fun batchDelete(params: PortalBatchDeleteParams): CompletableFuture<PortalBatchDeleteResponse> =
        batchDelete(params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        params: PortalBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalBatchDeleteResponse>

    /**
     * Set the portal flag state for multiple HubSpot accounts at once. Use this endpoint to manage
     * flag exposure for groups of HubSpot accounts.
     */
    fun batchUpsert(
        flagName: String,
        params: PortalBatchUpsertParams,
    ): CompletableFuture<PortalBatchUpsertResponse> =
        batchUpsert(flagName, params, RequestOptions.none())

    /** @see batchUpsert */
    fun batchUpsert(
        flagName: String,
        params: PortalBatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalBatchUpsertResponse> =
        batchUpsert(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see batchUpsert */
    fun batchUpsert(params: PortalBatchUpsertParams): CompletableFuture<PortalBatchUpsertResponse> =
        batchUpsert(params, RequestOptions.none())

    /** @see batchUpsert */
    fun batchUpsert(
        params: PortalBatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalBatchUpsertResponse>

    /** Retrieve the account-level flag state of a specific HubSpot account. */
    fun get(portalId: Int, params: PortalGetParams): CompletableFuture<PortalGetResponse> =
        get(portalId, params, RequestOptions.none())

    /** @see get */
    fun get(
        portalId: Int,
        params: PortalGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalGetResponse> =
        get(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see get */
    fun get(params: PortalGetParams): CompletableFuture<PortalGetResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PortalGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalGetResponse>

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
        ): CompletableFuture<HttpResponseFor<PortalUpdateResponse>> =
            update(portalId, params, RequestOptions.none())

        /** @see update */
        fun update(
            portalId: Int,
            params: PortalUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalUpdateResponse>> =
            update(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see update */
        fun update(
            params: PortalUpdateParams
        ): CompletableFuture<HttpResponseFor<PortalUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PortalUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the same
         * as [PortalServiceAsync.delete].
         */
        fun delete(
            portalId: Int,
            params: PortalDeleteParams,
        ): CompletableFuture<HttpResponseFor<PortalDeleteResponse>> =
            delete(portalId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            portalId: Int,
            params: PortalDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalDeleteResponse>> =
            delete(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: PortalDeleteParams
        ): CompletableFuture<HttpResponseFor<PortalDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PortalDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/batch/delete`, but is otherwise the
         * same as [PortalServiceAsync.batchDelete].
         */
        fun batchDelete(
            flagName: String,
            params: PortalBatchDeleteParams,
        ): CompletableFuture<HttpResponseFor<PortalBatchDeleteResponse>> =
            batchDelete(flagName, params, RequestOptions.none())

        /** @see batchDelete */
        fun batchDelete(
            flagName: String,
            params: PortalBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalBatchDeleteResponse>> =
            batchDelete(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see batchDelete */
        fun batchDelete(
            params: PortalBatchDeleteParams
        ): CompletableFuture<HttpResponseFor<PortalBatchDeleteResponse>> =
            batchDelete(params, RequestOptions.none())

        /** @see batchDelete */
        fun batchDelete(
            params: PortalBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalBatchDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/batch/upsert`, but is otherwise the
         * same as [PortalServiceAsync.batchUpsert].
         */
        fun batchUpsert(
            flagName: String,
            params: PortalBatchUpsertParams,
        ): CompletableFuture<HttpResponseFor<PortalBatchUpsertResponse>> =
            batchUpsert(flagName, params, RequestOptions.none())

        /** @see batchUpsert */
        fun batchUpsert(
            flagName: String,
            params: PortalBatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalBatchUpsertResponse>> =
            batchUpsert(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see batchUpsert */
        fun batchUpsert(
            params: PortalBatchUpsertParams
        ): CompletableFuture<HttpResponseFor<PortalBatchUpsertResponse>> =
            batchUpsert(params, RequestOptions.none())

        /** @see batchUpsert */
        fun batchUpsert(
            params: PortalBatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalBatchUpsertResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the same
         * as [PortalServiceAsync.get].
         */
        fun get(
            portalId: Int,
            params: PortalGetParams,
        ): CompletableFuture<HttpResponseFor<PortalGetResponse>> =
            get(portalId, params, RequestOptions.none())

        /** @see get */
        fun get(
            portalId: Int,
            params: PortalGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalGetResponse>> =
            get(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see get */
        fun get(params: PortalGetParams): CompletableFuture<HttpResponseFor<PortalGetResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PortalGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalGetResponse>>
    }
}
