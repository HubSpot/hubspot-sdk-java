// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.featureflags

import com.google.errorprone.annotations.MustBeClosed
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
    fun update(portalId: Int, params: PortalUpdateParams): PortalUpdateResponse =
        update(portalId, params, RequestOptions.none())

    /** @see update */
    fun update(
        portalId: Int,
        params: PortalUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalUpdateResponse = update(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see update */
    fun update(params: PortalUpdateParams): PortalUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PortalUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalUpdateResponse

    /**
     * Delete an account-level flag state for a specific HubSpot account. No request body is
     * included.
     */
    fun delete(portalId: Int, params: PortalDeleteParams): PortalDeleteResponse =
        delete(portalId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        portalId: Int,
        params: PortalDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalDeleteResponse = delete(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see delete */
    fun delete(params: PortalDeleteParams): PortalDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PortalDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalDeleteResponse

    /**
     * Delete an account-level flag state for multiple HubSpot accounts at once. Use this endpoint
     * to manage flag exposure for groups of HubSpot accounts.
     */
    fun batchDelete(flagName: String, params: PortalBatchDeleteParams): PortalBatchDeleteResponse =
        batchDelete(flagName, params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        flagName: String,
        params: PortalBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalBatchDeleteResponse =
        batchDelete(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see batchDelete */
    fun batchDelete(params: PortalBatchDeleteParams): PortalBatchDeleteResponse =
        batchDelete(params, RequestOptions.none())

    /** @see batchDelete */
    fun batchDelete(
        params: PortalBatchDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalBatchDeleteResponse

    /**
     * Set the portal flag state for multiple HubSpot accounts at once. Use this endpoint to manage
     * flag exposure for groups of HubSpot accounts.
     */
    fun batchUpsert(flagName: String, params: PortalBatchUpsertParams): PortalBatchUpsertResponse =
        batchUpsert(flagName, params, RequestOptions.none())

    /** @see batchUpsert */
    fun batchUpsert(
        flagName: String,
        params: PortalBatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalBatchUpsertResponse =
        batchUpsert(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see batchUpsert */
    fun batchUpsert(params: PortalBatchUpsertParams): PortalBatchUpsertResponse =
        batchUpsert(params, RequestOptions.none())

    /** @see batchUpsert */
    fun batchUpsert(
        params: PortalBatchUpsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalBatchUpsertResponse

    /** Retrieve the account-level flag state of a specific HubSpot account. */
    fun get(portalId: Int, params: PortalGetParams): PortalGetResponse =
        get(portalId, params, RequestOptions.none())

    /** @see get */
    fun get(
        portalId: Int,
        params: PortalGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalGetResponse = get(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see get */
    fun get(params: PortalGetParams): PortalGetResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PortalGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalGetResponse

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
        ): HttpResponseFor<PortalUpdateResponse> = update(portalId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            portalId: Int,
            params: PortalUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalUpdateResponse> =
            update(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PortalUpdateParams): HttpResponseFor<PortalUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PortalUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the same
         * as [PortalService.delete].
         */
        @MustBeClosed
        fun delete(
            portalId: Int,
            params: PortalDeleteParams,
        ): HttpResponseFor<PortalDeleteResponse> = delete(portalId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            portalId: Int,
            params: PortalDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalDeleteResponse> =
            delete(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: PortalDeleteParams): HttpResponseFor<PortalDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PortalDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalDeleteResponse>

        /**
         * Returns a raw HTTP response for `post
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/batch/delete`, but is otherwise the
         * same as [PortalService.batchDelete].
         */
        @MustBeClosed
        fun batchDelete(
            flagName: String,
            params: PortalBatchDeleteParams,
        ): HttpResponseFor<PortalBatchDeleteResponse> =
            batchDelete(flagName, params, RequestOptions.none())

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(
            flagName: String,
            params: PortalBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalBatchDeleteResponse> =
            batchDelete(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(
            params: PortalBatchDeleteParams
        ): HttpResponseFor<PortalBatchDeleteResponse> = batchDelete(params, RequestOptions.none())

        /** @see batchDelete */
        @MustBeClosed
        fun batchDelete(
            params: PortalBatchDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalBatchDeleteResponse>

        /**
         * Returns a raw HTTP response for `post
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/batch/upsert`, but is otherwise the
         * same as [PortalService.batchUpsert].
         */
        @MustBeClosed
        fun batchUpsert(
            flagName: String,
            params: PortalBatchUpsertParams,
        ): HttpResponseFor<PortalBatchUpsertResponse> =
            batchUpsert(flagName, params, RequestOptions.none())

        /** @see batchUpsert */
        @MustBeClosed
        fun batchUpsert(
            flagName: String,
            params: PortalBatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalBatchUpsertResponse> =
            batchUpsert(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see batchUpsert */
        @MustBeClosed
        fun batchUpsert(
            params: PortalBatchUpsertParams
        ): HttpResponseFor<PortalBatchUpsertResponse> = batchUpsert(params, RequestOptions.none())

        /** @see batchUpsert */
        @MustBeClosed
        fun batchUpsert(
            params: PortalBatchUpsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalBatchUpsertResponse>

        /**
         * Returns a raw HTTP response for `get
         * /feature-flags/v3/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the same
         * as [PortalService.get].
         */
        @MustBeClosed
        fun get(portalId: Int, params: PortalGetParams): HttpResponseFor<PortalGetResponse> =
            get(portalId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            portalId: Int,
            params: PortalGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalGetResponse> =
            get(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: PortalGetParams): HttpResponseFor<PortalGetResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PortalGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalGetResponse>
    }
}
