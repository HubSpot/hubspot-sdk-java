// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.featureflags

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface PortalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortalService

    /** Specify an account-level flag state for a specific HubSpot account. */
    fun update(portalId: Int, params: PortalUpdateParams): PortalFlagStateResponse =
        update(portalId, params, RequestOptions.none())

    /** @see update */
    fun update(
        portalId: Int,
        params: PortalUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse =
        update(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see update */
    fun update(params: PortalUpdateParams): PortalFlagStateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PortalUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse

    /**
     * Delete an account-level flag state for a specific HubSpot account. No request body is
     * included.
     */
    fun delete(portalId: Int, params: PortalDeleteParams): PortalFlagStateResponse =
        delete(portalId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        portalId: Int,
        params: PortalDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse =
        delete(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see delete */
    fun delete(params: PortalDeleteParams): PortalFlagStateResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PortalDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse

    /**
     * Delete an account-level flag state for multiple HubSpot accounts at once. Use this endpoint
     * to manage flag exposure for groups of HubSpot accounts.
     */
    fun batchDelete(
        flagName: String,
        params: PortalBatchDeleteParams,
    ): PortalFlagStateBatchResponse = batchDelete(flagName, params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        flagName: String,
        params: PortalBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateBatchResponse =
        batchDelete(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see batchDelete */
    fun batchDelete(params: PortalBatchDeleteParams): PortalFlagStateBatchResponse =
        batchDelete(params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        params: PortalBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateBatchResponse

    /**
     * Set the portal flag state for multiple HubSpot accounts at once. Use this endpoint to manage
     * flag exposure for groups of HubSpot accounts.
     */
    fun batchUpsert(
        flagName: String,
        params: PortalBatchUpsertParams,
    ): PortalFlagStateBatchResponse = batchUpsert(flagName, params, RequestOptions.none())

    /** @see batchUpsert */
    fun batchUpsert(
        flagName: String,
        params: PortalBatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateBatchResponse =
        batchUpsert(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see batchUpsert */
    fun batchUpsert(params: PortalBatchUpsertParams): PortalFlagStateBatchResponse =
        batchUpsert(params, RequestOptions.none())

    /** @see batchUpsert */
    fun batchUpsert(
        params: PortalBatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateBatchResponse

    /** Retrieve the account-level flag state of a specific HubSpot account. */
    fun get(portalId: Int, params: PortalGetParams): PortalFlagStateResponse =
        get(portalId, params, RequestOptions.none())

    /** @see get */
    fun get(
        portalId: Int,
        params: PortalGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse = get(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see get */
    fun get(params: PortalGetParams): PortalFlagStateResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PortalGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateResponse

    /** A view of [PortalService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the same
         * as [PortalService.update].
         */
        @MustBeClosed
        fun update(
            portalId: Int,
            params: PortalUpdateParams,
        ): HttpResponseFor<PortalFlagStateResponse> =
            update(portalId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            portalId: Int,
            params: PortalUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse> =
            update(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PortalUpdateParams): HttpResponseFor<PortalFlagStateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PortalUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the same
         * as [PortalService.delete].
         */
        @MustBeClosed
        fun delete(
            portalId: Int,
            params: PortalDeleteParams,
        ): HttpResponseFor<PortalFlagStateResponse> =
            delete(portalId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            portalId: Int,
            params: PortalDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse> =
            delete(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: PortalDeleteParams): HttpResponseFor<PortalFlagStateResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PortalDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse>

        /**
         * Returns a raw HTTP response for `post
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/batch/delete`, but is otherwise the
         * same as [PortalService.batchDelete].
         */
        @MustBeClosed
        fun batchDelete(
            flagName: String,
            params: PortalBatchDeleteParams,
        ): HttpResponseFor<PortalFlagStateBatchResponse> =
            batchDelete(flagName, params, RequestOptions.none())

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(
            flagName: String,
            params: PortalBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateBatchResponse> =
            batchDelete(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(
            params: PortalBatchDeleteParams
        ): HttpResponseFor<PortalFlagStateBatchResponse> =
            batchDelete(params, RequestOptions.none())

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(
            params: PortalBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateBatchResponse>

        /**
         * Returns a raw HTTP response for `post
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/batch/upsert`, but is otherwise the
         * same as [PortalService.batchUpsert].
         */
        @MustBeClosed
        fun batchUpsert(
            flagName: String,
            params: PortalBatchUpsertParams,
        ): HttpResponseFor<PortalFlagStateBatchResponse> =
            batchUpsert(flagName, params, RequestOptions.none())

        /** @see batchUpsert */
        @MustBeClosed
        fun batchUpsert(
            flagName: String,
            params: PortalBatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateBatchResponse> =
            batchUpsert(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see batchUpsert */
        @MustBeClosed
        fun batchUpsert(
            params: PortalBatchUpsertParams
        ): HttpResponseFor<PortalFlagStateBatchResponse> =
            batchUpsert(params, RequestOptions.none())

        /** @see batchUpsert */
        @MustBeClosed
        fun batchUpsert(
            params: PortalBatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateBatchResponse>

        /**
         * Returns a raw HTTP response for `get
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the same
         * as [PortalService.get].
         */
        @MustBeClosed
        fun get(portalId: Int, params: PortalGetParams): HttpResponseFor<PortalFlagStateResponse> =
            get(portalId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            portalId: Int,
            params: PortalGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse> =
            get(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: PortalGetParams): HttpResponseFor<PortalFlagStateResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PortalGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateResponse>
    }
}
